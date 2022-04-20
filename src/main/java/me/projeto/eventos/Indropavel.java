package me.projeto.eventos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import static me.projeto.Kits.kitLenhador.treeCapitator;
import static me.projeto.Kits.kitMagico.wand;
import static me.projeto.Kits.kitVoar.pena;

public class Indropavel implements Listener {
    @EventHandler
    public static void onDrop(PlayerDropItemEvent e) {
        if (e.getItemDrop().getItemStack().isSimilar(pena)) e.setCancelled(true);
        if (e.getItemDrop().getItemStack().isSimilar(wand)) e.setCancelled(true);
        if (e.getItemDrop().getItemStack().isSimilar(treeCapitator)) e.setCancelled(true);
    }
}