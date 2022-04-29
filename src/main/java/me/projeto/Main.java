package me.projeto;

import me.projeto.comandos.Comandos;
import me.projeto.eventos.*;
import me.projeto.kits.kitVoar;
import org.bukkit.Bukkit;
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
        Bukkit.getPluginManager().registerEvents(new ServerEvents(), this);
        Bukkit.getPluginManager().registerEvents(new kitVoar(), this);
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

