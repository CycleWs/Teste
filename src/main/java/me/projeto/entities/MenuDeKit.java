package me.projeto.entities;

import me.projeto.Item.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MenuDeKit {
    private Inventory inventory;

    public MenuDeKit(){
        inventory = Bukkit.createInventory(null, 9 * 6 , "§3Escolha o seu kit!");
        insertItens();
    }
    private MenuDeKit insertItens(){
        ItemStack Lenhador = new Item(Material.WOOD_AXE, 1, (short) 0).setName("Kit Lenhador").getItemstack();
        ItemStack Voar = new Item(Material.FEATHER, 1,(short)0).setName("Kit Voar").getItemstack();
        ItemStack LancaPocoes = new Item(Material.STICK, 1,(short)0).setName("Kit Magico").getItemstack();

        inventory.setItem(11,Lenhador);
        inventory.setItem(13,Voar);
        inventory.setItem(15,LancaPocoes);

        return this;
    }

    public Inventory getInventory() {
        return inventory;
    }


}
