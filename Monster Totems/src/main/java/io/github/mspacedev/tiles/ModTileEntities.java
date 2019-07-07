package io.github.mspacedev.tiles;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright © MSpaceDev 2019
 * Do not distribute without proper permission from the author.
 * https://mspace-dev.github.io
 */

public class ModTileEntities
{
	public static void init()
	{
		GameRegistry.registerTileEntity(TileEntityTotemBaseI.class, "totem_base_i");
		GameRegistry.registerTileEntity(TileEntityTotemBaseII.class, "totem_base_ii");
		GameRegistry.registerTileEntity(TileEntityTotemBaseIII.class, "totem_base_iii");
		GameRegistry.registerTileEntity(TileEntityInfusedLog.class, "infused_log");
	}
}
