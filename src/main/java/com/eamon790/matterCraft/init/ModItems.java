package com.eamon790.matterCraft.init;

import com.eamon790.matterCraft.item.CreativeTabIcon;
import com.eamon790.matterCraft.item.ItemMatterCraft;
import com.eamon790.matterCraft.item.ItemTest;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static final Item creativeTabIcon = new CreativeTabIcon();
    public static final ItemMatterCraft itemTest = new ItemTest();

    public static void init()
    {
        GameRegistry.registerItem(itemTest, itemTest.getUnlocalizedName());
    }
}
