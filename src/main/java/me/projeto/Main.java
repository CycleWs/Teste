package me.projeto;

import me.projeto.Comandos.Comandos;
import me.projeto.Kits.kitVoar;
import me.projeto.eventos.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    @Override
    public void onEnable() {
        CoolDown.setupCooldown();
        registrarComandos();
        registrarEventos();
        Bukkit.getConsoleSender().sendMessage("§e[CyclePlugin] Plugin foi iniciado!");
    }
    public void registrarEventos() {
        Bukkit.getPluginManager().registerEvents(new PlayerEvents(), this);
        Bukkit.getPluginManager().registerEvents(new kitEvents(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new Indropavel(), this);
        //Bukkit.getPluginManager().registerEvents(new Phantom(), this);
    }

    public void registrarComandos(){
        getCommand("kit").setExecutor(new Comandos());
    }


    private void loadConfiguration(){
        getConfig().options().copyDefaults(false);
        saveDefaultConfig();
    }
}

