package uk.co.wehavecookies56.kk.common.synthesis.recipe;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;
import uk.co.wehavecookies56.kk.api.materials.Material;
import uk.co.wehavecookies56.kk.api.materials.MaterialRegistry;
import uk.co.wehavecookies56.kk.api.recipes.Recipe;
import uk.co.wehavecookies56.kk.common.item.ModItems;
import uk.co.wehavecookies56.kk.common.lib.Strings;

/**
 * Created by Toby on 16/07/2016.
 */
public class RecipeDefenseBoost extends Recipe {

    public String name;

    public RecipeDefenseBoost(String name) {
        this.name = name;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public ItemStack getResult () {
        return new ItemStack(ModItems.DefenseBoost);
    }

    @Override
    public Map<Material, Integer> getRequirements () {
        Map<Material, Integer> reqs = new HashMap<Material, Integer>();
        reqs.put(MaterialRegistry.get(Strings.SM_MythrilCrystal), 1);
        reqs.put(MaterialRegistry.get(Strings.SM_BlazingCrystal), 3);
        reqs.put(MaterialRegistry.get(Strings.SM_LightningCrystal), 3);
        reqs.put(MaterialRegistry.get(Strings.SM_LucidCrystal), 3);
        return reqs;
    }

}
