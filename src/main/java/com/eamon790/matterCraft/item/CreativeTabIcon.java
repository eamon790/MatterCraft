package com.eamon790.matterCraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class CreativeTabIcon extends Item
{
    @Override
    public void registerIcons(IIconRegister iconRegister) {
       iconRegister.registerIcon("mattercraft:logo");
    }
}
