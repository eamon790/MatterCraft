package com.eamon790.matterCraft;
import com.eamon790.matterCraft.handler.ConfigurationHandler;
import com.eamon790.matterCraft.init.MatterCraftOreDictionary;
import com.eamon790.matterCraft.init.ModBlocks;
import com.eamon790.matterCraft.init.ModItems;
import com.eamon790.matterCraft.init.Recipes;
import com.eamon790.matterCraft.proxy.IProxy;
import com.eamon790.matterCraft.reference.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION,  guiFactory = Reference.GUI_FACTORY_CLASS)
public class MatterCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static MatterCraft matterCraft;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent preInitializationEvent)
    {
        ConfigurationHandler.init(preInitializationEvent.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        MatterCraftOreDictionary.addEntries();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent initializationEvent)
    {
        Recipes.initShapedRecipes();
        Recipes.initShapelessRecipes();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent postInitializationEvent)
    {

    }
}
