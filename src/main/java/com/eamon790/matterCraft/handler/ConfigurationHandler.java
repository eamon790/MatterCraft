package com.eamon790.matterCraft.handler;

import com.eamon790.matterCraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static Configuration config;
    public static boolean isModInTesting = false;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
            loadConfig();
    }

    private static void loadConfig()
    {
        isModInTesting = config.getBoolean("InDevelopment", Configuration.CATEGORY_GENERAL, false, "True if mod is in Development");
        if(config.hasChanged())
            config.save();
    }
}
