package me.projeto.eventos;

import me.projeto.kits.kitLenhador;
import me.projeto.kits.kitMagico;
import me.projeto.kits.kitVoar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class kitEvents implements Listener {
    @EventHandler
    public void ativaVoar(PlayerInteractEvent p){
        kitVoar.efeitoVoar(p);
    }
    @EventHandler
    public void ativaLenhador(BlockBreakEvent p){
        kitLenhador.efeitoLenhador(p);
    }
    @EventHandler
    public void ativaMagico(PlayerInteractEvent p){
        kitMagico.efeitoMagico(p);
    }
}
