package me.projeto.eventos;

import me.projeto.Item.Item;
import me.projeto.entities.MenuDeKit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PlayerEvents implements Listener {
    @EventHandler
    public void quandoPlayerEntra(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("§2 bem vindo Se divirta");
        ItemStack seletorKits = new Item(Material.NETHER_STAR, 1, (short)0)
                .setName("§eSeletor De Kits")
                .setLore(List.of("§3Escolha o seu Kits!")).getItemstack();

        p.getInventory().addItem(seletorKits);

    }
    @EventHandler
    public void quandoPlayerSair(PlayerQuitEvent e){
        Player p = e.getPlayer();
        p.getInventory().clear();
    }
    @EventHandler
    public void seletorDeKits(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR){
            ItemStack i = p.getInventory().getItemInHand();
            if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§eSeletor De Kits")){
                p.openInventory(new MenuDeKit().getInventory());
            }
        }
    }
}
