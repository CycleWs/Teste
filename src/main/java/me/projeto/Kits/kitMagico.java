package me.projeto.Kits;

import me.projeto.Item.Item;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class kitMagico implements Projectile {
    public static ItemStack wand;

    public static boolean Magico(Player p){
        ItemStack Bussola = new ItemStack(Material.COMPASS);
        wand = new Item(Material.STICK, 1, (short) 0)
                .setName("§aVarinha Mágica")
                .setLore(List.of("§3Lançe poções boas com o botão esquerdo!", "§clance poções ruins com o botão direito"))
                .getItemstack();

        p.sendMessage("§aVocê selecionou o kit Magico");
        p.getInventory().clear();
        p.getInventory().addItem(wand);
        p.getInventory().addItem(Bussola);
        return true;
    }
    public static void efeitoMagico(PlayerInteractEvent e){
        Player p = e.getPlayer();

        if(e.getAction() == Action.RIGHT_CLICK_AIR){
            if(e.getItem() != null){
                ItemStack i = e.getItem();
                if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§aVarinha Mágica")){
                    ThrownPotion LP = (ThrownPotion) p.getWorld().spawnEntity(p.getLocation(), EntityType.SPLASH_POTION);

                }
            }
        }
    }
}
