package io.github.mspacedev.proxies;

import io.github.mspacedev.handlers.RenderEventHandler;
import io.github.mspacedev.init.InitEntities;
import io.github.mspacedev.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright © MSpace-Dev 2017
 * Do not distribute without proper permission from the author.
 * https://mspace-dev.github.io
 */

public class CommonProxy {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Utils.getLogger().info("MONSTER TOTEMS READY TO GO, SINCE 2017!");
    }

    public void genMagicParticle(Block block, BlockPos pos, float colorRed, float colorGreen, float colorBlue) {}
}
