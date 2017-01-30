package com.endermanapm.minucia.init;

import com.endermanapm.minucia.Reference;
import com.endermanapm.minucia.items.ItemCheese;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.MinecraftDummyContainer;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ender on 30/01/2017.
 */
public class ModItems {
    public static Item cheese;

    public static void init()
    {
        cheese = new ItemCheese();
    }
    public static void register()
    {
        GameRegistry.register(cheese);

    }
    public static void registerRenders()
    {
        registerRender(cheese);
    }
    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
}
