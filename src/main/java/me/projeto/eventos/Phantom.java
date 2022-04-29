/*package me.projeto.eventos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


public class Phantom extends JavaPlugin implements Listener {

    @EventHandler
    public void phantom(PlayerInteractEvent c) {
        Player p = c.getPlayer();
        ItemStack item = p.getInventory().getItemInHand();

        if ((c.getAction() == Action.RIGHT_CLICK_AIR) && (item.getItemMeta().getDisplayName().equalsIgnoreCase("§eVoar"))) {

            if (CoolDown.checkCooldown(c.getPlayer())) {
                p.playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 10, 1);
                p.sendMessage("§aVocê está voando por 10 segundos");
                CoolDown.setCooldown(c.getPlayer(), 20);
                p.setAllowFlight(true);
                Bukkit.getScheduler().runTaskLater(this, () -> p.sendMessage("Test"), 100L);
            } else{
                p.sendMessage("§cVocê não pode utilizar o kit por: " + CoolDown.getCooldown(p) + " Segundos");
            }
        }
    }
}*/
