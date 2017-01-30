package com.endermanapm.minucia;

import com.endermanapm.minucia.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Ender on 29/01/2017.
 */
@Mod(modid = Reference.modId, name = Reference.name, version = Reference.version, acceptedMinecraftVersions = Reference.accepted_versions)
public class minucia {


    @Mod.Instance(Reference.modId)
    public static minucia instance;

    @SidedProxy(clientSide = Reference.client_proxy_class, serverSide = Reference.server_proxy_class)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.name + " is loading!");
        System.out.println("Sup niggers");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
