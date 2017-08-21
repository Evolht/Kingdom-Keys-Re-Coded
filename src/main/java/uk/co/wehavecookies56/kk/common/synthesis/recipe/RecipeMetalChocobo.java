package uk.co.wehavecookies56.kk.common.synthesis.recipe;

import net.minecraft.item.ItemStack;
import uk.co.wehavecookies56.kk.api.materials.Material;
import uk.co.wehavecookies56.kk.api.materials.MaterialRegistry;
import uk.co.wehavecookies56.kk.api.recipes.Recipe;
import uk.co.wehavecookies56.kk.common.item.ModItems;
import uk.co.wehavecookies56.kk.common.lib.Strings;

import java.util.HashMap;
import java.util.Map;

public class RecipeMetalChocobo extends Recipe {

    public String name;

    public RecipeMetalChocobo (String name) {
        this.name = name;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public ItemStack getResult () {
        return new ItemStack(ModItems.Chain_MetalChocobo);
    }

    @Override
    public Map<Material, Integer> getRequirements () {
        Map<Material, Integer> reqs = new HashMap<Material, Integer>();
        reqs.put(MaterialRegistry.get(Strings.SM_PowerStone), 5);
        reqs.put(MaterialRegistry.get(Strings.SM_DenseCrystal), 3);
        reqs.put(MaterialRegistry.get(Strings.SM_LucidCrystal), 2);
        reqs.put(MaterialRegistry.get(Strings.SM_EnergyShard), 1);
        return reqs;
    }

}
