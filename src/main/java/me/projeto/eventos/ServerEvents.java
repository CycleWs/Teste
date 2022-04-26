package me.projeto.eventos;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerEvents implements Listener {

    @EventHandler
    public void serverPing(ServerListPingEvent e){
        if(!Bukkit.hasWhitelist()) e.setMotd("  §kA"+"  §eVenha jogar no nosso servidor!"+"§r§kA  ");
        else{
            e.setMotd("§4§l    Servidor em manutenção !");
        }
    }
}
