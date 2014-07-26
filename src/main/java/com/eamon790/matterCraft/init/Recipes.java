package com.eamon790.matterCraft.init;

import com.eamon790.matterCraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
   public static void initShapedRecipes()
   {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemScrewDriver),"  i", "sc ", "is ", 'i', "ingotIron", 'c', "ingotCopper", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemIngotCopper), "xxx","xxx","xxx", 'x', new ItemStack(ModItems.itemNuggetCopper)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemEnergyReceiver), "ccc","iri","ggg",
        'c', Names.oreDictionary.nuggetCopper, 'i', "ingotIron", 'r',"dustRedstone" , 'g', "nuggetGold"));
   }
   public static void initShapelessRecipes()
   {
       GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemNuggetCopper,9), new ItemStack(ModItems.itemIngotCopper));
   }
}
