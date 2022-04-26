package me.projeto.kits;

import me.projeto.Item.Item;
import me.projeto.eventos.CoolDown;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;


public abstract class kitVoar {
    private HashMap<UUID, Long> cooldown = new HashMap<UUID,Long>();
    private int cooldowntime = 10;

    public static ItemStack pena;

    public static boolean Voar(Player p) {
        ItemStack bussola = new Item(Material.COMPASS, 1, (short) 0).getItemstack();
        pena = new Item(Material.FEATHER, 1, (short) 0)
                .setName("§eVoar").setLore(List.of("§3Clique com o botão direito para voar!"))
                .getItemstack();

        p.sendMessage("§aVocê selecionou o kit Voar");
        p.getInventory().clear();
        p.getInventory().addItem(pena);
        p.getInventory().addItem(bussola);
        return true;
    }


    public static void efeitoVoar(PlayerInteractEvent c) {
        final Player p = c.getPlayer();
        ItemStack item = p.getInventory().getItemInHand();

            if ((c.getAction() == Action.RIGHT_CLICK_AIR) && (item.getItemMeta().getDisplayName().equalsIgnoreCase("§eVoar"))) {

                if (CoolDown.checkCooldown(c.getPlayer())) {
                    p.playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 10, 1);
                    p.sendMessage("§aVocê está voando por 10 segundos");
                    CoolDown.setCooldown(c.getPlayer(), 20);
                    p.setAllowFlight(true);
                    p.setFlying(true);
                } else{
                    p.sendMessage("§cVocê não pode utilizar o kit por: " + CoolDown.getCooldown(p) + " Segundos");
                }
            }
        }
    }

