package me.projeto.kits;

import me.projeto.Item.Item;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public abstract class kitLenhador {
    public static ItemStack treeCapitator;

    public static boolean Lenhador(Player p){
        ItemStack Bussola = new ItemStack(Material.COMPASS);
        treeCapitator = new Item(Material.WOOD_AXE, 1, (short) 0)
                .setName("§eTreecapitator")
                .setLore(List.of("§3Quebre uma arvore para pegar todas as madeiras!"))
                .setInquebravel()
                .getItemstack();

        p.sendMessage("§aVocê selecionou o kit Lenhador");
        p.getInventory().clear();
        p.getInventory().addItem(treeCapitator);
        p.getInventory().addItem(Bussola);
        return true;
    }
    public static void breakTree(Block tree){
        if(tree.getType()!=Material.LOG && tree.getType()!= Material.LOG_2) return;
        tree.breakNaturally();
        for(BlockFace face: BlockFace.values())
            breakTree(tree.getRelative(face));

    }

    public static void efeitoLenhador(BlockBreakEvent e){
        Player p = e.getPlayer();
        Block b = e.getBlock();

        if (b.getType() == Material.LOG) {
            ItemStack item = p.getInventory().getItemInHand();
            if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§eTreecapitator")) {
                p.sendMessage("§eVoce quebrou um bloco de madeira!");
                p.addPotionEffect(new PotionEffect((PotionEffectType.SPEED), 20 * 10, 1, false, true));
                p.addPotionEffect(new PotionEffect((PotionEffectType.HEAL), 20 * 8, 1, false, true));
                breakTree(b);
            }
        }
        if (b.getType() == Material.LOG_2) {
            ItemStack item = p.getInventory().getItemInHand();
            if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§eTreecapitator")) {
                p.sendMessage("§eVoce quebrou um bloco de madeira!");
                p.addPotionEffect(new PotionEffect((PotionEffectType.SPEED), 20 * 10, 1, false, true));
                p.addPotionEffect(new PotionEffect((PotionEffectType.HEAL), 20 * 5, 1, false, true));
                breakTree(b);
            }
        }

    }
}
