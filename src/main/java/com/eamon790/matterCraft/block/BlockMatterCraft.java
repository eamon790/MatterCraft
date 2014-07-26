package com.eamon790.matterCraft.block;

import com.eamon790.matterCraft.creativetab.CreativeTabMatterCraft;
import com.eamon790.matterCraft.reference.Reference;
import com.eamon790.matterCraft.reference.Resources;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMatterCraft extends Block
{

    public BlockMatterCraft(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabMatterCraft.MATTERCRAFT_TAB);
    }
    public BlockMatterCraft()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Resources.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.') + 1));
    }
}
