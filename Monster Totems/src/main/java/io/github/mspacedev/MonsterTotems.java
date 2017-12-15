package io.github.mspacedev;

import io.github.mspacedev.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright © MSpace-Dev 2017
 * Do not distribute without proper permission from the author.
 * https://mspace-dev.github.io
 */

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION )
public class MonsterTotems {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY, modId = Reference.MODID)
    public static CommonProxy proxy;


    public static void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    public static void init(FMLInitializationEvent event){

    }

    public static void postInit(FMLPostInitializationEvent event){

    }
}