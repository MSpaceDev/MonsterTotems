/*
 *  Copyright © MSpaceDev 2019
 *  Do not distribute without proper permission from the author.
 *
 *  If you would like to contribute, create a pull request:
 *  https://github.com/MSpaceDev/MonsterTotems
 */

package io.github.mspacedev.blocks.infusedlogs;

import io.github.mspacedev.MonsterTotems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockCreeperInfusedLog extends BlockInfusedLog
{
	public BlockCreeperInfusedLog(String name, Material materialIn)
	{
		super(name, materialIn, "tooltip.creeper_infused_log");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		MonsterTotems.proxy.genMagicParticle(this, pos, 0, 255, 0);
		super.randomDisplayTick(stateIn, worldIn, pos, rand);
	}
}
