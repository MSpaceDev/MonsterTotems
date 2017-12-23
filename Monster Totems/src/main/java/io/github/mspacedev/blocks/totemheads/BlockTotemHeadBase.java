package io.github.mspacedev.blocks.totemheads;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import io.github.mspacedev.blocks.BlockWoodBase;
import io.github.mspacedev.blocks.ModBlocks;
import io.github.mspacedev.tiles.TileEntityTotemBase;
import io.github.mspacedev.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Copyright © MSpace-Dev 2017
 * Do not distribute without proper permission from the author.
 * https://mspace-dev.github.io
 */

public class BlockTotemHeadBase extends BlockWoodBase {
    public BlockTotemHeadBase(String name, Material materialIn) {
        super(name, materialIn);
    }

    // Looks for totem bases below and sets totem properties based on what totem head it is.
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        Iterable<BlockPos> totemBaseRange = BlockPos.getAllInBox(pos, pos.add(0.0D, -12.0D, 0.0D));

        if(!worldIn.isRemote) {
            for (BlockPos posRange : totemBaseRange) {
                if (worldIn.getTileEntity(posRange) != null) {
                    if (worldIn.getTileEntity(posRange) instanceof TileEntityTotemBase) {
                        TileEntityTotemBase totem_base = (TileEntityTotemBase) worldIn.getTileEntity(posRange);
                        totem_base.setTotemProperties();
                        break;
                    }
                }
            }
        }

        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        Iterable<BlockPos> totemBaseRange = BlockPos.getAllInBox(pos, pos.add(0.0D, -12.0D, 0.0D));

        if(!worldIn.isRemote) {
            for (BlockPos posRange : totemBaseRange) {
                if (worldIn.getTileEntity(posRange) != null) {
                    if (worldIn.getTileEntity(posRange) instanceof TileEntityTotemBase) {
                        TileEntityTotemBase totem_base = (TileEntityTotemBase) worldIn.getTileEntity(posRange);
                        totem_base.setTotemProperties();
                        break;
                    }
                }
            }
        }

        super.breakBlock(worldIn, pos, state);
    }


}