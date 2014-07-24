package com.eamon790.matterCraft.creativetab;

import com.eamon790.matterCraft.init.ModItems;
import com.eamon790.matterCraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabMatterCraft
{
    public static final CreativeTabs MATTERCRAFT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() { return ModItems.creativeTabIcon; }

    };

}
