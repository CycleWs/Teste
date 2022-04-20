package me.projeto.Item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Item {
    private final ItemStack itemstack;
    private final ItemMeta itemmeta;


    public Item(Material m, int quantidade, short data){
        itemstack = new ItemStack(m, quantidade, data);
        itemmeta = itemstack.getItemMeta();
    }

    public Item setName(String nome){
        itemmeta.setDisplayName(nome.replace("&", "§"));
        itemstack.setItemMeta((itemmeta));
        return this;
    }

    public Item setLore(List<String> lore){
        itemmeta.setLore(lore);
        itemstack.setItemMeta(itemmeta);
        return this;
    }

    public Item setEncanto(Enchantment encanto, int forca){
        itemmeta.addEnchant(encanto, forca, false);
        itemstack.setItemMeta(itemmeta);
        return this;
    }
    /*public Item deixaInquebravel(){
        itemmeta.setUnbreakable(true);
        itemstack.setItemMeta(itemmeta);
        return this;
    }*/
    public Item escondeEncanto(){
        itemmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemstack.setItemMeta(itemmeta);
        return this;
    }

    public ItemStack getItemstack() {
        return itemstack;
    }
}
