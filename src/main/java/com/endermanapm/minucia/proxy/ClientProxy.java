package com.endermanapm.minucia.proxy;

import com.endermanapm.minucia.init.ModItems;

/**
 * Created by Ender on 30/01/2017.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void init()
    {
        ModItems.registerRenders();

    }
}
