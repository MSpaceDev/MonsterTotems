package io.github.mspacedev.blocks;

import io.github.mspacedev.MonsterTotems;
import io.github.mspacedev.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © MSpace-Dev 2017
 * Do not distribute without proper permission from the author.
 * https://mspace-dev.github.io
 */

public class BlockBase extends Block {
    private String tooltipText;

    public BlockBase(String name, Material materialIn) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(Reference.MODID, name));
        this.setCreativeTab(MonsterTotems.creativeTab);
    }

    public BlockBase(String name, Material materialIn, String tooltip) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(Reference.MODID, name));
        this.setCreativeTab(MonsterTotems.creativeTab);
        this.tooltipText = tooltip;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        if(tooltipText == null){
            tooltip.add(I18n.format("tooltip.missing"));
        }

        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            tooltip.add(I18n.format(tooltipText));
        } else {
            tooltip.add(I18n.format("tooltip.shift"));
        }
        super.addInformation(stack, player, tooltip, advanced);
    }
}
