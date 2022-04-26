package me.projeto.eventos;

import me.projeto.kits.kitLenhador;
import me.projeto.kits.kitMagico;
import me.projeto.kits.kitVoar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {

    @EventHandler
    public void quandoClicar(InventoryClickEvent e){
        if(!e.getInventory().getName().equalsIgnoreCase("§3Escolha o seu Kit!"))return;
            e.setCancelled(true);


        ItemStack i = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();

        if (i.getItemMeta().getDisplayName().equalsIgnoreCase("Kit Lenhador")) {
            p.closeInventory();
            kitLenhador.Lenhador(p);
        }
        if (i.getItemMeta().getDisplayName().equalsIgnoreCase("Kit Voar")){
            p.closeInventory();
            kitVoar.Voar(p);
        }
        if (i.getItemMeta().getDisplayName().equalsIgnoreCase("Kit Magico")){
            p.closeInventory();
            kitMagico.Magico(p);
        }

    }
}

