package com.eamon790.matterCraft.init;

import com.eamon790.matterCraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMatterCraft itemScrewDriver = new ItemScrewDriver();
    public static final ItemMatterCraft itemIngotCopper = new ItemIngotCopper();
    public static final ItemMatterCraft itemEnergyTransmitter = new ItemEnergyTransmitter();
    public static final ItemMatterCraft itemEnergyTransceiver = new ItemEnergyTransceiver();
    public static final ItemMatterCraft itemEnergyReceiver = new ItemEnergyReceiver();
    public static final ItemMatterCraft itemNuggetCopper = new ItemNuggetCopper();

    public static void init()
    {
        GameRegistry.registerItem(itemScrewDriver, itemScrewDriver.getUnlocalizedName());
        GameRegistry.registerItem(itemIngotCopper, itemIngotCopper.getUnlocalizedName());
        GameRegistry.registerItem(itemEnergyTransmitter, itemEnergyTransmitter.getUnlocalizedName());
        GameRegistry.registerItem(itemEnergyTransceiver, itemEnergyTransceiver.getUnlocalizedName());
        GameRegistry.registerItem(itemEnergyReceiver, itemEnergyReceiver.getUnlocalizedName());
        GameRegistry.registerItem(itemNuggetCopper, itemNuggetCopper.getUnlocalizedName());

    }
}
