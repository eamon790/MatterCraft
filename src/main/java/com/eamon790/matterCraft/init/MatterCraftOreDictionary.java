package com.eamon790.matterCraft.init;
import com.eamon790.matterCraft.reference.Names;
import net.minecraftforge.oredict.OreDictionary;
public class MatterCraftOreDictionary
{
    public static void addEntries()
    {
        OreDictionary.registerOre(Names.oreDictionary.ingotCopper, ModItems.itemIngotCopper);
        OreDictionary.registerOre(Names.oreDictionary.nuggetCopper, ModItems.itemNuggetCopper);
    }
}
