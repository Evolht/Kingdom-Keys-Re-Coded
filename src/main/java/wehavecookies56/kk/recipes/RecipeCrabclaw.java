package wehavecookies56.kk.recipes;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import wehavecookies56.kk.api.recipes.Recipe;
import wehavecookies56.kk.item.ModItems;
import wehavecookies56.kk.lib.Strings;

public class RecipeCrabclaw extends Recipe {

	public String name;

	public RecipeCrabclaw(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Item getResult() {
		return ModItems.Chain_Crabclaw;
	}

	@Override
	public List<String> getRequirements() {
		List<String> reqs = new ArrayList<String>();
		reqs.add(Strings.SM_LucidShard + ".x.2");
		reqs.add(Strings.SM_BrightGem + ".x.2");
		reqs.add(Strings.SM_SerenityStone + ".x.2");
		reqs.add(Strings.SM_EnergyStone + ".x.1");
		return reqs;
	}

}