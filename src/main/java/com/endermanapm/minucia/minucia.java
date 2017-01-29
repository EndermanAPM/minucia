package com.endermanapm.minucia;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Ender on 29/01/2017.
 */
@Mod(modid = minucia.modId, name = minucia.name, version = minucia.version, acceptedMinecraftVersions = "[1.10.2]")
public class minucia {
    public static final String modId = "enderminucia";
    public static final String name = "Minucia";
    public static final String version = "0.0.1";

    @Mod.Instance(modId)
    public static minucia instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        System.out.println("Sup niggers");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
