package wehavecookies56.kk.recipes;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import wehavecookies56.kk.api.recipes.Recipe;
import wehavecookies56.kk.item.ModItems;
import wehavecookies56.kk.lib.Strings;

public class RecipeDestinysEmbrace extends Recipe {

	public String name;

	public RecipeDestinysEmbrace(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Item getResult() {
		return ModItems.Chain_DestinysEmbrace;
	}

	@Override
	public List<String> getRequirements() {
		List<String> reqs = new ArrayList<String>();
		reqs.add(Strings.SM_LightningStone + ".x.5");
		reqs.add(Strings.SM_LightningGem + ".x.5");
		reqs.add(Strings.SM_BrightCrystal + ".x.5");
		reqs.add(Strings.SM_PowerStone + ".x.3");
		return reqs;
	}

}