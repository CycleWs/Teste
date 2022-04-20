package me.projeto.eventos;

/*import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.UUID;

public class Phantom implements Listener {
    private HashMap<UUID, Long> cooldown = new HashMap<UUID,Long>();
    private int cooldowntime = 10;

    @EventHandler
    public void fazVoar(PlayerInteractEvent d){
        Player p = d.getPlayer();
        ItemStack i = p.getInventory().getItemInHand();

        if(d.getAction() == Action.RIGHT_CLICK_AIR){
            if(cooldown.containsKey(p.getUniqueId())){
                long secondsLeft = ((cooldown.get(p.getUniqueId())/1000) + cooldowntime) -(System.currentTimeMillis()/1000);

                if(secondsLeft > 0){
                    p.sendMessage("Você não pode usar o kit por:"+secondsLeft);
                    p.setAllowFlight(true);
                    p.setFlying(true);
                }
            }else{
                p.sendMessage("Voce ta em cooldown: "+cooldowntime);
                cooldown.put(p.getUniqueId(),System.currentTimeMillis());
                p.setAllowFlight(false);
                p.setFlying(false);
            }
        }else{
            long secondsLeft = ((cooldown.get(p.getUniqueId())/1000) + cooldowntime) -(System.currentTimeMillis()/1000);

            if(secondsLeft > 0){
                p.sendMessage("Você não pode usar o kits por:"+secondsLeft);
                p.setAllowFlight(false);
                p.setFlying(false);
            }
        }
    }
}*/
