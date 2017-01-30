package com.endermanapm.minucia.items;

import com.endermanapm.minucia.Reference;
import net.minecraft.item.Item;
/**
 * Created by Ender on 30/01/2017.
 */
public class ItemCheese extends Item{

    public ItemCheese() {
        setUnlocalizedName(Reference.TutorialItems.CHEESE.getUnlocalizedName());
        setRegistryName(Reference.TutorialItems.CHEESE.getRegistryName());
    }
}
