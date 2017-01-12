package uk.co.wehavecookies56.kk.common.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.wehavecookies56.kk.client.sound.ModSounds;
import uk.co.wehavecookies56.kk.common.item.base.ItemKKRecord;
import uk.co.wehavecookies56.kk.common.item.base.ItemKeyblade;
import uk.co.wehavecookies56.kk.common.item.base.ItemKeychain;
import uk.co.wehavecookies56.kk.common.item.base.ItemRealKeyblade;
import uk.co.wehavecookies56.kk.common.item.base.ItemRecipe;
import uk.co.wehavecookies56.kk.common.item.base.ItemSynthesisMaterial;
import uk.co.wehavecookies56.kk.common.item.org.ItemArpeggio;
import uk.co.wehavecookies56.kk.common.item.org.ItemAshes;
import uk.co.wehavecookies56.kk.common.item.org.ItemBlazeofGlory;
import uk.co.wehavecookies56.kk.common.item.org.ItemBookofRetribution;
import uk.co.wehavecookies56.kk.common.item.org.ItemEternalFlames;
import uk.co.wehavecookies56.kk.common.item.org.ItemFairGame;
import uk.co.wehavecookies56.kk.common.item.org.ItemFoudre;
import uk.co.wehavecookies56.kk.common.item.org.ItemFrozenPride;
import uk.co.wehavecookies56.kk.common.item.org.ItemGracefulDahlia;
import uk.co.wehavecookies56.kk.common.item.org.ItemIfrit;
import uk.co.wehavecookies56.kk.common.item.org.ItemInterdiction;
import uk.co.wehavecookies56.kk.common.item.org.ItemLindworm;
import uk.co.wehavecookies56.kk.common.item.org.ItemLunatic;
import uk.co.wehavecookies56.kk.common.item.org.ItemPrometheus;
import uk.co.wehavecookies56.kk.common.item.org.ItemProminence;
import uk.co.wehavecookies56.kk.common.item.org.ItemSharpshooter;
import uk.co.wehavecookies56.kk.common.item.org.ItemSkysplitter;
import uk.co.wehavecookies56.kk.common.lib.Reference;
import uk.co.wehavecookies56.kk.common.lib.Strings;

public class ModItems {

	// Organization
	public static Item Interdiction, Aggression, Sharpshooter,  Sunrise, Precision, FinalWeapon, Killerbee, Sanction, Lindworm, FrozenPride, Skysplitter, BookofRetribution, Lunatic, EternalFlames, Arpeggio, FairGame, GracefulDahlia, Foudre, BlazeofGlory, Prometheus, Ifrit, Prominence, FickleErica, PoorMelissa, JiltedAnemone, Standalone, Zephyr, Reticence,  Tranchant, Malice, Infinity, TheFool, TesterZero, Calmant, ProductOne, Inquisition, Burnout, Outbreak, FalseTheory, Dragonreign , Crux,  Orage, Eruption, Irregulier, Ashes, Combustion, Twilight, LoftyGerbera, HallowedLotus, BlackPrimer, Indigo, Lumineuse;

	public static Item BlazingInfusedCoal, FrostInfusedSnowBall, StormyInfusedIron, MythrilInfusedDiamond, LightningInfusedGold, BrightInfusedGlowStone, DarkInfusedIron, AbandonedKnowledge, DarkKnowledge, EclipsedKnowledge, ForgottenKnowledge, IlludedKnowledge, LostKnowledge, ManifestKnowledge, ObscuredKnowledge, UnknownKnowledge, VoidKnowledge;

	// Keyblades
	public static Item AbaddonPlasma, AbyssalTide, AllforOne, AnguisForetellersKeyblade, AstralBlast, Aubade, BondofFlame, Brightcrest, ChaosRipper, CircleofLife, Counterpoint, Crabclaw, CrownofGuilt, DarkerThanDark, Darkgnaw, DecisivePumpkin, DestinysEmbrace, DiamondDust, Divewing, DivineRose, DreamSword, DualDisc, Earthshaker, EndofPain, EndsoftheEarth, FairyHarp, FairyStars, FatalCrest, Fenrir, FerrisGear, FollowtheWind, FrolicFlame, GlimpseofDarkness, GuardianBell, GuardianSoul, GullWing, HerosCrest, HiddenDragon, Hyperdrive, IncompleteKiblade, JungleKing, KeybladeofPeoplesHearts, Kiblade, KingdomKey, KingdomKeyD, KnockoutPunch, LadyLuck, LeasKeyblade, LeopardosForetellersKeyblade, Leviathan, Lionheart, LostMemory, LunarEclipse, MarkofaHero, MasterXehanortsKeyblade, MastersDefender, MaverickFlare, MetalChocobo, MidnightRoar, MirageSplit, MissingAche, Monochrome, MysteriousAbyss, NightmaresEnd, NightmaresEndandMirageSplit, NoName, Oathkeeper, Oblivion, OceansRage, Olympia, OmegaWeapon, OminousBlight, OneWingedAngel, PainofSolitude, PhotonDebugger, PixiePetal, Pumpkinhead, Rainfell, RejectionofFate, RoyalRadiance, RumblingRose, SignofInnocence, SilentDirge, SkullNoise, SleepingLion, SoulEater, Spellbinder, StarSeeker, Starlight, Stormfall, StrokeofMidnight, SweetDreams, SweetMemories, Sweetstack, ThreeWishes, TotalEclipse, TreasureTrove, TrueLightsFlight, TwilightBlaze, TwoBecomeOne, UltimaWeaponKH1, UltimaWeaponKH2, UltimaWeaponBBS, UltimaWeaponDDD, Umbrella, Unbound, UnicornisForetellersKeyblade, UrsusForetellersKeyblade, VictoryLine, VoidGear, VulpeusForetellersKeyblade, WaytotheDawn, WaywardWind, WinnersProof, WishingLamp, WishingStar, WoodenKeyblade, WoodenStick, YoungXehanortsKeyblade, ZeroOne;

	// Chains
	public static Item Chain_AbaddonPlasma, Chain_AbyssalTide, Chain_AllforOne, Chain_AnguisForetellersKeyblade, Chain_AstralBlast, Chain_Aubade, Chain_BondofFlame, Chain_Brightcrest, Chain_ChaosRipper, Chain_CircleofLife, Chain_Counterpoint, Chain_Crabclaw, Chain_CrownofGuilt, Chain_DarkerThanDark, Chain_Darkgnaw, Chain_DecisivePumpkin, Chain_DestinysEmbrace, Chain_DiamondDust, Chain_Divewing, Chain_DivineRose, Chain_DreamSword, Chain_DualDisc, Chain_Earthshaker, Chain_EndofPain, Chain_EndsoftheEarth, Chain_FairyHarp, Chain_FairyStars, Chain_FatalCrest, Chain_Fenrir, Chain_FerrisGear, Chain_FollowtheWind, Chain_FrolicFlame, Chain_GlimpseofDarkness, Chain_GuardianBell, Chain_GuardianSoul, Chain_GullWing, Chain_HerosCrest, Chain_HiddenDragon, Chain_Hyperdrive, Chain_IncompleteKiblade, Chain_JungleKing, Chain_KeybladeofPeoplesHearts, Chain_Kiblade, Chain_KingdomKey, Chain_KingdomKeyD, Chain_KnockoutPunch, Chain_LadyLuck, Chain_LeasKeyblade, Chain_LeopardosForetellersKeyblade, Chain_Leviathan, Chain_Lionheart, Chain_LostMemory, Chain_LunarEclipse, Chain_MarkofaHero, Chain_MasterXehanortsKeyblade, Chain_MastersDefender, Chain_MaverickFlare, Chain_MetalChocobo, Chain_MidnightRoar, Chain_MirageSplit, Chain_MissingAche, Chain_Monochrome, Chain_MysteriousAbyss, Chain_NightmaresEnd, Chain_NightmaresEndandMirageSplit, Chain_NoName, Chain_Oathkeeper, Chain_Oblivion, Chain_OceansRage, Chain_Olympia, Chain_OmegaWeapon, Chain_OminousBlight, Chain_OneWingedAngel, Chain_PainofSolitude, Chain_PhotonDebugger, Chain_PixiePetal, Chain_Pumpkinhead, Chain_Rainfell, Chain_RejectionofFate, Chain_RoyalRadiance, Chain_RumblingRose, Chain_SignofInnocence, Chain_SilentDirge, Chain_SkullNoise, Chain_SleepingLion, Chain_SoulEater, Chain_Spellbinder, Chain_StarSeeker, Chain_Starlight, Chain_Stormfall, Chain_StrokeofMidnight, Chain_SweetDreams, Chain_SweetMemories, Chain_Sweetstack, Chain_ThreeWishes, Chain_TotalEclipse, Chain_TreasureTrove, Chain_TrueLightsFlight, Chain_TwilightBlaze, Chain_TwoBecomeOne, Chain_UltimaWeaponKH1, Chain_UltimaWeaponKH2, Chain_UltimaWeaponBBS, Chain_UltimaWeaponDDD, Chain_Umbrella, Chain_Unbound, Chain_UnicornisForetellersKeyblade, Chain_UrsusForetellersKeyblade, Chain_VictoryLine, Chain_VoidGear, Chain_VulpeusForetellersKeyblade, Chain_WaytotheDawn, Chain_WaywardWind, Chain_WinnersProof, Chain_WishingLamp, Chain_WishingStar, Chain_YoungXehanortsKeyblade, Chain_ZeroOne;

	// Misc
	public static Item Panacaea, DefenseBoost, MagicBoost, PowerBoost, DriveRecovery, HighDriveRecovery, Munny, EmptyBottle, Potion, HiPotion, MegaPotion, Ether, MegaEther, Elixir, Megalixir, HpOrb, DriveOrb, MagicOrb, Heart, DarkHeart, PureHeart, KingdomHearts, DarkLeather, SynthesisMaterial, Recipe, IceCream, WinnerStick, LevelUpMagicFire, LevelUpMagicBlizzard, LevelUpMagicThunder, LevelUpMagicCure, LevelUpMagicAero, LevelUpMagicStop, LevelUpValor, LevelUpWisdom, LevelUpLimit, LevelUpMaster, LevelUpFinal, SynthesisBagS, SynthesisBagM, SynthesisBagL;

	// Music Discs
	public static Item Disc_Birth_by_Sleep_A_Link_to_the_Future, Disc_Darkness_of_the_Unknown, Disc_Dearly_Beloved_Symphony_Version, Disc_Dream_Drop_Distance_The_Next_Awakening, Disc_Hikari_KINGDOM_Instrumental_Version, Disc_L_Oscurita_Dell_Ignoto, Disc_Musique_pour_la_tristesse_de_Xion, Disc_No_More_Bugs_Bug_Version, Disc_Organization_XIII, Disc_Sanctuary, Disc_Simple_And_Clean_PLANITb_Remix, Disc_Sinister_Sundown, Disc_The_13th_Anthology;

	// Armour
	public static Item OrganizationRobe_Helmet, OrganizationRobe_Chestplate, OrganizationRobe_Leggings, OrganizationRobe_Boots, Terra_Helmet, Terra_Chestplate, Terra_Leggings, Terra_Boots, Aqua_Helmet, Aqua_Chestplate, Aqua_Leggings, Aqua_Boots, Ventus_Helmet, Ventus_Chestplate, Ventus_Leggings, Ventus_Boots, Eraqus_Helmet, Eraqus_Chestplate, Eraqus_Leggings, Eraqus_Boots;

	// Armour material
	private static ArmorMaterial ORGANIZATIONROBE = EnumHelper.addArmorMaterial("ORGANIZATIONROBE", Reference.MODID + ":organizationrobe", -1, new int[] { 2, 3, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5);
	private static ArmorMaterial TERRA = EnumHelper.addArmorMaterial("TERRA", Reference.MODID + ":terra", -1, new int[] { 4, 7, 8, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4);
	private static ArmorMaterial AQUA = EnumHelper.addArmorMaterial("AQUA", Reference.MODID + ":aqua", -1, new int[] { 4, 7, 8, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
	private static ArmorMaterial VENTUS = EnumHelper.addArmorMaterial("VENTUS", Reference.MODID + ":ventus", -1, new int[] { 4, 7, 8, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
	private static ArmorMaterial ERAQUS = EnumHelper.addArmorMaterial("ERAQUS", Reference.MODID + ":eraqus", -1, new int[] { 4, 7, 8, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5);

	private static ToolMaterial KEYCHAIN = EnumHelper.addToolMaterial("KEYCHAIN", 0, 1, 0, -4, 30);
	
	public static CreativeTabs tabKingdomKeys;

	public static void init () {
		tabKingdomKeys = new TabKingdomKeys(CreativeTabs.getNextID(), Strings.tabKingdomKeys);

		BlazingInfusedCoal = new Item().setUnlocalizedName(Strings.BlazingInfusedCoal).setCreativeTab(tabKingdomKeys);
		FrostInfusedSnowBall = new Item().setUnlocalizedName(Strings.FrostInfusedSnowBall).setCreativeTab(tabKingdomKeys);
		StormyInfusedIron = new Item().setUnlocalizedName(Strings.StormyInfusedIron).setCreativeTab(tabKingdomKeys);
		MythrilInfusedDiamond = new Item().setUnlocalizedName(Strings.MythrilInfusedDiamond).setCreativeTab(tabKingdomKeys);
		LightningInfusedGold = new Item().setUnlocalizedName(Strings.LightningInfusedGold).setCreativeTab(tabKingdomKeys);
		BrightInfusedGlowStone = new Item().setUnlocalizedName(Strings.BrightInfusedGlowStone).setCreativeTab(tabKingdomKeys);
		DarkInfusedIron = new Item().setUnlocalizedName(Strings.DarkInfusedIron).setCreativeTab(tabKingdomKeys);

		AbandonedKnowledge = new Item().setUnlocalizedName(Strings.AbandonedKnowledge).setCreativeTab(tabKingdomKeys);
		DarkKnowledge = new Item().setUnlocalizedName(Strings.DarkKnowledge).setCreativeTab(tabKingdomKeys);
		EclipsedKnowledge = new Item().setUnlocalizedName(Strings.EclipsedKnowledge).setCreativeTab(tabKingdomKeys);
		ForgottenKnowledge = new Item().setUnlocalizedName(Strings.ForgottenKnowledge).setCreativeTab(tabKingdomKeys);
		IlludedKnowledge = new Item().setUnlocalizedName(Strings.IlludedKnowledge).setCreativeTab(tabKingdomKeys);
		LostKnowledge = new Item().setUnlocalizedName(Strings.LostKnowledge).setCreativeTab(tabKingdomKeys);
		ManifestKnowledge = new ItemManifestKnowledge().setUnlocalizedName(Strings.ManifestKnowledge).setCreativeTab(tabKingdomKeys);
		ObscuredKnowledge = new Item().setUnlocalizedName(Strings.ObscuredKnowledge).setCreativeTab(tabKingdomKeys);
		UnknownKnowledge = new Item().setUnlocalizedName(Strings.UnknownKnowledge).setCreativeTab(tabKingdomKeys);
		VoidKnowledge = new Item().setUnlocalizedName(Strings.VoidKnowledge).setCreativeTab(tabKingdomKeys);

		// xemnas
		Interdiction = new ItemInterdiction(EnumHelper.addToolMaterial("interdiction", 3, -1, 6F, 10, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Interdiction);
		Aggression = new ItemInterdiction(EnumHelper.addToolMaterial("aggression", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Aggression);
		Sanction = new ItemInterdiction(EnumHelper.addToolMaterial("sanction", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Sanction);
		Infinity = new ItemInterdiction(EnumHelper.addToolMaterial("infinity", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Infinity);
		Malice = new ItemInterdiction(EnumHelper.addToolMaterial("malice", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Malice);

		// xigbar
		Sharpshooter = new ItemSharpshooter(EnumHelper.addToolMaterial("sharpshooter", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Sharpshooter);
		FinalWeapon = new ItemSharpshooter(EnumHelper.addToolMaterial("finalweapon", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FinalWeapon);
		Sunrise = new ItemSharpshooter(EnumHelper.addToolMaterial("sunrise", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Sunrise);
		Precision = new ItemSharpshooter(EnumHelper.addToolMaterial("precision", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Precision);
		Killerbee = new ItemSharpshooter(EnumHelper.addToolMaterial("killerbee", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Killerbee);
		Standalone = new ItemSharpshooter(EnumHelper.addToolMaterial("sharpshooter", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Standalone);

		// xaldin
		Lindworm = new ItemLindworm(EnumHelper.addToolMaterial("lindworm", 3, -1, 6F, 9, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Lindworm);
		Crux = new ItemLindworm(EnumHelper.addToolMaterial("crux", 3, -1, 6F, 9, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Crux);
		Dragonreign = new ItemLindworm(EnumHelper.addToolMaterial("dragonreign", 3, -1, 6F, 9, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Dragonreign);
		Zephyr = new ItemLindworm(EnumHelper.addToolMaterial("lindworm", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Zephyr);

		// vexen
		FrozenPride = new ItemFrozenPride().setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FrozenPride);
		ProductOne = new ItemFrozenPride().setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.ProductOne);
		FalseTheory = new ItemFrozenPride().setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FalseTheory);
		TesterZero = new ItemFrozenPride().setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TesterZero);
		Inquisition = new ItemFrozenPride().setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Inquisition);

		// lexeaus
		Skysplitter = new ItemSkysplitter(EnumHelper.addToolMaterial("skysplitter", 3, -1, 6F, 20, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Skysplitter);
		Reticence = new ItemSkysplitter(EnumHelper.addToolMaterial("skysplitter", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Reticence);

		// zexion
		BookofRetribution = new ItemBookofRetribution(EnumHelper.addToolMaterial("bookofretribution", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.BookofRetribution);
		BlackPrimer = new ItemBookofRetribution(EnumHelper.addToolMaterial("blackprimer", 3, -1, 6F, 15, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.BlackPrimer);

		// saix
		Lunatic = new ItemLunatic(EnumHelper.addToolMaterial("lunatic", 3, -1, 6F, 15, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Lunatic);
		Twilight = new ItemLunatic(EnumHelper.addToolMaterial("twilight", 3, -1, 6F, 15, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Twilight);

		// axel
		Burnout = new ItemBlazeofGlory(EnumHelper.addToolMaterial("burnout", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Burnout);
		Outbreak = new ItemBlazeofGlory(EnumHelper.addToolMaterial("outbreak", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Outbreak);
		Ashes = new ItemAshes(EnumHelper.addToolMaterial("ashes", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Ashes);
		Combustion = new ItemAshes(EnumHelper.addToolMaterial("combustion", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Combustion);
		BlazeofGlory = new ItemBlazeofGlory(EnumHelper.addToolMaterial("blazeofglory", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.BlazeofGlory);
		Prometheus = new ItemPrometheus(EnumHelper.addToolMaterial("prometheus", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Prometheus);
		Ifrit = new ItemIfrit(EnumHelper.addToolMaterial("ifrit", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Ifrit);
		Prominence = new ItemProminence(EnumHelper.addToolMaterial("prominence", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Prominence);
		EternalFlames = new ItemEternalFlames(EnumHelper.addToolMaterial("eternalflames", 3, -1, 6F, 5, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.EternalFlames);

		// demyx
		Arpeggio = new ItemArpeggio(EnumHelper.addToolMaterial("arpeggio", 3, -1, 6F, 9, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Arpeggio);

		// luxord
		FairGame = new ItemFairGame(EnumHelper.addToolMaterial("fairgame", 3, -1, 6F, 8, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FairGame);
		TheFool = new ItemFairGame(EnumHelper.addToolMaterial("fairgame", 3, -1, 6F, 8, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.TheFool);

		// Marluxia
		GracefulDahlia = new ItemGracefulDahlia(EnumHelper.addToolMaterial("gracefuldahlia", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.GracefulDahlia);
		FickleErica = new ItemGracefulDahlia(EnumHelper.addToolMaterial("fickleerica", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.FickleErica);
		PoorMelissa = new ItemGracefulDahlia(EnumHelper.addToolMaterial("poormelissa", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.PoorMelissa);
		JiltedAnemone = new ItemGracefulDahlia(EnumHelper.addToolMaterial("jiltedanemone", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.JiltedAnemone);
		LoftyGerbera = new ItemGracefulDahlia(EnumHelper.addToolMaterial("partingipheion", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.LoftyGerbera);
		HallowedLotus = new ItemGracefulDahlia(EnumHelper.addToolMaterial("partingipheion", 3, -1, 6F, 12, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.HallowedLotus);

		// larxene
		Foudre = new ItemFoudre(EnumHelper.addToolMaterial("foudre", 3, -1, 6F, 7, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Foudre);
		Calmant = new ItemFoudre(EnumHelper.addToolMaterial("calmant", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Calmant);
		Orage = new ItemFoudre(EnumHelper.addToolMaterial("orage", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Orage);
		Eruption = new ItemFoudre(EnumHelper.addToolMaterial("eruption", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Eruption);
		Irregulier = new ItemFoudre(EnumHelper.addToolMaterial("irregulier", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Irregulier);
		Tranchant = new ItemFoudre(EnumHelper.addToolMaterial("foudre", 3, -1, 6F, 4, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Tranchant);
		Indigo = new ItemFoudre(EnumHelper.addToolMaterial("blackprimer", 3, -1, 6F, 15, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Indigo);
		Lumineuse = new ItemFoudre(EnumHelper.addToolMaterial("blackprimer", 3, -1, 6F, 15, 30)).setCreativeTab(tabKingdomKeys).setUnlocalizedName(Strings.Lumineuse);


		//keyblades
		AbaddonPlasma = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.AbaddonPlasma);
		((ItemKeyblade)AbaddonPlasma).setDescription("A weapon that lets you string together faster, incredibly long ground combos.");
		AbyssalTide = new ItemRealKeyblade(4, 0).setUnlocalizedName(Strings.AbyssalTide);
		((ItemKeyblade)AbyssalTide).setDescription("A weapon that performs very well in midair. Excellent for taking on fliers.");
		AllforOne = new ItemRealKeyblade(6, 6).setUnlocalizedName(Strings.AllforOne);
		((ItemKeyblade)AllforOne).setDescription("A Keyblade that triggers fewer Reality Shifts, but compensates with a boost in Magic and more frequent critical hits.");
		AnguisForetellersKeyblade = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.AnguisForetellersKeyblade);
		((ItemKeyblade)AnguisForetellersKeyblade).setDescription("The Keyblade owned by Anguis' Foreteller.");
		AstralBlast = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.AstralBlast);
		((ItemKeyblade)AstralBlast).setDescription("A weapon that lets you string together longer ground and aerial combos.");
		Aubade = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.Aubade);
		((ItemKeyblade)Aubade).setDescription("A weapon that draws forth its wielder's personality.");
		BondofFlame = new ItemRealKeyblade(8, 8).setUnlocalizedName(Strings.BondofFlame);
		((ItemKeyblade)BondofFlame).setDescription("Enhances magic to increase damage dealt by fire-based attacks.");
		Brightcrest = new ItemRealKeyblade(4, 7).setUnlocalizedName(Strings.Brightcrest);
		((ItemKeyblade)Brightcrest).setDescription("A Keyblade with long reach that provides an outstanding boost in Magic. It also makes it easier to land critical hits, and deals higher damage when you do.");
		ChaosRipper = new ItemRealKeyblade(10, -2).setUnlocalizedName(Strings.ChaosRipper);
		((ItemKeyblade)ChaosRipper).setDescription("A Keyblade with long reach that does little for your Magic, but provides an outstanding boost in Strength.");
		CircleofLife = new ItemRealKeyblade(8, 2).setUnlocalizedName(Strings.CircleofLife);
		((ItemKeyblade)CircleofLife).setDescription("Has great strength, increasing MP restoration speed after MP is consumed.");
		Counterpoint = new ItemRealKeyblade(8, 7).setUnlocalizedName(Strings.Counterpoint);
		((ItemKeyblade)Counterpoint).setDescription("A Keyblade with long reach that provides an exra boost in Magic and mkes it easier to trigger Reality Shifts.");
		Crabclaw = new ItemRealKeyblade(6, 1).setUnlocalizedName(Strings.Crabclaw);
		((ItemKeyblade)Crabclaw).setDescription("Raises max MP by 1, and enhances magic and summon power. Also deals good physical damage.");
		CrownofGuilt = new ItemRealKeyblade(5, 8).setUnlocalizedName(Strings.CrownofGuilt);
		((ItemKeyblade)CrownofGuilt).setDescription("A weapon that boosts your Magic to give it incredible power.");
		DarkerThanDark = new ItemRealKeyblade(6, 9).setUnlocalizedName(Strings.DarkerThanDark);
		((ItemKeyblade)DarkerThanDark).setDescription("A weapon that offers high Magic and combo reach.");
		Darkgnaw = new ItemRealKeyblade(5, 2).setUnlocalizedName(Strings.Darkgnaw);
		((ItemKeyblade)Darkgnaw).setDescription("A Keyblade that makes up for its poor reach and low critical hit ratio by providing an extra boost in Strength.");
		DecisivePumpkin = new ItemRealKeyblade(12, 2).setUnlocalizedName(Strings.DecisivePumpkin);
		((ItemKeyblade)DecisivePumpkin).setDescription("The greater number of combos landed, the more damage is dealt, leading to a strong finishing move!");
		DestinysEmbrace = new ItemRealKeyblade(3, 3).setUnlocalizedName(Strings.DestinysEmbrace);
		((ItemKeyblade)DestinysEmbrace).setDescription("A Keyblade that makes it easier to land critical hits.");
		DiamondDust = new ItemRealKeyblade(3, 6).setUnlocalizedName(Strings.DiamondDust);
		((ItemKeyblade)DiamondDust).setDescription("Greatly enhances magic and summon power. Raises max MP by 3.");
		Divewing = new ItemRealKeyblade(8, 8).setUnlocalizedName(Strings.Divewing);
		((ItemKeyblade)Divewing).setDescription("A Keyblade that provides an extra boost in Magic and makes it easier to land critical hits.");
		DivineRose = new ItemRealKeyblade(8, 0).setUnlocalizedName(Strings.DivineRose);
		((ItemKeyblade)DivineRose).setDescription("A powerful weapon that is difficult to deflect. Capable of dealing a string of critical blows.");
		DreamSword = new ItemKeyblade(1, 8).setUnlocalizedName(Strings.DreamSword);
		((ItemKeyblade)DreamSword).setDescription("A sword whose strength is courage: the will to stand against anything.");
		DualDisc = new ItemRealKeyblade(5, 3).setUnlocalizedName(Strings.DualDisc);
		((ItemKeyblade)DualDisc).setDescription("A Keyblade that provides an extra boost in Strength and makes it easier to land critical hits.");
		Earthshaker = new ItemRealKeyblade(3, 1).setUnlocalizedName(Strings.Earthshaker);
		((ItemKeyblade)Earthshaker).setDescription("The Keyblade Terra started out with. What it lacks in reach it makes up for with a slight boost in Strength.");
		EndofPain = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.EndofPain);
		((ItemKeyblade)EndofPain).setDescription("A Keyblade with high magical power and critical hit rate, but reduces the occurrence of Reality Shift.");
		EndsoftheEarth = new ItemRealKeyblade(5, 3).setUnlocalizedName(Strings.EndsoftheEarth);
		((ItemKeyblade)EndsoftheEarth).setDescription("A well-balanced Keyblade that provides an extra boost to all your stats.");
		FairyHarp = new ItemRealKeyblade(7, 1).setUnlocalizedName(Strings.FairyHarp);
		((ItemKeyblade)FairyHarp).setDescription("Raises max MP by 1, and enhances magic and summon power. Sometimes deals powerful critical blows.");
		FairyStars = new ItemRealKeyblade(2, 3).setUnlocalizedName(Strings.FairyStars);
		((ItemKeyblade)FairyStars).setDescription("A Keyblade that provides a balanced boost in Strength and Magic.");
		FatalCrest = new ItemRealKeyblade(6, 10).setUnlocalizedName(Strings.FatalCrest);
		((ItemKeyblade)FatalCrest).setDescription("Increases strength during MP Charge and allows unlimited chaining of combos.");
		Fenrir = new ItemRealKeyblade(14, 2).setUnlocalizedName(Strings.Fenrir);
		((ItemKeyblade)Fenrir).setDescription("Has great range and strength, but maximum ground and midair combos are decreased by 1.");
		FerrisGear = new ItemRealKeyblade(5, 4).setUnlocalizedName(Strings.FerrisGear);
		((ItemKeyblade)FerrisGear).setDescription("A Keyblade that triggers fewer Reality Shifts, but compensates with an extra boost in Strength and Magic.");
		FollowtheWind = new ItemRealKeyblade(6, 2).setUnlocalizedName(Strings.FollowtheWind);
		((ItemKeyblade)FollowtheWind).setDescription("Draws in nearby orbs.");
		FrolicFlame = new ItemRealKeyblade(3, 3).setUnlocalizedName(Strings.FrolicFlame);
		((ItemKeyblade)FrolicFlame).setDescription("A well-balanced Keyblade that provides an extra boost to all of your stats.");
		GlimpseofDarkness = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.GlimpseofDarkness);
		((ItemKeyblade)GlimpseofDarkness).setDescription("A weapon that possesses very high Strength. Effective against tough enemies.");
		GuardianBell = new ItemRealKeyblade(4, 5).setUnlocalizedName(Strings.GuardianBell);
		((ItemKeyblade)GuardianBell).setDescription("A Keyblade with long reach that provides an extra boost in Magic.");
		GuardianSoul = new ItemRealKeyblade(10, 2).setUnlocalizedName(Strings.GuardianSoul);
		((ItemKeyblade)GuardianSoul).setDescription("Has great strength, increasing the amount of damage dealt from Reaction Commands.");
		GullWing = new ItemRealKeyblade(4, 6).setUnlocalizedName(Strings.GullWing);
		((ItemKeyblade)GullWing).setDescription("Greatly increases the amount of experience gained when defeating an enemy at a critical moment.");
		HerosCrest = new ItemRealKeyblade(8, 0).setUnlocalizedName(Strings.HerosCrest);
		((ItemKeyblade)HerosCrest).setDescription("Increases the damage of the finishing move in the air relative to the number of hits in the combo.");
		HiddenDragon = new ItemRealKeyblade(4, 4).setUnlocalizedName(Strings.HiddenDragon);
		((ItemKeyblade)HiddenDragon).setDescription("Restores MP relative to the amount of damage taken.");
		Hyperdrive = new ItemRealKeyblade(4, 3).setUnlocalizedName(Strings.Hyperdrive);
		((ItemKeyblade)Hyperdrive).setDescription("A Keyblade with above-average reach that provides a balanced boost in Strength and Magic.");
		IncompleteKiblade = new ItemRealKeyblade(10, 5).setUnlocalizedName(Strings.IncompleteKiblade);
		((ItemKeyblade)IncompleteKiblade).setDescription("An incomplete form of the legendary Keyblade, the χ-blade.");
		JungleKing = new ItemRealKeyblade(5, 0).setUnlocalizedName(Strings.JungleKing);
		((ItemKeyblade)JungleKing).setDescription("Has a long reach, but seldom deals critical blows.");
		KeybladeofPeoplesHearts = new ItemRealKeyblade(11, 5).setUnlocalizedName(Strings.KeybladeofPeoplesHearts);
		((ItemKeyblade)KeybladeofPeoplesHearts).setDescription("A keyblade with the ability to unlock a person's heart, releasing the darkness within.");
		Kiblade = new ItemRealKeyblade(25, 15).setUnlocalizedName(Strings.Kiblade);
		((ItemKeyblade)Kiblade).setDescription("A legendary weapon, the original Keyblade which all other are imperfectly modeled after. ");
		KingdomKey = new ItemRealKeyblade(3, 1).setUnlocalizedName(Strings.KingdomKey);
		((ItemKeyblade)KingdomKey).setDescription("The key chain attached draws out the Keyblade's true form and power.");
		KingdomKeyD = new ItemRealKeyblade(3, 0).setUnlocalizedName(Strings.KingdomKeyD);
		((ItemKeyblade)KingdomKeyD).setDescription("A Keyblade which mirrors the Kingdom Key from the Realm of Darkness.");
		KnockoutPunch = new ItemRealKeyblade(8, 5).setUnlocalizedName(Strings.KnockoutPunch);
		((ItemKeyblade)KnockoutPunch).setDescription("A Keyblade that lands fewer critical hits, but compensates with a Strength boost and more frequent Reality Shifts.");
		LadyLuck = new ItemRealKeyblade(7, 2).setUnlocalizedName(Strings.LadyLuck);
		((ItemKeyblade)LadyLuck).setDescription("Raises max MP by 2, and significantly enhances magic and summon power. Also inflicts good physical damage.");
		LeasKeyblade = new ItemRealKeyblade(8, 6).setUnlocalizedName(Strings.LeasKeyblade);
		((ItemKeyblade)LeasKeyblade).setDescription("The Keyblade wielded by Lea.");
		LeopardosForetellersKeyblade = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.LeopardosForetellersKeyblade);
		((ItemKeyblade)LeopardosForetellersKeyblade).setDescription("The Keyblade owned by Leopardos' Foreteller.");
		Leviathan = new ItemRealKeyblade(4, 0).setUnlocalizedName(Strings.Leviathan);
		((ItemKeyblade)Leviathan).setDescription("A weapon that performs extremely well in midair. Outstanding for taking on fliers.");
		Lionheart = new ItemRealKeyblade(8, 1).setUnlocalizedName(Strings.Lionheart);
		((ItemKeyblade)Lionheart).setDescription("Raises max MP by 1, and enhances magic and summon power. Also deals great physical damage.");
		LostMemory = new ItemRealKeyblade(6, 5).setUnlocalizedName(Strings.LostMemory);
        ((ItemKeyblade)LostMemory).setDescription("A Keyblade with long reach that makes it easier to land critical hits, and deals higher damage when you do.");
		LunarEclipse = new ItemRealKeyblade(7, 8).setUnlocalizedName(Strings.LunarEclipse);
        ((ItemKeyblade)LunarEclipse).setDescription("A weapon that boosts versatility by greatly boosting both Strength and Magic.");
		MarkofaHero = new ItemRealKeyblade(5, 2).setUnlocalizedName(Strings.MarkofaHero);
        ((ItemKeyblade)MarkofaHero).setDescription("A Keyblade that provides an extra boost in Strength and deals higher damage when you land a critical hit.");
		MasterXehanortsKeyblade = new ItemRealKeyblade(13, 6).setUnlocalizedName(Strings.MasterXehanortsKeyblade);
        ((ItemKeyblade)MasterXehanortsKeyblade).setDescription("The Keyblade weilded by Master Xehanort.");
		MastersDefender = new ItemRealKeyblade(7, 7).setUnlocalizedName(Strings.MastersDefender);
        ((ItemKeyblade)MastersDefender).setDescription("Master Eraqus's Keyblade. All of its stats are high.");
		MaverickFlare = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.MaverickFlare);
        ((ItemKeyblade)MaverickFlare).setDescription("A weapon that offers high Strength and ground combo speed.");
		MetalChocobo = new ItemRealKeyblade(9, -1).setUnlocalizedName(Strings.MetalChocobo);
        ((ItemKeyblade)MetalChocobo).setDescription("Possesses incredible power and reach, but reduces max MP by 1. Rarely deals critical blows.");
		MidnightRoar = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.MidnightRoar);
        ((ItemKeyblade)MidnightRoar).setDescription("A weapon that possesses high Strength. Useful against tough enemies.");
		MirageSplit = new ItemRealKeyblade(8, 5).setUnlocalizedName(Strings.MirageSplit);
        ((ItemKeyblade)MirageSplit).setDescription("A Keyblade formed from a Reality Shift in The World That Never Was.");
		MissingAche = new ItemRealKeyblade(3, 0).setUnlocalizedName(Strings.MissingAche);
        ((ItemKeyblade)MissingAche).setDescription("A weapon that lets you string together faster, longer ground combos.");
		Monochrome = new ItemRealKeyblade(6, 4).setUnlocalizedName(Strings.Monochrome);
        ((ItemKeyblade)Monochrome).setDescription("Increases the effect of restoration items used on the field.");
		MysteriousAbyss = new ItemRealKeyblade(6, 6).setUnlocalizedName(Strings.MysteriousAbyss);
        ((ItemKeyblade)MysteriousAbyss).setDescription("Enhances magic to increase damage dealt by blizzard-based attacks.");
		NightmaresEnd = new ItemRealKeyblade(9, 3).setUnlocalizedName(Strings.NightmaresEnd);
        ((ItemKeyblade)NightmaresEnd).setDescription("A Keyblade formed from a Reality Shift in The World That Never Was.");
		NightmaresEndandMirageSplit = new ItemRealKeyblade(20, 9).setUnlocalizedName(Strings.NightmaresEndandMirageSplit);
        ((ItemKeyblade)NightmaresEndandMirageSplit).setDescription("A Keyblade formed by combining both the Mirage Split and Nightmare's End.");
		NoName = new ItemRealKeyblade(6, 7).setUnlocalizedName(Strings.NoName);
        ((ItemKeyblade)NoName).setDescription("A Keyblade with long reach that provides an outstanding boost in Magic and makes it easier to land critical hits.");
		Oathkeeper = new ItemRealKeyblade(3, 3).setUnlocalizedName(Strings.Oathkeeper);
		((ItemKeyblade)Oathkeeper).setDescription("Enhances magic and increases the duration of a Drive Form.");
		Oblivion = new ItemRealKeyblade(6, 2).setUnlocalizedName(Strings.Oblivion);
		((ItemKeyblade)Oblivion).setDescription("Has great strength, and allows the Drive Gauge to restore quickly during MP Charge.");
		OceansRage = new ItemRealKeyblade(6, 5).setUnlocalizedName(Strings.OceansRage);
        ((ItemKeyblade)OceansRage).setDescription("A Keyblade that lands fewer critical hits, but compensates with a boost in Magic and more frequent Reality Shifts.");
		Olympia = new ItemRealKeyblade(10, 0).setUnlocalizedName(Strings.Olympia);
        ((ItemKeyblade)Olympia).setDescription("A powerful weapon that is difficult to deflect. Capable of inflicting mighty critical blows.");
		OmegaWeapon = new ItemRealKeyblade(7, 3).setUnlocalizedName(Strings.OmegaWeapon);
        ((ItemKeyblade)OmegaWeapon).setDescription("A formidable weapon with exceptional capabilities.");
		OminousBlight = new ItemRealKeyblade(4, 0).setUnlocalizedName(Strings.OminousBlight);
        ((ItemKeyblade)OminousBlight).setDescription("A weapon that lets you string together faster, much longer ground combos.");
		OneWingedAngel = new ItemRealKeyblade(6, -2).setUnlocalizedName(Strings.OneWingedAngel);
        ((ItemKeyblade)OneWingedAngel).setDescription("Has little power, but sometimes deals extremely powerful critical blows. Reduces max MP by 2.");
		PainofSolitude = new ItemRealKeyblade(3, 1).setUnlocalizedName(Strings.PainofSolitude);
        ((ItemKeyblade)PainofSolitude).setDescription("A weapon that boosts your Magic to give it more power.");
		PhotonDebugger = new ItemRealKeyblade(6, 4).setUnlocalizedName(Strings.PhotonDebugger);
        ((ItemKeyblade)PhotonDebugger).setDescription("Increases damage done by thunder-based attacks.");
		PixiePetal = new ItemRealKeyblade(3, 6).setUnlocalizedName(Strings.PixiePetal);
        ((ItemKeyblade)PixiePetal).setDescription("A Keyblade that makes up for its poor reach with an extra boost in Magic. It also makes it easier to land critical hits, and deals higher damage when you do.");
		Pumpkinhead = new ItemRealKeyblade(7, 0).setUnlocalizedName(Strings.Pumpkinhead);
        ((ItemKeyblade)Pumpkinhead).setDescription("Has a long reach and the ability to deal a string of critical blows.");
		Rainfell = new ItemRealKeyblade(2, 2).setUnlocalizedName(Strings.Rainfell);
        ((ItemKeyblade)Rainfell).setDescription("The Keyblade Aqua started out with. What it lacks in reach it makes up for with a balanced boost to Strength and Magic.");
		RejectionofFate = new ItemRealKeyblade(4, 0).setUnlocalizedName(Strings.RejectionofFate);
        ((ItemKeyblade)RejectionofFate).setDescription("A weapon that enables your attacks to reach a wide area and deal immense damage.");
		RoyalRadiance = new ItemRealKeyblade(8, 7).setUnlocalizedName(Strings.RoyalRadiance);
        ((ItemKeyblade)RoyalRadiance).setDescription("A very powerful Keyblade. Hastens the Command Gauge when equipped.");
		RumblingRose = new ItemRealKeyblade(10, 0).setUnlocalizedName(Strings.RumblingRose);
        ((ItemKeyblade)RumblingRose).setDescription("Has great strength, allowing finishing combo moves to be unleashed successively.");
		SignofInnocence = new ItemRealKeyblade(5, 1).setUnlocalizedName(Strings.SignofInnocence);
        ((ItemKeyblade)SignofInnocence).setDescription("A weapon that boosts your Magic to give it a lot more power.");
		SilentDirge = new ItemRealKeyblade(5, 2).setUnlocalizedName(Strings.SilentDirge);
        ((ItemKeyblade)SilentDirge).setDescription("A weapon that provides versatility by boosting both Strength and Magic.");
		SkullNoise = new ItemRealKeyblade(4, 4).setUnlocalizedName(Strings.SkullNoise);
        ((ItemKeyblade)SkullNoise).setDescription("A Keyblade that provides a balanced boost in Strength and Magic.");
		SleepingLion = new ItemRealKeyblade(10, 6).setUnlocalizedName(Strings.SleepingLion);
        ((ItemKeyblade)SleepingLion).setDescription("Well-balanced with strength and magic, increasing maximum ground-based combos by 1.");
		SoulEater = new ItemRealKeyblade(8, 0).setUnlocalizedName(Strings.SoulEater);
        ((ItemKeyblade)SoulEater).setDescription("A sword that swims with darkness. Possesses high Strength.");
		Spellbinder = new ItemRealKeyblade(4, 2).setUnlocalizedName(Strings.Spellbinder);
        ((ItemKeyblade)Spellbinder).setDescription("Raises max MP by 2, and significantly enhances magic and summon power.");
		Starlight = new ItemRealKeyblade(3, 2).setUnlocalizedName(Strings.Starlight);
        ((ItemKeyblade)Starlight).setDescription("A basic Keyblade which is associated with the force of Light.");
		StarSeeker = new ItemRealKeyblade(6, 3).setUnlocalizedName(Strings.StarSeeker);
        ((ItemKeyblade)StarSeeker).setDescription("Increases maximum combo by 1 when in midair.");
		Stormfall = new ItemRealKeyblade(5, 4).setUnlocalizedName(Strings.Stormfall);
        ((ItemKeyblade)Stormfall).setDescription("A well-balanced Keyblade that provides an extra boost to all your stats.");
		StrokeofMidnight = new ItemRealKeyblade(2, 2).setUnlocalizedName(Strings.StrokeofMidnight);
        ((ItemKeyblade)StrokeofMidnight).setDescription("A Keyblade that makes it easier to land critical hits.");
		SweetDreams = new ItemRealKeyblade(9, 6).setUnlocalizedName(Strings.SweetDreams);
        ((ItemKeyblade)SweetDreams).setDescription("A Keyblade with long reach that provides an extra boost in Strength and makes it easier to land critical hits.");
		SweetMemories = new ItemRealKeyblade(0, 8).setUnlocalizedName(Strings.SweetMemories);
        ((ItemKeyblade)SweetMemories).setDescription("Although it does not enhance attack strength, it increases the drop rate of items.");
		Sweetstack = new ItemRealKeyblade(6, 4).setUnlocalizedName(Strings.Sweetstack);
        ((ItemKeyblade)Sweetstack).setDescription("A Keyblade that provides an extra boost in Strength and ensures every strike is a critical hit.");
		ThreeWishes = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.ThreeWishes);
        ((ItemKeyblade)ThreeWishes).setDescription("A powerful weapon that is difficult to deflect.");
		TotalEclipse = new ItemRealKeyblade(5, 0).setUnlocalizedName(Strings.TotalEclipse);
        ((ItemKeyblade)TotalEclipse).setDescription("A weapon that possesses extreme Strength. Devastates tough enemies.");
		TreasureTrove = new ItemRealKeyblade(3, 2 ).setUnlocalizedName(Strings.TreasureTrove);
        ((ItemKeyblade)TreasureTrove).setDescription("A Keyblade that makes up for its poor reach with a balanced boost in Strength and Magic.");
		TrueLightsFlight = new ItemRealKeyblade(5, 0).setUnlocalizedName(Strings.TrueLightsFlight);
        ((ItemKeyblade)TrueLightsFlight).setDescription("A weapon that enables your attacks to reach a wide area and deal heavy damage.");
		TwilightBlaze = new ItemRealKeyblade(6, 0).setUnlocalizedName(Strings.TwilightBlaze);
        ((ItemKeyblade)TwilightBlaze).setDescription("A weapon that boasts superior Strength and ground combo speed.");
		TwoBecomeOne = new ItemRealKeyblade(6, 3).setUnlocalizedName(Strings.TwoBecomeOne);
        ((ItemKeyblade)TwoBecomeOne).setDescription("A weapon of great strength and magic that has a special effect.");
		UltimaWeaponKH1 = new ItemRealKeyblade(12, 2).setUnlocalizedName(Strings.UltimaWeaponKH1);
        ((ItemKeyblade)UltimaWeaponKH1).setDescription("The ultimate Keyblade. Raises max MP by 2, and possesses maximum power and attributes.");
		UltimaWeaponKH2 = new ItemRealKeyblade(12, 8).setUnlocalizedName(Strings.UltimaWeaponKH2);
        ((ItemKeyblade)UltimaWeaponKH2).setDescription("The Keyblade above all others, holding all power and will increase MP restoration rate, once all MP has been consumed.");
		UltimaWeaponBBS = new ItemRealKeyblade(12, 6).setUnlocalizedName(Strings.UltimaWeaponBBS);
        ((ItemKeyblade)UltimaWeaponBBS).setDescription("The most powerful of Keyblades.");
		UltimaWeaponDDD = new ItemRealKeyblade(12, 8).setUnlocalizedName(Strings.UltimaWeaponDDD);
        ((ItemKeyblade)UltimaWeaponDDD).setDescription("An outstanding Keyblade that boosts all stats, and makes it easy to both land critical hits and trigger Reality Shifts.");
		Umbrella = new ItemKeyblade(2, 0).setUnlocalizedName(Strings.Umbrella);
        ((ItemKeyblade)Umbrella).setDescription("This looks awfully familiar...");
		Unbound = new ItemRealKeyblade(14, 7).setUnlocalizedName(Strings.Unbound);
        ((ItemKeyblade)Unbound).setDescription("Keyblade perfection. It boosts all stats, while making it easy to land critical hits and even easier to trigger Reality Shifts.");
		UnicornisForetellersKeyblade = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.UnicornisForetellersKeyblade);
        ((ItemKeyblade)UnicornisForetellersKeyblade).setDescription("The Keyblade owned by Unicornis' Foreteller.");
		UrsusForetellersKeyblade = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.UrsusForetellersKeyblade);
        ((ItemKeyblade)UrsusForetellersKeyblade).setDescription("The Keyblade owned by Ursus' Foreteller.");
		VictoryLine = new ItemRealKeyblade(4, 2).setUnlocalizedName(Strings.VictoryLine);
        ((ItemKeyblade)VictoryLine).setDescription("A Keyblade with above-average reach that makes it easier to land critical hits.");
		VoidGear = new ItemRealKeyblade(10, 4).setUnlocalizedName(Strings.VoidGear);
        ((ItemKeyblade)VoidGear).setDescription("A Keyblade with long reach that provides an outstanding boost in Strength and deals higher damage when you land a critical hit.");
		VulpeusForetellersKeyblade = new ItemRealKeyblade(10, 8).setUnlocalizedName(Strings.VulpeusForetellersKeyblade);
        ((ItemKeyblade)VulpeusForetellersKeyblade).setDescription("The Keyblade owned by Vulpeus' Foreteller.");
		WaytotheDawn = new ItemRealKeyblade(7, 3).setUnlocalizedName(Strings.WaytotheDawn);
        ((ItemKeyblade)WaytotheDawn).setDescription("Deals various attacks.");
		WaywardWind = new ItemRealKeyblade(3, 1).setUnlocalizedName(Strings.WaywardWind);
        ((ItemKeyblade)WaywardWind).setDescription("The Keyblade Ventus started out with. What it lacks in reach it makes up for with a slight boost in Strength.");
		WinnersProof = new ItemRealKeyblade(10, 14).setUnlocalizedName(Strings.WinnersProof);
        ((ItemKeyblade)WinnersProof).setDescription("Has high strength and hold's an excellent magic power. When the enemies are defeated, experience points are not gained.");
		WishingLamp = new ItemRealKeyblade(8, 6).setUnlocalizedName(Strings.WishingLamp);
        ((ItemKeyblade)WishingLamp).setDescription("Wishes come true by increasing the drop rate of munny, HP and MP orbs.");
		WishingStar = new ItemRealKeyblade(5, 0).setUnlocalizedName(Strings.WishingStar);
        ((ItemKeyblade)WishingStar).setDescription("Has a short reach, but always finishes up a combo attack with a powerful critical blow.");
		WoodenKeyblade = new ItemKeyblade(1, 0).setUnlocalizedName(Strings.WoodenKeyblade);
        ((ItemKeyblade)WoodenKeyblade).setDescription("A toy Keyblade that originally belonged to Terra, which was later bestowed upon Ventus.");
		WoodenStick = new ItemKeyblade(0, 0).setUnlocalizedName(Strings.WoodenStick);
        ((ItemKeyblade)WoodenKeyblade).setDescription("A stick.");
		YoungXehanortsKeyblade = new ItemRealKeyblade(13, 8).setUnlocalizedName(Strings.YoungXehanortsKeyblade);
        ((ItemKeyblade)YoungXehanortsKeyblade).setDescription("The Keyblade weilded by Young Xehanort.");
		ZeroOne = new ItemRealKeyblade(10, 4).setUnlocalizedName(Strings.ZeroOne);
        ((ItemKeyblade)ZeroOne).setDescription("A Keyblade newly wrought within the datascape. Its powers render all opponents helpless.");

		// CHAINS
		Chain_AbaddonPlasma = new ItemKeychain((ItemKeyblade) AbaddonPlasma, KEYCHAIN).setUnlocalizedName(Strings.Chain_AbaddonPlasma).setCreativeTab(tabKingdomKeys);
		Chain_AbyssalTide = new ItemKeychain((ItemKeyblade) AbyssalTide, KEYCHAIN).setUnlocalizedName(Strings.Chain_AbyssalTide).setCreativeTab(tabKingdomKeys);
		Chain_AllforOne = new ItemKeychain((ItemKeyblade) AllforOne, KEYCHAIN).setUnlocalizedName(Strings.Chain_AllforOne).setCreativeTab(tabKingdomKeys);
		Chain_AnguisForetellersKeyblade = new ItemKeychain((ItemKeyblade) AnguisForetellersKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_AnguisForetellersKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_AstralBlast = new ItemKeychain((ItemKeyblade) AstralBlast, KEYCHAIN).setUnlocalizedName(Strings.Chain_AstralBlast).setCreativeTab(tabKingdomKeys);
		Chain_Aubade = new ItemKeychain((ItemKeyblade) Aubade, KEYCHAIN).setUnlocalizedName(Strings.Chain_Aubade).setCreativeTab(tabKingdomKeys);
		Chain_BondofFlame = new ItemKeychain((ItemKeyblade) BondofFlame, KEYCHAIN).setUnlocalizedName(Strings.Chain_BondofFlame).setCreativeTab(tabKingdomKeys);
		Chain_Brightcrest = new ItemKeychain((ItemKeyblade) Brightcrest, KEYCHAIN).setUnlocalizedName(Strings.Chain_Brightcrest).setCreativeTab(tabKingdomKeys);
		Chain_ChaosRipper = new ItemKeychain((ItemKeyblade) ChaosRipper, KEYCHAIN).setUnlocalizedName(Strings.Chain_ChaosRipper).setCreativeTab(tabKingdomKeys);
		Chain_CircleofLife = new ItemKeychain((ItemKeyblade) CircleofLife, KEYCHAIN).setUnlocalizedName(Strings.Chain_CircleofLife).setCreativeTab(tabKingdomKeys);
		Chain_Counterpoint = new ItemKeychain((ItemKeyblade) Counterpoint, KEYCHAIN).setUnlocalizedName(Strings.Chain_Counterpoint).setCreativeTab(tabKingdomKeys);
		Chain_Crabclaw = new ItemKeychain((ItemKeyblade) Crabclaw, KEYCHAIN).setUnlocalizedName(Strings.Chain_Crabclaw).setCreativeTab(tabKingdomKeys);
		Chain_CrownofGuilt = new ItemKeychain((ItemKeyblade) CrownofGuilt, KEYCHAIN).setUnlocalizedName(Strings.Chain_CrownofGuilt).setCreativeTab(tabKingdomKeys);
		Chain_DarkerThanDark = new ItemKeychain((ItemKeyblade) DarkerThanDark, KEYCHAIN).setUnlocalizedName(Strings.Chain_DarkerThanDark).setCreativeTab(tabKingdomKeys);
		Chain_Darkgnaw = new ItemKeychain((ItemKeyblade) Darkgnaw, KEYCHAIN).setUnlocalizedName(Strings.Chain_Darkgnaw).setCreativeTab(tabKingdomKeys);
		Chain_DecisivePumpkin = new ItemKeychain((ItemKeyblade) DecisivePumpkin, KEYCHAIN).setUnlocalizedName(Strings.Chain_DecisivePumpkin).setCreativeTab(tabKingdomKeys);
		Chain_DestinysEmbrace = new ItemKeychain((ItemKeyblade) DestinysEmbrace, KEYCHAIN).setUnlocalizedName(Strings.Chain_DestinysEmbrace).setCreativeTab(tabKingdomKeys);
		Chain_DiamondDust = new ItemKeychain((ItemKeyblade) DiamondDust, KEYCHAIN).setUnlocalizedName(Strings.Chain_DiamondDust).setCreativeTab(tabKingdomKeys);
		Chain_Divewing = new ItemKeychain((ItemKeyblade) Divewing, KEYCHAIN).setUnlocalizedName(Strings.Chain_Divewing).setCreativeTab(tabKingdomKeys);
		Chain_DivineRose = new ItemKeychain((ItemKeyblade) DivineRose, KEYCHAIN).setUnlocalizedName(Strings.Chain_DivineRose).setCreativeTab(tabKingdomKeys);
		Chain_DreamSword = new ItemKeychain((ItemKeyblade) DreamSword, KEYCHAIN).setUnlocalizedName(Strings.Chain_DreamSword).setCreativeTab(tabKingdomKeys);
		Chain_DualDisc = new ItemKeychain((ItemKeyblade) DualDisc, KEYCHAIN).setUnlocalizedName(Strings.Chain_DualDisc).setCreativeTab(tabKingdomKeys);
		Chain_Earthshaker = new ItemKeychain((ItemKeyblade) Earthshaker, KEYCHAIN).setUnlocalizedName(Strings.Chain_Earthshaker).setCreativeTab(tabKingdomKeys);
		Chain_EndofPain = new ItemKeychain((ItemKeyblade) EndofPain, KEYCHAIN).setUnlocalizedName(Strings.Chain_EndofPain).setCreativeTab(tabKingdomKeys);
		Chain_EndsoftheEarth = new ItemKeychain((ItemKeyblade) EndsoftheEarth, KEYCHAIN).setUnlocalizedName(Strings.Chain_EndsoftheEarth).setCreativeTab(tabKingdomKeys);
		Chain_FairyHarp = new ItemKeychain((ItemKeyblade) FairyHarp, KEYCHAIN).setUnlocalizedName(Strings.Chain_FairyHarp).setCreativeTab(tabKingdomKeys);
		Chain_FairyStars = new ItemKeychain((ItemKeyblade) FairyStars, KEYCHAIN).setUnlocalizedName(Strings.Chain_FairyStars).setCreativeTab(tabKingdomKeys);
		Chain_FatalCrest = new ItemKeychain((ItemKeyblade) FatalCrest, KEYCHAIN).setUnlocalizedName(Strings.Chain_FatalCrest).setCreativeTab(tabKingdomKeys);
		Chain_Fenrir = new ItemKeychain((ItemKeyblade) Fenrir, KEYCHAIN).setUnlocalizedName(Strings.Chain_Fenrir).setCreativeTab(tabKingdomKeys);
		Chain_FerrisGear = new ItemKeychain((ItemKeyblade) FerrisGear, KEYCHAIN).setUnlocalizedName(Strings.Chain_FerrisGear).setCreativeTab(tabKingdomKeys);
		Chain_FollowtheWind = new ItemKeychain((ItemKeyblade) FollowtheWind, KEYCHAIN).setUnlocalizedName(Strings.Chain_FollowtheWind).setCreativeTab(tabKingdomKeys);
		Chain_FrolicFlame = new ItemKeychain((ItemKeyblade) FrolicFlame, KEYCHAIN).setUnlocalizedName(Strings.Chain_FrolicFlame).setCreativeTab(tabKingdomKeys);
		Chain_GlimpseofDarkness = new ItemKeychain((ItemKeyblade) GlimpseofDarkness, KEYCHAIN).setUnlocalizedName(Strings.Chain_GlimpseofDarkness).setCreativeTab(tabKingdomKeys);
		Chain_GuardianBell = new ItemKeychain((ItemKeyblade) GuardianBell, KEYCHAIN).setUnlocalizedName(Strings.Chain_GuardianBell).setCreativeTab(tabKingdomKeys);
		Chain_GuardianSoul = new ItemKeychain((ItemKeyblade) GuardianSoul, KEYCHAIN).setUnlocalizedName(Strings.Chain_GuardianSoul).setCreativeTab(tabKingdomKeys);
		Chain_GullWing = new ItemKeychain((ItemKeyblade) GullWing, KEYCHAIN).setUnlocalizedName(Strings.Chain_GullWing).setCreativeTab(tabKingdomKeys);
		Chain_HerosCrest = new ItemKeychain((ItemKeyblade) HerosCrest, KEYCHAIN).setUnlocalizedName(Strings.Chain_HerosCrest).setCreativeTab(tabKingdomKeys);
		Chain_HiddenDragon = new ItemKeychain((ItemKeyblade) HiddenDragon, KEYCHAIN).setUnlocalizedName(Strings.Chain_HiddenDragon).setCreativeTab(tabKingdomKeys);
		Chain_Hyperdrive = new ItemKeychain((ItemKeyblade) Hyperdrive, KEYCHAIN).setUnlocalizedName(Strings.Chain_Hyperdrive).setCreativeTab(tabKingdomKeys);
		Chain_IncompleteKiblade = new ItemKeychain((ItemKeyblade) IncompleteKiblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_IncompleteKiblade).setCreativeTab(tabKingdomKeys);
		Chain_JungleKing = new ItemKeychain((ItemKeyblade) JungleKing, KEYCHAIN).setUnlocalizedName(Strings.Chain_JungleKing).setCreativeTab(tabKingdomKeys);
		Chain_KeybladeofPeoplesHearts = new ItemKeychain((ItemKeyblade) KeybladeofPeoplesHearts, KEYCHAIN).setUnlocalizedName(Strings.Chain_KeybladeofPeoplesHearts).setCreativeTab(tabKingdomKeys);
		Chain_Kiblade = new ItemKeychain((ItemKeyblade) Kiblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_Kiblade).setCreativeTab(tabKingdomKeys);
		Chain_KingdomKey = new ItemKeychain((ItemKeyblade) KingdomKey, KEYCHAIN).setUnlocalizedName(Strings.Chain_KingdomKey).setCreativeTab(tabKingdomKeys);
		Chain_KingdomKeyD = new ItemKeychain((ItemKeyblade) KingdomKeyD, KEYCHAIN).setUnlocalizedName(Strings.Chain_KingdomKeyD).setCreativeTab(tabKingdomKeys);
		Chain_KnockoutPunch = new ItemKeychain((ItemKeyblade) KnockoutPunch, KEYCHAIN).setUnlocalizedName(Strings.Chain_KnockoutPunch).setCreativeTab(tabKingdomKeys);
		Chain_LadyLuck = new ItemKeychain((ItemKeyblade) LadyLuck, KEYCHAIN).setUnlocalizedName(Strings.Chain_LadyLuck).setCreativeTab(tabKingdomKeys);
		Chain_LeasKeyblade = new ItemKeychain((ItemKeyblade) LeasKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_LeasKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_LeopardosForetellersKeyblade = new ItemKeychain((ItemKeyblade) LeopardosForetellersKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_LeopardosForetellersKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_Leviathan = new ItemKeychain((ItemKeyblade) Leviathan, KEYCHAIN).setUnlocalizedName(Strings.Chain_Leviathan).setCreativeTab(tabKingdomKeys);
		Chain_Lionheart = new ItemKeychain((ItemKeyblade) Lionheart, KEYCHAIN).setUnlocalizedName(Strings.Chain_Lionheart).setCreativeTab(tabKingdomKeys);
		Chain_LostMemory = new ItemKeychain((ItemKeyblade) LostMemory, KEYCHAIN).setUnlocalizedName(Strings.Chain_LostMemory).setCreativeTab(tabKingdomKeys);
		Chain_LunarEclipse = new ItemKeychain((ItemKeyblade) LunarEclipse, KEYCHAIN).setUnlocalizedName(Strings.Chain_LunarEclipse).setCreativeTab(tabKingdomKeys);
		Chain_MarkofaHero = new ItemKeychain((ItemKeyblade) MarkofaHero, KEYCHAIN).setUnlocalizedName(Strings.Chain_MarkofaHero).setCreativeTab(tabKingdomKeys);
		Chain_MasterXehanortsKeyblade = new ItemKeychain((ItemKeyblade) MasterXehanortsKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_MasterXehanortsKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_MastersDefender = new ItemKeychain((ItemKeyblade) MastersDefender, KEYCHAIN).setUnlocalizedName(Strings.Chain_MastersDefender).setCreativeTab(tabKingdomKeys);
		Chain_MaverickFlare = new ItemKeychain((ItemKeyblade) MaverickFlare, KEYCHAIN).setUnlocalizedName(Strings.Chain_MaverickFlare).setCreativeTab(tabKingdomKeys);
		Chain_MetalChocobo = new ItemKeychain((ItemKeyblade) MetalChocobo, KEYCHAIN).setUnlocalizedName(Strings.Chain_MetalChocobo).setCreativeTab(tabKingdomKeys);
		Chain_MidnightRoar = new ItemKeychain((ItemKeyblade) MidnightRoar, KEYCHAIN).setUnlocalizedName(Strings.Chain_MidnightRoar).setCreativeTab(tabKingdomKeys);
		Chain_MirageSplit = new ItemKeychain((ItemKeyblade) MirageSplit, KEYCHAIN).setUnlocalizedName(Strings.Chain_MirageSplit).setCreativeTab(tabKingdomKeys);
		Chain_MissingAche = new ItemKeychain((ItemKeyblade) MissingAche, KEYCHAIN).setUnlocalizedName(Strings.Chain_MissingAche).setCreativeTab(tabKingdomKeys);
		Chain_Monochrome = new ItemKeychain((ItemKeyblade) Monochrome, KEYCHAIN).setUnlocalizedName(Strings.Chain_Monochrome).setCreativeTab(tabKingdomKeys);
		Chain_MysteriousAbyss = new ItemKeychain((ItemKeyblade) MysteriousAbyss, KEYCHAIN).setUnlocalizedName(Strings.Chain_MysteriousAbyss).setCreativeTab(tabKingdomKeys);
		Chain_NightmaresEnd = new ItemKeychain((ItemKeyblade) NightmaresEnd, KEYCHAIN).setUnlocalizedName(Strings.Chain_NightmaresEnd).setCreativeTab(tabKingdomKeys);
		Chain_NightmaresEndandMirageSplit = new ItemKeychain((ItemKeyblade) NightmaresEndandMirageSplit, KEYCHAIN).setUnlocalizedName(Strings.Chain_NightmaresEndandMirageSplit).setCreativeTab(tabKingdomKeys);
		Chain_NoName = new ItemKeychain((ItemKeyblade) NoName, KEYCHAIN).setUnlocalizedName(Strings.Chain_NoName).setCreativeTab(tabKingdomKeys);
		Chain_Oathkeeper = new ItemKeychain((ItemKeyblade) Oathkeeper, KEYCHAIN).setUnlocalizedName(Strings.Chain_Oathkeeper).setCreativeTab(tabKingdomKeys);
		Chain_Oblivion = new ItemKeychain((ItemKeyblade) Oblivion, KEYCHAIN).setUnlocalizedName(Strings.Chain_Oblivion).setCreativeTab(tabKingdomKeys);
		Chain_OceansRage = new ItemKeychain((ItemKeyblade) OceansRage, KEYCHAIN).setUnlocalizedName(Strings.Chain_OceansRage).setCreativeTab(tabKingdomKeys);
		Chain_Olympia = new ItemKeychain((ItemKeyblade) Olympia, KEYCHAIN).setUnlocalizedName(Strings.Chain_Olympia).setCreativeTab(tabKingdomKeys);
		Chain_OmegaWeapon = new ItemKeychain((ItemKeyblade) OmegaWeapon, KEYCHAIN).setUnlocalizedName(Strings.Chain_OmegaWeapon).setCreativeTab(tabKingdomKeys);
		Chain_OminousBlight = new ItemKeychain((ItemKeyblade) OminousBlight, KEYCHAIN).setUnlocalizedName(Strings.Chain_OminousBlight).setCreativeTab(tabKingdomKeys);
		Chain_OneWingedAngel = new ItemKeychain((ItemKeyblade) OneWingedAngel, KEYCHAIN).setUnlocalizedName(Strings.Chain_OneWingedAngel).setCreativeTab(tabKingdomKeys);
		Chain_PainofSolitude = new ItemKeychain((ItemKeyblade) PainofSolitude, KEYCHAIN).setUnlocalizedName(Strings.Chain_PainofSolitude).setCreativeTab(tabKingdomKeys);
		Chain_PhotonDebugger = new ItemKeychain((ItemKeyblade) PhotonDebugger, KEYCHAIN).setUnlocalizedName(Strings.Chain_PhotonDebugger).setCreativeTab(tabKingdomKeys);
		Chain_PixiePetal = new ItemKeychain((ItemKeyblade) PixiePetal, KEYCHAIN).setUnlocalizedName(Strings.Chain_PixiePetal).setCreativeTab(tabKingdomKeys);
		Chain_Pumpkinhead = new ItemKeychain((ItemKeyblade) Pumpkinhead, KEYCHAIN).setUnlocalizedName(Strings.Chain_Pumpkinhead).setCreativeTab(tabKingdomKeys);
		Chain_Rainfell = new ItemKeychain((ItemKeyblade) Rainfell, KEYCHAIN).setUnlocalizedName(Strings.Chain_Rainfell).setCreativeTab(tabKingdomKeys);
		Chain_RejectionofFate = new ItemKeychain((ItemKeyblade) RejectionofFate, KEYCHAIN).setUnlocalizedName(Strings.Chain_RejectionofFate).setCreativeTab(tabKingdomKeys);
		Chain_RoyalRadiance = new ItemKeychain((ItemKeyblade) RoyalRadiance, KEYCHAIN).setUnlocalizedName(Strings.Chain_RoyalRadiance).setCreativeTab(tabKingdomKeys);
		Chain_RumblingRose = new ItemKeychain((ItemKeyblade) RumblingRose, KEYCHAIN).setUnlocalizedName(Strings.Chain_RumblingRose).setCreativeTab(tabKingdomKeys);
		Chain_SignofInnocence = new ItemKeychain((ItemKeyblade) SignofInnocence, KEYCHAIN).setUnlocalizedName(Strings.Chain_SignofInnocence).setCreativeTab(tabKingdomKeys);
		Chain_SilentDirge = new ItemKeychain((ItemKeyblade) SilentDirge, KEYCHAIN).setUnlocalizedName(Strings.Chain_SilentDirge).setCreativeTab(tabKingdomKeys);
		Chain_SkullNoise = new ItemKeychain((ItemKeyblade) SkullNoise, KEYCHAIN).setUnlocalizedName(Strings.Chain_SkullNoise).setCreativeTab(tabKingdomKeys);
		Chain_SleepingLion = new ItemKeychain((ItemKeyblade) SleepingLion, KEYCHAIN).setUnlocalizedName(Strings.Chain_SleepingLion).setCreativeTab(tabKingdomKeys);
		Chain_SoulEater = new ItemKeychain((ItemKeyblade) SoulEater, KEYCHAIN).setUnlocalizedName(Strings.Chain_SoulEater).setCreativeTab(tabKingdomKeys);
		Chain_Spellbinder = new ItemKeychain((ItemKeyblade) Spellbinder, KEYCHAIN).setUnlocalizedName(Strings.Chain_Spellbinder).setCreativeTab(tabKingdomKeys);
		Chain_StarSeeker = new ItemKeychain((ItemKeyblade) StarSeeker, KEYCHAIN).setUnlocalizedName(Strings.Chain_StarSeeker).setCreativeTab(tabKingdomKeys);
		Chain_Starlight = new ItemKeychain((ItemKeyblade) Starlight, KEYCHAIN).setUnlocalizedName(Strings.Chain_Starlight).setCreativeTab(tabKingdomKeys);
		Chain_Stormfall = new ItemKeychain((ItemKeyblade) Stormfall, KEYCHAIN).setUnlocalizedName(Strings.Chain_Stormfall).setCreativeTab(tabKingdomKeys);
		Chain_StrokeofMidnight = new ItemKeychain((ItemKeyblade) StrokeofMidnight, KEYCHAIN).setUnlocalizedName(Strings.Chain_StrokeofMidnight).setCreativeTab(tabKingdomKeys);
		Chain_SweetDreams = new ItemKeychain((ItemKeyblade) SweetDreams, KEYCHAIN).setUnlocalizedName(Strings.Chain_SweetDreams).setCreativeTab(tabKingdomKeys);
		Chain_SweetMemories = new ItemKeychain((ItemKeyblade) SweetMemories, KEYCHAIN).setUnlocalizedName(Strings.Chain_SweetMemories).setCreativeTab(tabKingdomKeys);
		Chain_Sweetstack = new ItemKeychain((ItemKeyblade) Sweetstack, KEYCHAIN).setUnlocalizedName(Strings.Chain_Sweetstack).setCreativeTab(tabKingdomKeys);
		Chain_ThreeWishes = new ItemKeychain((ItemKeyblade) ThreeWishes, KEYCHAIN).setUnlocalizedName(Strings.Chain_ThreeWishes).setCreativeTab(tabKingdomKeys);
		Chain_TotalEclipse = new ItemKeychain((ItemKeyblade) TotalEclipse, KEYCHAIN).setUnlocalizedName(Strings.Chain_TotalEclipse).setCreativeTab(tabKingdomKeys);
		Chain_TreasureTrove = new ItemKeychain((ItemKeyblade) TreasureTrove, KEYCHAIN).setUnlocalizedName(Strings.Chain_TreasureTrove).setCreativeTab(tabKingdomKeys);
		Chain_TrueLightsFlight = new ItemKeychain((ItemKeyblade) TrueLightsFlight, KEYCHAIN).setUnlocalizedName(Strings.Chain_TrueLightsFlight).setCreativeTab(tabKingdomKeys);
		Chain_TwilightBlaze = new ItemKeychain((ItemKeyblade) TwilightBlaze, KEYCHAIN).setUnlocalizedName(Strings.Chain_TwilightBlaze).setCreativeTab(tabKingdomKeys);
		Chain_TwoBecomeOne = new ItemKeychain((ItemKeyblade) TwoBecomeOne, KEYCHAIN).setUnlocalizedName(Strings.Chain_TwoBecomeOne).setCreativeTab(tabKingdomKeys);
		Chain_UltimaWeaponKH1 = new ItemKeychain((ItemKeyblade) UltimaWeaponKH1, KEYCHAIN).setUnlocalizedName(Strings.Chain_UltimaWeaponKH1).setCreativeTab(tabKingdomKeys);
		Chain_UltimaWeaponKH2 = new ItemKeychain((ItemKeyblade) UltimaWeaponKH2, KEYCHAIN).setUnlocalizedName(Strings.Chain_UltimaWeaponKH2).setCreativeTab(tabKingdomKeys);
		Chain_UltimaWeaponBBS = new ItemKeychain((ItemKeyblade) UltimaWeaponBBS, KEYCHAIN).setUnlocalizedName(Strings.Chain_UltimaWeaponBBS).setCreativeTab(tabKingdomKeys);
		Chain_UltimaWeaponDDD = new ItemKeychain((ItemKeyblade) UltimaWeaponDDD, KEYCHAIN).setUnlocalizedName(Strings.Chain_UltimaWeaponDDD).setCreativeTab(tabKingdomKeys);
		Chain_Umbrella = new ItemKeychain((ItemKeyblade) Umbrella, KEYCHAIN).setUnlocalizedName(Strings.Chain_Umbrella).setCreativeTab(tabKingdomKeys);
		Chain_Unbound = new ItemKeychain((ItemKeyblade) Unbound, KEYCHAIN).setUnlocalizedName(Strings.Chain_Unbound).setCreativeTab(tabKingdomKeys);
		Chain_UnicornisForetellersKeyblade = new ItemKeychain((ItemKeyblade) UnicornisForetellersKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_UnicornisForetellersKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_UrsusForetellersKeyblade = new ItemKeychain((ItemKeyblade) UrsusForetellersKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_UrsusForetellersKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_VictoryLine = new ItemKeychain((ItemKeyblade) VictoryLine, KEYCHAIN).setUnlocalizedName(Strings.Chain_VictoryLine).setCreativeTab(tabKingdomKeys);
		Chain_VoidGear = new ItemKeychain((ItemKeyblade) VoidGear, KEYCHAIN).setUnlocalizedName(Strings.Chain_VoidGear).setCreativeTab(tabKingdomKeys);
		Chain_VulpeusForetellersKeyblade = new ItemKeychain((ItemKeyblade) VulpeusForetellersKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_VulpeusForetellersKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_WaytotheDawn = new ItemKeychain((ItemKeyblade) WaytotheDawn, KEYCHAIN).setUnlocalizedName(Strings.Chain_WaytotheDawn).setCreativeTab(tabKingdomKeys);
		Chain_WaywardWind = new ItemKeychain((ItemKeyblade) WaywardWind, KEYCHAIN).setUnlocalizedName(Strings.Chain_WaywardWind).setCreativeTab(tabKingdomKeys);
		Chain_WinnersProof = new ItemKeychain((ItemKeyblade) WinnersProof, KEYCHAIN).setUnlocalizedName(Strings.Chain_WinnersProof).setCreativeTab(tabKingdomKeys);
		Chain_WishingLamp = new ItemKeychain((ItemKeyblade) WishingLamp, KEYCHAIN).setUnlocalizedName(Strings.Chain_WishingLamp).setCreativeTab(tabKingdomKeys);
		Chain_WishingStar = new ItemKeychain((ItemKeyblade) WishingStar, KEYCHAIN).setUnlocalizedName(Strings.Chain_WishingStar).setCreativeTab(tabKingdomKeys);
		Chain_YoungXehanortsKeyblade = new ItemKeychain((ItemKeyblade) YoungXehanortsKeyblade, KEYCHAIN).setUnlocalizedName(Strings.Chain_YoungXehanortsKeyblade).setCreativeTab(tabKingdomKeys);
		Chain_ZeroOne = new ItemKeychain((ItemKeyblade) ZeroOne, KEYCHAIN).setUnlocalizedName(Strings.Chain_ZeroOne).setCreativeTab(tabKingdomKeys);

		Munny = new ItemMunny().setUnlocalizedName(Strings.Munny).setCreativeTab(tabKingdomKeys);
		EmptyBottle = new Item().setUnlocalizedName(Strings.EmptyBottle).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		Potion = new ItemPotion(0, true, "hp").setUnlocalizedName(Strings.Potion).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        HiPotion = new ItemHiPotion(0, true, "hp").setUnlocalizedName(Strings.HiPotion).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        MegaPotion = new ItemMegaPotion(0, true, "hp").setUnlocalizedName(Strings.MegaPotion).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		Ether = new ItemEther(0, true, "mp").setUnlocalizedName(Strings.Ether).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        MegaEther = new ItemMegaEther(0, true, "mp").setUnlocalizedName(Strings.MegaEther).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		Elixir = new ItemElixir(0, true, "elixir").setUnlocalizedName(Strings.Elixir).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        Megalixir = new ItemMegalixir(0, true, "elixir").setUnlocalizedName(Strings.Megalixir).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        DriveRecovery = new ItemDriveRecovery(0, true, "dp").setUnlocalizedName(Strings.DriveRecovery).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        HighDriveRecovery = new ItemHighDriveRecovery(0, true, "dp").setUnlocalizedName(Strings.HighDriveRecovery).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        DefenseBoost = new ItemDefenseBoost().setUnlocalizedName(Strings.DefenseBoost).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        MagicBoost = new ItemMagicBoost().setUnlocalizedName(Strings.MagicBoost).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        PowerBoost = new ItemPowerBoost().setUnlocalizedName(Strings.PowerBoost).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
        Panacaea = new ItemPanacea(0, true, "panacea").setUnlocalizedName(Strings.Panacea).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);

        HpOrb = new ItemHpOrb().setUnlocalizedName(Strings.HpOrb).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		DriveOrb = new ItemDriveOrb().setUnlocalizedName(Strings.DriveOrb).setCreativeTab(tabKingdomKeys);
		MagicOrb = new ItemMagicOrb().setUnlocalizedName(Strings.MagicOrb).setCreativeTab(tabKingdomKeys);
		Heart = new Item().setUnlocalizedName(Strings.Heart).setCreativeTab(tabKingdomKeys);
		DarkHeart = new Item().setUnlocalizedName(Strings.DarkHeart).setCreativeTab(tabKingdomKeys);
		PureHeart = new Item().setUnlocalizedName(Strings.PureHeart).setCreativeTab(tabKingdomKeys);
		KingdomHearts = new Item().setUnlocalizedName(Strings.KingdomHearts).setCreativeTab(tabKingdomKeys);
		DarkLeather = new Item().setUnlocalizedName(Strings.DarkLeather).setCreativeTab(tabKingdomKeys);
		SynthesisMaterial = new ItemSynthesisMaterial().setUnlocalizedName(Strings.SynthesisMaterial).setCreativeTab(tabKingdomKeys);
		IceCream = new ItemIceCream(5, true).setUnlocalizedName(Strings.IceCream).setCreativeTab(tabKingdomKeys);
		WinnerStick = new Item().setUnlocalizedName(Strings.WinnerStick).setCreativeTab(tabKingdomKeys);

		LevelUpMagicFire = new ItemUpgradeFire(Strings.Spell_Fire).setUnlocalizedName(Strings.LevelUpMagicFire).setCreativeTab(tabKingdomKeys);
		LevelUpMagicBlizzard = new ItemUpgradeBlizzard(Strings.Spell_Blizzard).setUnlocalizedName(Strings.LevelUpMagicBlizzard).setCreativeTab(tabKingdomKeys);
		LevelUpMagicThunder = new ItemUpgradeThunder(Strings.Spell_Thunder).setUnlocalizedName(Strings.LevelUpMagicThunder).setCreativeTab(tabKingdomKeys);
		LevelUpMagicCure = new ItemUpgradeCure(Strings.Spell_Cure).setUnlocalizedName(Strings.LevelUpMagicCure).setCreativeTab(tabKingdomKeys);
		LevelUpMagicAero = new ItemUpgradeAero(Strings.Spell_Aero).setUnlocalizedName(Strings.LevelUpMagicAero).setCreativeTab(tabKingdomKeys);
		LevelUpMagicStop = new ItemUpgradeStop(Strings.Spell_Stop).setUnlocalizedName(Strings.LevelUpMagicStop).setCreativeTab(tabKingdomKeys);

		LevelUpValor = new ItemUpgradeValor(Strings.Form_Valor).setUnlocalizedName(Strings.LevelUpValor).setCreativeTab(tabKingdomKeys);
		LevelUpWisdom = new ItemUpgradeWisdom(Strings.Form_Wisdom).setUnlocalizedName(Strings.LevelUpWisdom).setCreativeTab(tabKingdomKeys);
		LevelUpLimit = new ItemUpgradeLimit(Strings.Form_Limit).setUnlocalizedName(Strings.LevelUpLimit).setCreativeTab(tabKingdomKeys);
		LevelUpMaster = new ItemUpgradeMaster(Strings.Form_Master).setUnlocalizedName(Strings.LevelUpMaster).setCreativeTab(tabKingdomKeys);
		LevelUpFinal = new ItemUpgradeFinal(Strings.Form_Final).setUnlocalizedName(Strings.LevelUpFinal).setCreativeTab(tabKingdomKeys);

		SynthesisBagS = new ItemSynthesisBagS().setUnlocalizedName(Strings.SynthesisBagS).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		SynthesisBagM = new ItemSynthesisBagM().setUnlocalizedName(Strings.SynthesisBagM).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		SynthesisBagL = new ItemSynthesisBagL().setUnlocalizedName(Strings.SynthesisBagL).setCreativeTab(tabKingdomKeys).setMaxStackSize(1);
		
		Disc_Birth_by_Sleep_A_Link_to_the_Future = new ItemKKRecord(ModSounds.Birth_by_Sleep_A_Link_to_the_Future, Strings.Disc_Birth_by_Sleep_A_Link_to_the_Future, tabKingdomKeys, 7.29F);
		Disc_Darkness_of_the_Unknown = new ItemKKRecord(ModSounds.Darkness_of_the_Unknown, Strings.Disc_Darkness_of_the_Unknown, tabKingdomKeys, 7.50F);
		Disc_Dearly_Beloved_Symphony_Version = new ItemKKRecord(ModSounds.Dearly_Beloved_Symphony_Version, Strings.Disc_Dearly_Beloved_Symphony_Version, tabKingdomKeys, 2.33F);
		Disc_Dream_Drop_Distance_The_Next_Awakening = new ItemKKRecord(ModSounds.Dream_Drop_Distance_The_Next_Awakening, Strings.Disc_Dream_Drop_Distance_The_Next_Awakening, tabKingdomKeys, 8.56F);
		Disc_Hikari_KINGDOM_Instrumental_Version = new ItemKKRecord(ModSounds.Hikari_KINGDOM_Instrumental_Version, Strings.Disc_Hikari_KINGDOM_Instrumental_Version, tabKingdomKeys, 3.42F);
		Disc_L_Oscurita_Dell_Ignoto = new ItemKKRecord(ModSounds.L_Oscurita_Dell_Ignoto, Strings.Disc_L_Oscurita_Dell_Ignoto, tabKingdomKeys, 4.33F);
		Disc_Musique_pour_la_tristesse_de_Xion = new ItemKKRecord(ModSounds.Musique_pour_la_tristesse_de_Xion, Strings.Disc_Musique_pour_la_tristesse_de_Xion, tabKingdomKeys, 3.57F);
		Disc_No_More_Bugs_Bug_Version = new ItemKKRecord(ModSounds.No_More_Bugs_Bug_Version, Strings.Disc_No_More_Bugs_Bug_Version, tabKingdomKeys, 3.17F);
		Disc_Organization_XIII = new ItemKKRecord(ModSounds.Organization_XIII, Strings.Disc_Organization_XIII, tabKingdomKeys, 2.32F);
		Disc_Sanctuary = new ItemKKRecord(ModSounds.Sanctuary, Strings.Disc_Sanctuary, tabKingdomKeys, 4.25F);
		Disc_Simple_And_Clean_PLANITb_Remix = new ItemKKRecord(ModSounds.Simple_And_Clean_PLANITb_Remix, Strings.Disc_Simple_And_Clean_PLANITb_Remix, tabKingdomKeys, 2.37F);
		Disc_Sinister_Sundown = new ItemKKRecord(ModSounds.Sinister_Sundown, Strings.Disc_Sinister_Sundown, tabKingdomKeys, 2.13F);
		Disc_The_13th_Anthology = new ItemKKRecord(ModSounds.The_13th_Anthology, Strings.Disc_The_13th_Anthology, tabKingdomKeys, 6.38F);

		Recipe = new ItemRecipe().setUnlocalizedName(Strings.Recipe).setCreativeTab(tabKingdomKeys);
	}

	public static void register () {
		// Materials
		GameRegistry.register(BlazingInfusedCoal, new ResourceLocation(Reference.MODID, Strings.BlazingInfusedCoal));
		GameRegistry.register(FrostInfusedSnowBall, new ResourceLocation(Reference.MODID, Strings.FrostInfusedSnowBall));
		GameRegistry.register(StormyInfusedIron, new ResourceLocation(Reference.MODID, Strings.StormyInfusedIron));
		GameRegistry.register(MythrilInfusedDiamond, new ResourceLocation(Reference.MODID, Strings.MythrilInfusedDiamond));
		GameRegistry.register(LightningInfusedGold, new ResourceLocation(Reference.MODID, Strings.LightningInfusedGold));
		GameRegistry.register(BrightInfusedGlowStone, new ResourceLocation(Reference.MODID, Strings.BrightInfusedGlowStone));
		GameRegistry.register(DarkInfusedIron, new ResourceLocation(Reference.MODID, Strings.DarkInfusedIron));

		// Armour
		GameRegistry.register(OrganizationRobe_Helmet = new ItemOrganizationRobe(ORGANIZATIONROBE, 1, EntityEquipmentSlot.HEAD, 0, Strings.OrganizationRobe_Helmet), new ResourceLocation(Reference.MODID, Strings.OrganizationRobe_Helmet));
		GameRegistry.register(OrganizationRobe_Chestplate = new ItemOrganizationRobe(ORGANIZATIONROBE, 1, EntityEquipmentSlot.CHEST, 1, Strings.OrganizationRobe_Chestplate), new ResourceLocation(Reference.MODID, Strings.OrganizationRobe_Chestplate));
		GameRegistry.register(OrganizationRobe_Leggings = new ItemOrganizationRobe(ORGANIZATIONROBE, 2, EntityEquipmentSlot.LEGS, 2, Strings.OrganizationRobe_Leggings), new ResourceLocation(Reference.MODID, Strings.OrganizationRobe_Leggings));
		GameRegistry.register(OrganizationRobe_Boots = new ItemOrganizationRobe(ORGANIZATIONROBE, 1, EntityEquipmentSlot.FEET, 3, Strings.OrganizationRobe_Boots), new ResourceLocation(Reference.MODID, Strings.OrganizationRobe_Boots));

		GameRegistry.register(Terra_Helmet = new ItemTerraArmor(TERRA, 1, EntityEquipmentSlot.HEAD, 0, Strings.Terra_Helmet), new ResourceLocation(Reference.MODID, Strings.Terra_Helmet));
		GameRegistry.register(Terra_Chestplate = new ItemTerraArmor(TERRA, 1, EntityEquipmentSlot.CHEST, 1, Strings.Terra_Chestplate), new ResourceLocation(Reference.MODID, Strings.Terra_Chestplate));
		GameRegistry.register(Terra_Leggings = new ItemTerraArmor(TERRA, 2, EntityEquipmentSlot.LEGS, 2, Strings.Terra_Leggings), new ResourceLocation(Reference.MODID, Strings.Terra_Leggings));
		GameRegistry.register(Terra_Boots = new ItemTerraArmor(TERRA, 1, EntityEquipmentSlot.FEET, 3,Strings.Terra_Boots), new ResourceLocation(Reference.MODID, Strings.Terra_Boots));

		GameRegistry.register(Aqua_Helmet = new ItemAquaArmor(AQUA, 1, EntityEquipmentSlot.HEAD, 0, Strings.Aqua_Helmet), new ResourceLocation(Reference.MODID, Strings.Aqua_Helmet));
		GameRegistry.register(Aqua_Chestplate = new ItemAquaArmor(AQUA, 1, EntityEquipmentSlot.CHEST, 1, Strings.Aqua_Chestplate), new ResourceLocation(Reference.MODID, Strings.Aqua_Chestplate));
		GameRegistry.register(Aqua_Leggings = new ItemAquaArmor(AQUA, 2, EntityEquipmentSlot.LEGS, 2, Strings.Aqua_Leggings), new ResourceLocation(Reference.MODID, Strings.Aqua_Leggings));
		GameRegistry.register(Aqua_Boots = new ItemAquaArmor(AQUA, 1, EntityEquipmentSlot.FEET, 3, Strings.Aqua_Boots), new ResourceLocation(Reference.MODID, Strings.Aqua_Boots));

		GameRegistry.register(Ventus_Helmet = new ItemVentusArmor(VENTUS, 1, EntityEquipmentSlot.HEAD, 0, Strings.Ventus_Helmet), new ResourceLocation(Reference.MODID, Strings.Ventus_Helmet));
		GameRegistry.register(Ventus_Chestplate = new ItemVentusArmor(VENTUS, 1, EntityEquipmentSlot.CHEST, 1, Strings.Ventus_Chestplate), new ResourceLocation(Reference.MODID, Strings.Ventus_Chestplate));
		GameRegistry.register(Ventus_Leggings = new ItemVentusArmor(VENTUS, 2, EntityEquipmentSlot.LEGS, 2, Strings.Ventus_Leggings), new ResourceLocation(Reference.MODID, Strings.Ventus_Leggings));
		GameRegistry.register(Ventus_Boots = new ItemVentusArmor(VENTUS, 1, EntityEquipmentSlot.FEET, 3, Strings.Ventus_Boots), new ResourceLocation(Reference.MODID, Strings.Ventus_Boots));

		GameRegistry.register(Eraqus_Helmet = new ItemEraqusArmor(ERAQUS, 1, EntityEquipmentSlot.HEAD, 0, Strings.Eraqus_Helmet), new ResourceLocation(Reference.MODID, Strings.Eraqus_Helmet));
		GameRegistry.register(Eraqus_Chestplate = new ItemEraqusArmor(ERAQUS, 1, EntityEquipmentSlot.CHEST, 1, Strings.Eraqus_Chestplate), new ResourceLocation(Reference.MODID, Strings.Eraqus_Chestplate));
		GameRegistry.register(Eraqus_Leggings = new ItemEraqusArmor(ERAQUS, 2, EntityEquipmentSlot.LEGS, 2, Strings.Eraqus_Leggings), new ResourceLocation(Reference.MODID, Strings.Eraqus_Leggings));
		GameRegistry.register(Eraqus_Boots = new ItemEraqusArmor(ERAQUS, 1, EntityEquipmentSlot.FEET, 3, Strings.Eraqus_Boots), new ResourceLocation(Reference.MODID, Strings.Eraqus_Boots));

		// Organization
		//Xemnas
		GameRegistry.register(Interdiction, new ResourceLocation(Reference.MODID, Strings.Interdiction));
		GameRegistry.register(Malice, new ResourceLocation(Reference.MODID, Strings.Malice));
		GameRegistry.register(Infinity, new ResourceLocation(Reference.MODID, Strings.Infinity));
		GameRegistry.register(Aggression, new ResourceLocation(Reference.MODID, Strings.Aggression));
		GameRegistry.register(Sanction, new ResourceLocation(Reference.MODID, Strings.Sanction));

		//Xigbar
		GameRegistry.register(Sharpshooter, new ResourceLocation(Reference.MODID, Strings.Sharpshooter));
		GameRegistry.register(Killerbee, new ResourceLocation(Reference.MODID, Strings.Killerbee));
		GameRegistry.register(Sunrise, new ResourceLocation(Reference.MODID, Strings.Sunrise));
		GameRegistry.register(Precision, new ResourceLocation(Reference.MODID, Strings.Precision));
		GameRegistry.register(Standalone, new ResourceLocation(Reference.MODID, Strings.Standalone));
		GameRegistry.register(FinalWeapon, new ResourceLocation(Reference.MODID, Strings.FinalWeapon));

		//Xaldin
		GameRegistry.register(Lindworm, new ResourceLocation(Reference.MODID, Strings.Lindworm));
		GameRegistry.register(Zephyr, new ResourceLocation(Reference.MODID, Strings.Zephyr));
		GameRegistry.register(Dragonreign, new ResourceLocation(Reference.MODID, Strings.Dragonreign));
		GameRegistry.register(Crux, new ResourceLocation(Reference.MODID, Strings.Crux));

		//Vexen
		GameRegistry.register(FrozenPride, new ResourceLocation(Reference.MODID, Strings.FrozenPride));
		GameRegistry.register(TesterZero, new ResourceLocation(Reference.MODID, Strings.TesterZero));
		GameRegistry.register(ProductOne, new ResourceLocation(Reference.MODID, Strings.ProductOne));
		GameRegistry.register(Inquisition, new ResourceLocation(Reference.MODID, Strings.Inquisition));
		GameRegistry.register(FalseTheory, new ResourceLocation(Reference.MODID, Strings.FalseTheory));

		//Lexaeus
		GameRegistry.register(Skysplitter, new ResourceLocation(Reference.MODID, Strings.Skysplitter));
		GameRegistry.register(Reticence, new ResourceLocation(Reference.MODID, Strings.Reticence));

		//Zexion
		GameRegistry.register(BookofRetribution, new ResourceLocation(Reference.MODID, Strings.BookofRetribution));
		GameRegistry.register(BlackPrimer, new ResourceLocation(Reference.MODID, Strings.BlackPrimer));

		//saix
		GameRegistry.register(Lunatic, new ResourceLocation(Reference.MODID, Strings.Lunatic));
		GameRegistry.register(Twilight, new ResourceLocation(Reference.MODID, Strings.Twilight));

		//Axel
		GameRegistry.register(EternalFlames, new ResourceLocation(Reference.MODID, Strings.EternalFlames));
		GameRegistry.register(Ashes, new ResourceLocation(Reference.MODID, Strings.Ashes));
		GameRegistry.register(Combustion, new ResourceLocation(Reference.MODID, Strings.Combustion));
		GameRegistry.register(Outbreak, new ResourceLocation(Reference.MODID, Strings.Outbreak));
		GameRegistry.register(Burnout, new ResourceLocation(Reference.MODID, Strings.Burnout));
		GameRegistry.register(BlazeofGlory, new ResourceLocation(Reference.MODID, Strings.BlazeofGlory));
		GameRegistry.register(Prometheus, new ResourceLocation(Reference.MODID, Strings.Prometheus));
		GameRegistry.register(Ifrit, new ResourceLocation(Reference.MODID, Strings.Ifrit));
		GameRegistry.register(Prominence, new ResourceLocation(Reference.MODID, Strings.Prominence));

		//Demyx
		GameRegistry.register(Arpeggio, new ResourceLocation(Reference.MODID, Strings.Arpeggio));

		//Luxord
		GameRegistry.register(FairGame, new ResourceLocation(Reference.MODID, Strings.FairGame));
		GameRegistry.register(TheFool, new ResourceLocation(Reference.MODID, Strings.TheFool));

		//Marluxia
		GameRegistry.register(GracefulDahlia, new ResourceLocation(Reference.MODID, Strings.GracefulDahlia));
		GameRegistry.register(FickleErica, new ResourceLocation(Reference.MODID, Strings.FickleErica));
		GameRegistry.register(PoorMelissa, new ResourceLocation(Reference.MODID, Strings.PoorMelissa));
		GameRegistry.register(JiltedAnemone, new ResourceLocation(Reference.MODID, Strings.JiltedAnemone));
		GameRegistry.register(LoftyGerbera, new ResourceLocation(Reference.MODID, Strings.LoftyGerbera));
		GameRegistry.register(HallowedLotus, new ResourceLocation(Reference.MODID, Strings.HallowedLotus));

		//Larxene
		GameRegistry.register(Foudre, new ResourceLocation(Reference.MODID, Strings.Foudre));
		GameRegistry.register(Tranchant, new ResourceLocation(Reference.MODID, Strings.Tranchant));
		GameRegistry.register(Orage, new ResourceLocation(Reference.MODID, Strings.Orage));
		GameRegistry.register(Eruption, new ResourceLocation(Reference.MODID, Strings.Eruption));
		GameRegistry.register(Irregulier, new ResourceLocation(Reference.MODID, Strings.Irregulier));
		GameRegistry.register(Calmant, new ResourceLocation(Reference.MODID, Strings.Calmant));
		GameRegistry.register(Indigo, new ResourceLocation(Reference.MODID, Strings.Indigo));
		GameRegistry.register(Lumineuse, new ResourceLocation(Reference.MODID, Strings.Lumineuse));

		// Knowledge
		GameRegistry.register(AbandonedKnowledge, new ResourceLocation(Reference.MODID, Strings.AbandonedKnowledge));
		GameRegistry.register(DarkKnowledge, new ResourceLocation(Reference.MODID, Strings.DarkKnowledge));
		GameRegistry.register(EclipsedKnowledge, new ResourceLocation(Reference.MODID, Strings.EclipsedKnowledge));
		GameRegistry.register(ForgottenKnowledge, new ResourceLocation(Reference.MODID, Strings.ForgottenKnowledge));
		GameRegistry.register(IlludedKnowledge, new ResourceLocation(Reference.MODID, Strings.IlludedKnowledge));
		GameRegistry.register(LostKnowledge, new ResourceLocation(Reference.MODID, Strings.LostKnowledge));
		GameRegistry.register(ManifestKnowledge, new ResourceLocation(Reference.MODID, Strings.ManifestKnowledge));
		GameRegistry.register(ObscuredKnowledge, new ResourceLocation(Reference.MODID, Strings.ObscuredKnowledge));
		GameRegistry.register(UnknownKnowledge, new ResourceLocation(Reference.MODID, Strings.UnknownKnowledge));
		GameRegistry.register(VoidKnowledge, new ResourceLocation(Reference.MODID, Strings.VoidKnowledge));

		// Keyblades
		GameRegistry.register(AbaddonPlasma, new ResourceLocation(Reference.MODID, Strings.AbaddonPlasma));
		GameRegistry.register(AbyssalTide, new ResourceLocation(Reference.MODID, Strings.AbyssalTide));
		GameRegistry.register(AllforOne, new ResourceLocation(Reference.MODID, Strings.AllforOne));
		GameRegistry.register(AnguisForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.AnguisForetellersKeyblade));
		GameRegistry.register(AstralBlast, new ResourceLocation(Reference.MODID, Strings.AstralBlast));
		GameRegistry.register(Aubade, new ResourceLocation(Reference.MODID, Strings.Aubade));
		GameRegistry.register(BondofFlame, new ResourceLocation(Reference.MODID, Strings.BondofFlame));
		GameRegistry.register(Brightcrest, new ResourceLocation(Reference.MODID, Strings.Brightcrest));
		GameRegistry.register(ChaosRipper, new ResourceLocation(Reference.MODID, Strings.ChaosRipper));
		GameRegistry.register(CircleofLife, new ResourceLocation(Reference.MODID, Strings.CircleofLife));
		GameRegistry.register(Counterpoint, new ResourceLocation(Reference.MODID, Strings.Counterpoint));
		GameRegistry.register(Crabclaw, new ResourceLocation(Reference.MODID, Strings.Crabclaw));
		GameRegistry.register(CrownofGuilt, new ResourceLocation(Reference.MODID, Strings.CrownofGuilt));
		GameRegistry.register(DarkerThanDark, new ResourceLocation(Reference.MODID, Strings.DarkerThanDark));
		GameRegistry.register(Darkgnaw, new ResourceLocation(Reference.MODID, Strings.Darkgnaw));
		GameRegistry.register(DecisivePumpkin, new ResourceLocation(Reference.MODID, Strings.DecisivePumpkin));
		GameRegistry.register(DestinysEmbrace, new ResourceLocation(Reference.MODID, Strings.DestinysEmbrace));
		GameRegistry.register(DiamondDust, new ResourceLocation(Reference.MODID, Strings.DiamondDust));
		GameRegistry.register(Divewing, new ResourceLocation(Reference.MODID, Strings.Divewing));
		GameRegistry.register(DivineRose, new ResourceLocation(Reference.MODID, Strings.DivineRose));
		GameRegistry.register(DreamSword, new ResourceLocation(Reference.MODID, Strings.DreamSword));
		GameRegistry.register(DualDisc, new ResourceLocation(Reference.MODID, Strings.DualDisc));
		GameRegistry.register(Earthshaker, new ResourceLocation(Reference.MODID, Strings.Earthshaker));
		GameRegistry.register(EndofPain, new ResourceLocation(Reference.MODID, Strings.EndofPain));
		GameRegistry.register(EndsoftheEarth, new ResourceLocation(Reference.MODID, Strings.EndsoftheEarth));
		GameRegistry.register(FairyHarp, new ResourceLocation(Reference.MODID, Strings.FairyHarp));
		GameRegistry.register(FairyStars, new ResourceLocation(Reference.MODID, Strings.FairyStars));
		GameRegistry.register(FatalCrest, new ResourceLocation(Reference.MODID, Strings.FatalCrest));
		GameRegistry.register(Fenrir, new ResourceLocation(Reference.MODID, Strings.Fenrir));
		GameRegistry.register(FerrisGear, new ResourceLocation(Reference.MODID, Strings.FerrisGear));
		GameRegistry.register(FollowtheWind, new ResourceLocation(Reference.MODID, Strings.FollowtheWind));
		GameRegistry.register(FrolicFlame, new ResourceLocation(Reference.MODID, Strings.FrolicFlame));
		GameRegistry.register(GlimpseofDarkness, new ResourceLocation(Reference.MODID, Strings.GlimpseofDarkness));
		GameRegistry.register(GuardianBell, new ResourceLocation(Reference.MODID, Strings.GuardianBell));
		GameRegistry.register(GuardianSoul, new ResourceLocation(Reference.MODID, Strings.GuardianSoul));
		GameRegistry.register(GullWing, new ResourceLocation(Reference.MODID, Strings.GullWing));
		GameRegistry.register(HerosCrest, new ResourceLocation(Reference.MODID, Strings.HerosCrest));
		GameRegistry.register(HiddenDragon, new ResourceLocation(Reference.MODID, Strings.HiddenDragon));
		GameRegistry.register(Hyperdrive, new ResourceLocation(Reference.MODID, Strings.Hyperdrive));
		GameRegistry.register(IncompleteKiblade, new ResourceLocation(Reference.MODID, Strings.IncompleteKiblade));
		GameRegistry.register(JungleKing, new ResourceLocation(Reference.MODID, Strings.JungleKing));
		GameRegistry.register(KeybladeofPeoplesHearts, new ResourceLocation(Reference.MODID, Strings.KeybladeofPeoplesHearts));
		GameRegistry.register(Kiblade, new ResourceLocation(Reference.MODID, Strings.Kiblade));
		GameRegistry.register(KingdomKey, new ResourceLocation(Reference.MODID, Strings.KingdomKey));
		GameRegistry.register(KingdomKeyD, new ResourceLocation(Reference.MODID, Strings.KingdomKeyD));
		GameRegistry.register(KnockoutPunch, new ResourceLocation(Reference.MODID, Strings.KnockoutPunch));
		GameRegistry.register(LadyLuck, new ResourceLocation(Reference.MODID, Strings.LadyLuck));
		GameRegistry.register(LeasKeyblade, new ResourceLocation(Reference.MODID, Strings.LeasKeyblade));
		GameRegistry.register(LeopardosForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.LeopardosForetellersKeyblade));
		GameRegistry.register(Leviathan, new ResourceLocation(Reference.MODID, Strings.Leviathan));
		GameRegistry.register(Lionheart, new ResourceLocation(Reference.MODID, Strings.Lionheart));
		GameRegistry.register(LostMemory, new ResourceLocation(Reference.MODID, Strings.LostMemory));
		GameRegistry.register(LunarEclipse, new ResourceLocation(Reference.MODID, Strings.LunarEclipse));
		GameRegistry.register(MarkofaHero, new ResourceLocation(Reference.MODID, Strings.MarkofaHero));
		GameRegistry.register(MasterXehanortsKeyblade, new ResourceLocation(Reference.MODID, Strings.MasterXehanortsKeyblade));
		GameRegistry.register(MastersDefender, new ResourceLocation(Reference.MODID, Strings.MastersDefender));
		GameRegistry.register(MaverickFlare, new ResourceLocation(Reference.MODID, Strings.MaverickFlare));
		GameRegistry.register(MetalChocobo, new ResourceLocation(Reference.MODID, Strings.MetalChocobo));
		GameRegistry.register(MidnightRoar, new ResourceLocation(Reference.MODID, Strings.MidnightRoar));
		GameRegistry.register(MirageSplit, new ResourceLocation(Reference.MODID, Strings.MirageSplit));
		GameRegistry.register(MissingAche, new ResourceLocation(Reference.MODID, Strings.MissingAche));
		GameRegistry.register(Monochrome, new ResourceLocation(Reference.MODID, Strings.Monochrome));
		GameRegistry.register(MysteriousAbyss, new ResourceLocation(Reference.MODID, Strings.MysteriousAbyss));
		GameRegistry.register(NightmaresEnd, new ResourceLocation(Reference.MODID, Strings.NightmaresEnd));
		GameRegistry.register(NightmaresEndandMirageSplit, new ResourceLocation(Reference.MODID, Strings.NightmaresEndandMirageSplit));
		GameRegistry.register(NoName, new ResourceLocation(Reference.MODID, Strings.NoName));
		GameRegistry.register(Oathkeeper, new ResourceLocation(Reference.MODID, Strings.Oathkeeper));
		GameRegistry.register(Oblivion, new ResourceLocation(Reference.MODID, Strings.Oblivion));
		GameRegistry.register(OceansRage, new ResourceLocation(Reference.MODID, Strings.OceansRage));
		GameRegistry.register(Olympia, new ResourceLocation(Reference.MODID, Strings.Olympia));
		GameRegistry.register(OmegaWeapon, new ResourceLocation(Reference.MODID, Strings.OmegaWeapon));
		GameRegistry.register(OminousBlight, new ResourceLocation(Reference.MODID, Strings.OminousBlight));
		GameRegistry.register(OneWingedAngel, new ResourceLocation(Reference.MODID, Strings.OneWingedAngel));
		GameRegistry.register(PainofSolitude, new ResourceLocation(Reference.MODID, Strings.PainofSolitude));
		GameRegistry.register(PhotonDebugger, new ResourceLocation(Reference.MODID, Strings.PhotonDebugger));
		GameRegistry.register(PixiePetal, new ResourceLocation(Reference.MODID, Strings.PixiePetal));
		GameRegistry.register(Pumpkinhead, new ResourceLocation(Reference.MODID, Strings.Pumpkinhead));
		GameRegistry.register(Rainfell, new ResourceLocation(Reference.MODID, Strings.Rainfell));
		GameRegistry.register(RejectionofFate, new ResourceLocation(Reference.MODID, Strings.RejectionofFate));
		GameRegistry.register(RoyalRadiance, new ResourceLocation(Reference.MODID, Strings.RoyalRadiance));
		GameRegistry.register(RumblingRose, new ResourceLocation(Reference.MODID, Strings.RumblingRose));
		GameRegistry.register(SignofInnocence, new ResourceLocation(Reference.MODID, Strings.SignofInnocence));
		GameRegistry.register(SilentDirge, new ResourceLocation(Reference.MODID, Strings.SilentDirge));
		GameRegistry.register(SkullNoise, new ResourceLocation(Reference.MODID, Strings.SkullNoise));
		GameRegistry.register(SleepingLion, new ResourceLocation(Reference.MODID, Strings.SleepingLion));
		GameRegistry.register(SoulEater, new ResourceLocation(Reference.MODID, Strings.SoulEater));
		GameRegistry.register(Spellbinder, new ResourceLocation(Reference.MODID, Strings.Spellbinder));
		GameRegistry.register(StarSeeker, new ResourceLocation(Reference.MODID, Strings.StarSeeker));
		GameRegistry.register(Starlight, new ResourceLocation(Reference.MODID, Strings.Starlight));
		GameRegistry.register(Stormfall, new ResourceLocation(Reference.MODID, Strings.Stormfall));
		GameRegistry.register(StrokeofMidnight, new ResourceLocation(Reference.MODID, Strings.StrokeofMidnight));
		GameRegistry.register(SweetDreams, new ResourceLocation(Reference.MODID, Strings.SweetDreams));
		GameRegistry.register(SweetMemories, new ResourceLocation(Reference.MODID, Strings.SweetMemories));
		GameRegistry.register(Sweetstack, new ResourceLocation(Reference.MODID, Strings.Sweetstack));
		GameRegistry.register(ThreeWishes, new ResourceLocation(Reference.MODID, Strings.ThreeWishes));
		GameRegistry.register(TotalEclipse, new ResourceLocation(Reference.MODID, Strings.TotalEclipse));
		GameRegistry.register(TreasureTrove, new ResourceLocation(Reference.MODID, Strings.TreasureTrove));
		GameRegistry.register(TrueLightsFlight, new ResourceLocation(Reference.MODID, Strings.TrueLightsFlight));
		GameRegistry.register(TwilightBlaze, new ResourceLocation(Reference.MODID, Strings.TwilightBlaze));
		GameRegistry.register(TwoBecomeOne, new ResourceLocation(Reference.MODID, Strings.TwoBecomeOne));
		GameRegistry.register(UltimaWeaponKH1, new ResourceLocation(Reference.MODID, Strings.UltimaWeaponKH1));
		GameRegistry.register(UltimaWeaponKH2, new ResourceLocation(Reference.MODID, Strings.UltimaWeaponKH2));
		GameRegistry.register(UltimaWeaponBBS, new ResourceLocation(Reference.MODID, Strings.UltimaWeaponBBS));
		GameRegistry.register(UltimaWeaponDDD, new ResourceLocation(Reference.MODID, Strings.UltimaWeaponDDD));
		GameRegistry.register(Umbrella, new ResourceLocation(Reference.MODID, Strings.Umbrella));
		GameRegistry.register(Unbound, new ResourceLocation(Reference.MODID, Strings.Unbound));
		GameRegistry.register(UnicornisForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.UnicornisForetellersKeyblade));
		GameRegistry.register(UrsusForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.UrsusForetellersKeyblade));
		GameRegistry.register(VictoryLine, new ResourceLocation(Reference.MODID, Strings.VictoryLine));
		GameRegistry.register(VoidGear, new ResourceLocation(Reference.MODID, Strings.VoidGear));
		GameRegistry.register(VulpeusForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.VulpeusForetellersKeyblade));
		GameRegistry.register(WaytotheDawn, new ResourceLocation(Reference.MODID, Strings.WaytotheDawn));
		GameRegistry.register(WaywardWind, new ResourceLocation(Reference.MODID, Strings.WaywardWind));
		GameRegistry.register(WinnersProof, new ResourceLocation(Reference.MODID, Strings.WinnersProof));
		GameRegistry.register(WishingLamp, new ResourceLocation(Reference.MODID, Strings.WishingLamp));
		GameRegistry.register(WishingStar, new ResourceLocation(Reference.MODID, Strings.WishingStar));
		GameRegistry.register(WoodenKeyblade, new ResourceLocation(Reference.MODID, Strings.WoodenKeyblade));
		GameRegistry.register(WoodenStick, new ResourceLocation(Reference.MODID, Strings.WoodenStick));
		GameRegistry.register(YoungXehanortsKeyblade, new ResourceLocation(Reference.MODID, Strings.YoungXehanortsKeyblade));
		GameRegistry.register(ZeroOne, new ResourceLocation(Reference.MODID, Strings.ZeroOne));

		// CHAINS
		GameRegistry.register(Chain_AbaddonPlasma, new ResourceLocation(Reference.MODID, Strings.Chain_AbaddonPlasma));
		GameRegistry.register(Chain_AbyssalTide, new ResourceLocation(Reference.MODID, Strings.Chain_AbyssalTide));
		GameRegistry.register(Chain_AllforOne, new ResourceLocation(Reference.MODID, Strings.Chain_AllforOne));
		GameRegistry.register(Chain_AnguisForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_AnguisForetellersKeyblade));
		GameRegistry.register(Chain_AstralBlast, new ResourceLocation(Reference.MODID, Strings.Chain_AstralBlast));
		GameRegistry.register(Chain_Aubade, new ResourceLocation(Reference.MODID, Strings.Chain_Aubade));
		GameRegistry.register(Chain_BondofFlame, new ResourceLocation(Reference.MODID, Strings.Chain_BondofFlame));
		GameRegistry.register(Chain_Brightcrest, new ResourceLocation(Reference.MODID, Strings.Chain_Brightcrest));
		GameRegistry.register(Chain_ChaosRipper, new ResourceLocation(Reference.MODID, Strings.Chain_ChaosRipper));
		GameRegistry.register(Chain_CircleofLife, new ResourceLocation(Reference.MODID, Strings.Chain_CircleofLife));
		GameRegistry.register(Chain_Counterpoint, new ResourceLocation(Reference.MODID, Strings.Chain_Counterpoint));
		GameRegistry.register(Chain_Crabclaw, new ResourceLocation(Reference.MODID, Strings.Chain_Crabclaw));
		GameRegistry.register(Chain_CrownofGuilt, new ResourceLocation(Reference.MODID, Strings.Chain_CrownofGuilt));
		GameRegistry.register(Chain_DarkerThanDark, new ResourceLocation(Reference.MODID, Strings.Chain_DarkerThanDark));
		GameRegistry.register(Chain_Darkgnaw, new ResourceLocation(Reference.MODID, Strings.Chain_Darkgnaw));
		GameRegistry.register(Chain_DecisivePumpkin, new ResourceLocation(Reference.MODID, Strings.Chain_DecisivePumpkin));
		GameRegistry.register(Chain_DestinysEmbrace, new ResourceLocation(Reference.MODID, Strings.Chain_DestinysEmbrace));
		GameRegistry.register(Chain_DiamondDust, new ResourceLocation(Reference.MODID, Strings.Chain_DiamondDust));
		GameRegistry.register(Chain_Divewing, new ResourceLocation(Reference.MODID, Strings.Chain_Divewing));
		GameRegistry.register(Chain_DivineRose, new ResourceLocation(Reference.MODID, Strings.Chain_DivineRose));
		GameRegistry.register(Chain_DreamSword, new ResourceLocation(Reference.MODID, Strings.Chain_DreamSword));
		GameRegistry.register(Chain_DualDisc, new ResourceLocation(Reference.MODID, Strings.Chain_DualDisc));
		GameRegistry.register(Chain_Earthshaker, new ResourceLocation(Reference.MODID, Strings.Chain_Earthshaker));
		GameRegistry.register(Chain_EndofPain, new ResourceLocation(Reference.MODID, Strings.Chain_EndofPain));
		GameRegistry.register(Chain_EndsoftheEarth, new ResourceLocation(Reference.MODID, Strings.Chain_EndsoftheEarth));
		GameRegistry.register(Chain_FairyHarp, new ResourceLocation(Reference.MODID, Strings.Chain_FairyHarp));
		GameRegistry.register(Chain_FairyStars, new ResourceLocation(Reference.MODID, Strings.Chain_FairyStars));
		GameRegistry.register(Chain_FatalCrest, new ResourceLocation(Reference.MODID, Strings.Chain_FatalCrest));
		GameRegistry.register(Chain_Fenrir, new ResourceLocation(Reference.MODID, Strings.Chain_Fenrir));
		GameRegistry.register(Chain_FerrisGear, new ResourceLocation(Reference.MODID, Strings.Chain_FerrisGear));
		GameRegistry.register(Chain_FollowtheWind, new ResourceLocation(Reference.MODID, Strings.Chain_FollowtheWind));
		GameRegistry.register(Chain_FrolicFlame, new ResourceLocation(Reference.MODID, Strings.Chain_FrolicFlame));
		GameRegistry.register(Chain_GlimpseofDarkness, new ResourceLocation(Reference.MODID, Strings.Chain_GlimpseofDarkness));
		GameRegistry.register(Chain_GuardianBell, new ResourceLocation(Reference.MODID, Strings.Chain_GuardianBell));
		GameRegistry.register(Chain_GuardianSoul, new ResourceLocation(Reference.MODID, Strings.Chain_GuardianSoul));
		GameRegistry.register(Chain_GullWing, new ResourceLocation(Reference.MODID, Strings.Chain_GullWing));
		GameRegistry.register(Chain_HerosCrest, new ResourceLocation(Reference.MODID, Strings.Chain_HerosCrest));
		GameRegistry.register(Chain_HiddenDragon, new ResourceLocation(Reference.MODID, Strings.Chain_HiddenDragon));
		GameRegistry.register(Chain_Hyperdrive, new ResourceLocation(Reference.MODID, Strings.Chain_Hyperdrive));
		GameRegistry.register(Chain_IncompleteKiblade, new ResourceLocation(Reference.MODID, Strings.Chain_IncompleteKiblade));
		GameRegistry.register(Chain_JungleKing, new ResourceLocation(Reference.MODID, Strings.Chain_JungleKing));
		GameRegistry.register(Chain_KeybladeofPeoplesHearts, new ResourceLocation(Reference.MODID, Strings.Chain_KeybladeofPeoplesHearts));
		GameRegistry.register(Chain_Kiblade, new ResourceLocation(Reference.MODID, Strings.Chain_Kiblade));
		GameRegistry.register(Chain_KingdomKey, new ResourceLocation(Reference.MODID, Strings.Chain_KingdomKey));
		GameRegistry.register(Chain_KingdomKeyD, new ResourceLocation(Reference.MODID, Strings.Chain_KingdomKeyD));
		GameRegistry.register(Chain_KnockoutPunch, new ResourceLocation(Reference.MODID, Strings.Chain_KnockoutPunch));
		GameRegistry.register(Chain_LadyLuck, new ResourceLocation(Reference.MODID, Strings.Chain_LadyLuck));
		GameRegistry.register(Chain_LeasKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_LeasKeyblade));
		GameRegistry.register(Chain_LeopardosForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_LeopardosForetellersKeyblade));
		GameRegistry.register(Chain_Leviathan, new ResourceLocation(Reference.MODID, Strings.Chain_Leviathan));
		GameRegistry.register(Chain_Lionheart, new ResourceLocation(Reference.MODID, Strings.Chain_Lionheart));
		GameRegistry.register(Chain_LostMemory, new ResourceLocation(Reference.MODID, Strings.Chain_LostMemory));
		GameRegistry.register(Chain_LunarEclipse, new ResourceLocation(Reference.MODID, Strings.Chain_LunarEclipse));
		GameRegistry.register(Chain_MarkofaHero, new ResourceLocation(Reference.MODID, Strings.Chain_MarkofaHero));
		GameRegistry.register(Chain_MasterXehanortsKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_MasterXehanortsKeyblade));
		GameRegistry.register(Chain_MastersDefender, new ResourceLocation(Reference.MODID, Strings.Chain_MastersDefender));
		GameRegistry.register(Chain_MaverickFlare, new ResourceLocation(Reference.MODID, Strings.Chain_MaverickFlare));
		GameRegistry.register(Chain_MetalChocobo, new ResourceLocation(Reference.MODID, Strings.Chain_MetalChocobo));
		GameRegistry.register(Chain_MidnightRoar, new ResourceLocation(Reference.MODID, Strings.Chain_MidnightRoar));
		GameRegistry.register(Chain_MirageSplit, new ResourceLocation(Reference.MODID, Strings.Chain_MirageSplit));
		GameRegistry.register(Chain_MissingAche, new ResourceLocation(Reference.MODID, Strings.Chain_MissingAche));
		GameRegistry.register(Chain_Monochrome, new ResourceLocation(Reference.MODID, Strings.Chain_Monochrome));
		GameRegistry.register(Chain_MysteriousAbyss, new ResourceLocation(Reference.MODID, Strings.Chain_MysteriousAbyss));
		GameRegistry.register(Chain_NightmaresEnd, new ResourceLocation(Reference.MODID, Strings.Chain_NightmaresEnd));
		GameRegistry.register(Chain_NightmaresEndandMirageSplit, new ResourceLocation(Reference.MODID, Strings.Chain_NightmaresEndandMirageSplit));
		GameRegistry.register(Chain_NoName, new ResourceLocation(Reference.MODID, Strings.Chain_NoName));
		GameRegistry.register(Chain_Oathkeeper, new ResourceLocation(Reference.MODID, Strings.Chain_Oathkeeper));
		GameRegistry.register(Chain_Oblivion, new ResourceLocation(Reference.MODID, Strings.Chain_Oblivion));
		GameRegistry.register(Chain_OceansRage, new ResourceLocation(Reference.MODID, Strings.Chain_OceansRage));
		GameRegistry.register(Chain_Olympia, new ResourceLocation(Reference.MODID, Strings.Chain_Olympia));
		GameRegistry.register(Chain_OmegaWeapon, new ResourceLocation(Reference.MODID, Strings.Chain_OmegaWeapon));
		GameRegistry.register(Chain_OminousBlight, new ResourceLocation(Reference.MODID, Strings.Chain_OminousBlight));
		GameRegistry.register(Chain_OneWingedAngel, new ResourceLocation(Reference.MODID, Strings.Chain_OneWingedAngel));
		GameRegistry.register(Chain_PainofSolitude, new ResourceLocation(Reference.MODID, Strings.Chain_PainofSolitude));
		GameRegistry.register(Chain_PhotonDebugger, new ResourceLocation(Reference.MODID, Strings.Chain_PhotonDebugger));
		GameRegistry.register(Chain_PixiePetal, new ResourceLocation(Reference.MODID, Strings.Chain_PixiePetal));
		GameRegistry.register(Chain_Pumpkinhead, new ResourceLocation(Reference.MODID, Strings.Chain_Pumpkinhead));
		GameRegistry.register(Chain_Rainfell, new ResourceLocation(Reference.MODID, Strings.Chain_Rainfell));
		GameRegistry.register(Chain_RejectionofFate, new ResourceLocation(Reference.MODID, Strings.Chain_RejectionofFate));
		GameRegistry.register(Chain_RoyalRadiance, new ResourceLocation(Reference.MODID, Strings.Chain_RoyalRadiance));
		GameRegistry.register(Chain_RumblingRose, new ResourceLocation(Reference.MODID, Strings.Chain_RumblingRose));
		GameRegistry.register(Chain_SignofInnocence, new ResourceLocation(Reference.MODID, Strings.Chain_SignofInnocence));
		GameRegistry.register(Chain_SilentDirge, new ResourceLocation(Reference.MODID, Strings.Chain_SilentDirge));
		GameRegistry.register(Chain_SkullNoise, new ResourceLocation(Reference.MODID, Strings.Chain_SkullNoise));
		GameRegistry.register(Chain_SleepingLion, new ResourceLocation(Reference.MODID, Strings.Chain_SleepingLion));
		GameRegistry.register(Chain_SoulEater, new ResourceLocation(Reference.MODID, Strings.Chain_SoulEater));
		GameRegistry.register(Chain_Spellbinder, new ResourceLocation(Reference.MODID, Strings.Chain_Spellbinder));
		GameRegistry.register(Chain_StarSeeker, new ResourceLocation(Reference.MODID, Strings.Chain_StarSeeker));
		GameRegistry.register(Chain_Starlight, new ResourceLocation(Reference.MODID, Strings.Chain_Starlight));
		GameRegistry.register(Chain_Stormfall, new ResourceLocation(Reference.MODID, Strings.Chain_Stormfall));
		GameRegistry.register(Chain_StrokeofMidnight, new ResourceLocation(Reference.MODID, Strings.Chain_StrokeofMidnight));
		GameRegistry.register(Chain_SweetDreams, new ResourceLocation(Reference.MODID, Strings.Chain_SweetDreams));
		GameRegistry.register(Chain_SweetMemories, new ResourceLocation(Reference.MODID, Strings.Chain_SweetMemories));
		GameRegistry.register(Chain_Sweetstack, new ResourceLocation(Reference.MODID, Strings.Chain_Sweetstack));
		GameRegistry.register(Chain_ThreeWishes, new ResourceLocation(Reference.MODID, Strings.Chain_ThreeWishes));
		GameRegistry.register(Chain_TotalEclipse, new ResourceLocation(Reference.MODID, Strings.Chain_TotalEclipse));
		GameRegistry.register(Chain_TreasureTrove, new ResourceLocation(Reference.MODID, Strings.Chain_TreasureTrove));
		GameRegistry.register(Chain_TrueLightsFlight, new ResourceLocation(Reference.MODID, Strings.Chain_TrueLightsFlight));
		GameRegistry.register(Chain_TwilightBlaze, new ResourceLocation(Reference.MODID, Strings.Chain_TwilightBlaze));
		GameRegistry.register(Chain_TwoBecomeOne, new ResourceLocation(Reference.MODID, Strings.Chain_TwoBecomeOne));
		GameRegistry.register(Chain_UltimaWeaponKH1, new ResourceLocation(Reference.MODID, Strings.Chain_UltimaWeaponKH1));
		GameRegistry.register(Chain_UltimaWeaponKH2, new ResourceLocation(Reference.MODID, Strings.Chain_UltimaWeaponKH2));
		GameRegistry.register(Chain_UltimaWeaponBBS, new ResourceLocation(Reference.MODID, Strings.Chain_UltimaWeaponBBS));
		GameRegistry.register(Chain_UltimaWeaponDDD, new ResourceLocation(Reference.MODID, Strings.Chain_UltimaWeaponDDD));
		GameRegistry.register(Chain_Umbrella, new ResourceLocation(Reference.MODID, Strings.Chain_Umbrella));
		GameRegistry.register(Chain_Unbound, new ResourceLocation(Reference.MODID, Strings.Chain_Unbound));
		GameRegistry.register(Chain_UnicornisForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_UnicornisForetellersKeyblade));
		GameRegistry.register(Chain_UrsusForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_UrsusForetellersKeyblade));
		GameRegistry.register(Chain_VictoryLine, new ResourceLocation(Reference.MODID, Strings.Chain_VictoryLine));
		GameRegistry.register(Chain_VoidGear, new ResourceLocation(Reference.MODID, Strings.Chain_VoidGear));
		GameRegistry.register(Chain_VulpeusForetellersKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_VulpeusForetellersKeyblade));
		GameRegistry.register(Chain_WaytotheDawn, new ResourceLocation(Reference.MODID, Strings.Chain_WaytotheDawn));
		GameRegistry.register(Chain_WaywardWind, new ResourceLocation(Reference.MODID, Strings.Chain_WaywardWind));
		GameRegistry.register(Chain_WinnersProof, new ResourceLocation(Reference.MODID, Strings.Chain_WinnersProof));
		GameRegistry.register(Chain_WishingLamp, new ResourceLocation(Reference.MODID, Strings.Chain_WishingLamp));
		GameRegistry.register(Chain_WishingStar, new ResourceLocation(Reference.MODID, Strings.Chain_WishingStar));
		GameRegistry.register(Chain_YoungXehanortsKeyblade, new ResourceLocation(Reference.MODID, Strings.Chain_YoungXehanortsKeyblade));
		GameRegistry.register(Chain_ZeroOne, new ResourceLocation(Reference.MODID, Strings.Chain_ZeroOne));

		// ITEMS
		GameRegistry.register(Munny, new ResourceLocation(Reference.MODID, Strings.Munny));
		GameRegistry.register(EmptyBottle, new ResourceLocation(Reference.MODID, Strings.EmptyBottle));
		GameRegistry.register(Potion, new ResourceLocation(Reference.MODID, Strings.Potion));
        GameRegistry.register(HiPotion, new ResourceLocation(Reference.MODID, Strings.HiPotion));
        GameRegistry.register(MegaPotion, new ResourceLocation(Reference.MODID, Strings.MegaPotion));
		GameRegistry.register(Ether, new ResourceLocation(Reference.MODID, Strings.Ether));
        GameRegistry.register(MegaEther, new ResourceLocation(Reference.MODID, Strings.MegaEther));
		GameRegistry.register(Elixir, new ResourceLocation(Reference.MODID, Strings.Elixir));
        GameRegistry.register(Megalixir, new ResourceLocation(Reference.MODID, Strings.Megalixir));
        GameRegistry.register(DriveRecovery, new ResourceLocation(Reference.MODID, Strings.DriveRecovery));
        GameRegistry.register(HighDriveRecovery, new ResourceLocation(Reference.MODID, Strings.HighDriveRecovery));
        GameRegistry.register(Panacaea, new ResourceLocation(Reference.MODID, Strings.Panacea));
        GameRegistry.register(DefenseBoost, new ResourceLocation(Reference.MODID, Strings.DefenseBoost));
        GameRegistry.register(PowerBoost, new ResourceLocation(Reference.MODID, Strings.PowerBoost));
        GameRegistry.register(MagicBoost, new ResourceLocation(Reference.MODID, Strings.MagicBoost));
		GameRegistry.register(HpOrb, new ResourceLocation(Reference.MODID, Strings.HpOrb));
		GameRegistry.register(DriveOrb, new ResourceLocation(Reference.MODID, Strings.DriveOrb));
		GameRegistry.register(MagicOrb, new ResourceLocation(Reference.MODID, Strings.MagicOrb));
		GameRegistry.register(Heart, new ResourceLocation(Reference.MODID, Strings.Heart));
		GameRegistry.register(DarkHeart, new ResourceLocation(Reference.MODID, Strings.DarkHeart));
		GameRegistry.register(PureHeart, new ResourceLocation(Reference.MODID, Strings.PureHeart));
		GameRegistry.register(KingdomHearts, new ResourceLocation(Reference.MODID, Strings.KingdomHearts));
		GameRegistry.register(DarkLeather, new ResourceLocation(Reference.MODID, Strings.DarkLeather));
		GameRegistry.register(SynthesisMaterial, new ResourceLocation(Reference.MODID, Strings.SynthesisMaterial));
		GameRegistry.register(Recipe, new ResourceLocation(Reference.MODID, Strings.Recipe));
		GameRegistry.register(IceCream, new ResourceLocation(Reference.MODID, Strings.IceCream));
		GameRegistry.register(WinnerStick, new ResourceLocation(Reference.MODID, Strings.WinnerStick));
		GameRegistry.register(LevelUpMagicFire, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicFire));
		GameRegistry.register(LevelUpMagicBlizzard, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicBlizzard));
		GameRegistry.register(LevelUpMagicThunder, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicThunder));
		GameRegistry.register(LevelUpMagicCure, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicCure));
		GameRegistry.register(LevelUpMagicAero, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicAero));
		GameRegistry.register(LevelUpMagicStop, new ResourceLocation(Reference.MODID, Strings.LevelUpMagicStop));
		GameRegistry.register(LevelUpValor, new ResourceLocation(Reference.MODID, Strings.LevelUpValor));
		GameRegistry.register(LevelUpWisdom, new ResourceLocation(Reference.MODID, Strings.LevelUpWisdom));
		GameRegistry.register(LevelUpLimit, new ResourceLocation(Reference.MODID, Strings.LevelUpLimit));
		GameRegistry.register(LevelUpMaster, new ResourceLocation(Reference.MODID, Strings.LevelUpMaster));
		GameRegistry.register(LevelUpFinal, new ResourceLocation(Reference.MODID, Strings.LevelUpFinal));
		GameRegistry.register(SynthesisBagS, new ResourceLocation(Reference.MODID, Strings.SynthesisBagS));
		GameRegistry.register(SynthesisBagM, new ResourceLocation(Reference.MODID, Strings.SynthesisBagM));
		GameRegistry.register(SynthesisBagL, new ResourceLocation(Reference.MODID, Strings.SynthesisBagL));

		// DISCS
		GameRegistry.register(Disc_Birth_by_Sleep_A_Link_to_the_Future, new ResourceLocation(Reference.MODID, Strings.Disc_Birth_by_Sleep_A_Link_to_the_Future));
		GameRegistry.register(Disc_Darkness_of_the_Unknown, new ResourceLocation(Reference.MODID, Strings.Disc_Darkness_of_the_Unknown));
		GameRegistry.register(Disc_Dearly_Beloved_Symphony_Version, new ResourceLocation(Reference.MODID, Strings.Disc_Dearly_Beloved_Symphony_Version));
		GameRegistry.register(Disc_Dream_Drop_Distance_The_Next_Awakening, new ResourceLocation(Reference.MODID, Strings.Disc_Dream_Drop_Distance_The_Next_Awakening));
		GameRegistry.register(Disc_Hikari_KINGDOM_Instrumental_Version, new ResourceLocation(Reference.MODID, Strings.Disc_Hikari_KINGDOM_Instrumental_Version));
		GameRegistry.register(Disc_L_Oscurita_Dell_Ignoto, new ResourceLocation(Reference.MODID, Strings.Disc_L_Oscurita_Dell_Ignoto));
		GameRegistry.register(Disc_Musique_pour_la_tristesse_de_Xion, new ResourceLocation(Reference.MODID, Strings.Disc_Musique_pour_la_tristesse_de_Xion));
		GameRegistry.register(Disc_No_More_Bugs_Bug_Version, new ResourceLocation(Reference.MODID, Strings.Disc_No_More_Bugs_Bug_Version));
		GameRegistry.register(Disc_Organization_XIII, new ResourceLocation(Reference.MODID, Strings.Disc_Organization_XIII));
		GameRegistry.register(Disc_Sanctuary, new ResourceLocation(Reference.MODID, Strings.Disc_Sanctuary));
		GameRegistry.register(Disc_Simple_And_Clean_PLANITb_Remix, new ResourceLocation(Reference.MODID, Strings.Disc_Simple_And_Clean_PLANITb_Remix));
		GameRegistry.register(Disc_Sinister_Sundown, new ResourceLocation(Reference.MODID, Strings.Disc_Sinister_Sundown));
		GameRegistry.register(Disc_The_13th_Anthology, new ResourceLocation(Reference.MODID, Strings.Disc_The_13th_Anthology));
	}

	public static void registerRenders () {
		// Materials
		registerRender(BlazingInfusedCoal);
		registerRender(FrostInfusedSnowBall);
		registerRender(StormyInfusedIron);
		registerRender(MythrilInfusedDiamond);
		registerRender(LightningInfusedGold);
		registerRender(BrightInfusedGlowStone);
		registerRender(DarkInfusedIron);

		// Armour
		registerRender(OrganizationRobe_Helmet);
		registerRender(OrganizationRobe_Chestplate);
		registerRender(OrganizationRobe_Leggings);
		registerRender(OrganizationRobe_Boots);

		registerRender(Terra_Helmet);
		registerRender(Terra_Chestplate);
		registerRender(Terra_Leggings);
		registerRender(Terra_Boots);

		registerRender(Aqua_Helmet);
		registerRender(Aqua_Chestplate);
		registerRender(Aqua_Leggings);
		registerRender(Aqua_Boots);

		registerRender(Ventus_Helmet);
		registerRender(Ventus_Chestplate);
		registerRender(Ventus_Leggings);
		registerRender(Ventus_Boots);

		registerRender(Eraqus_Helmet);
		registerRender(Eraqus_Chestplate);
		registerRender(Eraqus_Leggings);
		registerRender(Eraqus_Boots);

		// Organization
		registerRender(Interdiction);
		registerRender(Sharpshooter);
		registerRender(Lindworm);
		registerRender(Skysplitter);
		registerRender(BookofRetribution);
		registerRender(Lunatic);
		registerRender(FairGame);

		// Knowledge
		registerRender(AbandonedKnowledge);
		registerRender(DarkKnowledge);
		registerRender(EclipsedKnowledge);
		registerRender(ForgottenKnowledge);
		registerRender(IlludedKnowledge);
		registerRender(LostKnowledge);
		registerRender(ManifestKnowledge);
		registerRender(ObscuredKnowledge);
		registerRender(UnknownKnowledge);
		registerRender(VoidKnowledge);

		// Keyblades
		registerRender(AbaddonPlasma);
		registerRender(AbyssalTide);
		registerRender(AnguisForetellersKeyblade);
		registerRender(AstralBlast);
		registerRender(Aubade);
		registerRender(CrownofGuilt);
		registerRender(DarkerThanDark);
		registerRender(GlimpseofDarkness);
		registerRender(LeopardosForetellersKeyblade);
		registerRender(Leviathan);
		registerRender(LunarEclipse);
		registerRender(MaverickFlare);
		registerRender(MidnightRoar);
		registerRender(OmegaWeapon);
		registerRender(OminousBlight);
		registerRender(PixiePetal);
		registerRender(RejectionofFate);
		registerRender(SignofInnocence);
		registerRender(SilentDirge);
		registerRender(Starlight);
		registerRender(TotalEclipse);
		registerRender(TwilightBlaze);
		registerRender(Umbrella);
		registerRender(UnicornisForetellersKeyblade);
		registerRender(UrsusForetellersKeyblade);
		registerRender(VulpeusForetellersKeyblade);
		registerRender(ZeroOne);

		// CHAINS
		registerRender(Chain_AbaddonPlasma);
		registerRender(Chain_AbyssalTide);
		registerRender(Chain_AllforOne);
		registerRender(Chain_AnguisForetellersKeyblade);
		registerRender(Chain_AstralBlast);
		registerRender(Chain_Aubade);
		registerRender(Chain_BondofFlame);
		registerRender(Chain_Brightcrest);
		registerRender(Chain_ChaosRipper);
		registerRender(Chain_CircleofLife);
		registerRender(Chain_Counterpoint);
		registerRender(Chain_Counterpoint);
		registerRender(Chain_Crabclaw);
		registerRender(Chain_CrownofGuilt);
		registerRender(Chain_DarkerThanDark);
		registerRender(Chain_Darkgnaw);
		registerRender(Chain_DecisivePumpkin);
		registerRender(Chain_DestinysEmbrace);
		registerRender(Chain_DiamondDust);
		registerRender(Chain_Divewing);
		registerRender(Chain_DivineRose);
		registerRender(Chain_DreamSword);
		registerRender(Chain_DualDisc);
		registerRender(Chain_Earthshaker);
		registerRender(Chain_EndofPain);
		registerRender(Chain_EndsoftheEarth);
		registerRender(Chain_FairyHarp);
		registerRender(Chain_FairyStars);
		registerRender(Chain_FatalCrest);
		registerRender(Chain_Fenrir);
		registerRender(Chain_FerrisGear);
		registerRender(Chain_FollowtheWind);
		registerRender(Chain_FrolicFlame);
		registerRender(Chain_GlimpseofDarkness);
		registerRender(Chain_GuardianBell);
		registerRender(Chain_GuardianSoul);
		registerRender(Chain_GullWing);
		registerRender(Chain_HerosCrest);
		registerRender(Chain_HiddenDragon);
		registerRender(Chain_Hyperdrive);
		registerRender(Chain_IncompleteKiblade);
		registerRender(Chain_JungleKing);
		registerRender(Chain_KeybladeofPeoplesHearts);
		registerRender(Chain_Kiblade);
		registerRender(Chain_KingdomKey);
		registerRender(Chain_KingdomKeyD);
		registerRender(Chain_KnockoutPunch);
		registerRender(Chain_LadyLuck);
		registerRender(Chain_LeasKeyblade);
		registerRender(Chain_LeopardosForetellersKeyblade);
		registerRender(Chain_Leviathan);
		registerRender(Chain_Lionheart);
		registerRender(Chain_LostMemory);
		registerRender(Chain_LunarEclipse);
		registerRender(Chain_MarkofaHero);
		registerRender(Chain_MasterXehanortsKeyblade);
		registerRender(Chain_MastersDefender);
		registerRender(Chain_MaverickFlare);
		registerRender(Chain_MetalChocobo);
		registerRender(Chain_MidnightRoar);
		registerRender(Chain_MirageSplit);
		registerRender(Chain_MissingAche);
		registerRender(Chain_Monochrome);
		registerRender(Chain_MysteriousAbyss);
		registerRender(Chain_NightmaresEnd);
		registerRender(Chain_NightmaresEndandMirageSplit);
		registerRender(Chain_NoName);
		registerRender(Chain_Oathkeeper);
		registerRender(Chain_Oblivion);
		registerRender(Chain_OceansRage);
		registerRender(Chain_Olympia);
		registerRender(Chain_OmegaWeapon);
		registerRender(Chain_OminousBlight);
		registerRender(Chain_OneWingedAngel);
		registerRender(Chain_PainofSolitude);
		registerRender(Chain_PhotonDebugger);
		registerRender(Chain_PixiePetal);
		registerRender(Chain_Pumpkinhead);
		registerRender(Chain_Rainfell);
		registerRender(Chain_RejectionofFate);
		registerRender(Chain_RoyalRadiance);
		registerRender(Chain_RumblingRose);
		registerRender(Chain_SignofInnocence);
		registerRender(Chain_SilentDirge);
		registerRender(Chain_SkullNoise);
		registerRender(Chain_SleepingLion);
		registerRender(Chain_SoulEater);
		registerRender(Chain_Spellbinder);
		registerRender(Chain_StarSeeker);
		registerRender(Chain_Starlight);
		registerRender(Chain_Stormfall);
		registerRender(Chain_StrokeofMidnight);
		registerRender(Chain_SweetDreams);
		registerRender(Chain_SweetMemories);
		registerRender(Chain_Sweetstack);
		registerRender(Chain_ThreeWishes);
		registerRender(Chain_TotalEclipse);
		registerRender(Chain_TreasureTrove);
		registerRender(Chain_TrueLightsFlight);
		registerRender(Chain_TwilightBlaze);
		registerRender(Chain_TwoBecomeOne);
		registerRender(Chain_UltimaWeaponKH1);
		registerRender(Chain_UltimaWeaponKH2);
		registerRender(Chain_UltimaWeaponBBS);
		registerRender(Chain_UltimaWeaponDDD);
		registerRender(Chain_Umbrella);
		registerRender(Chain_Unbound);
		registerRender(Chain_UnicornisForetellersKeyblade);
		registerRender(Chain_UrsusForetellersKeyblade);
		registerRender(Chain_VictoryLine);
		registerRender(Chain_VoidGear);
		registerRender(Chain_VulpeusForetellersKeyblade);
		registerRender(Chain_WaytotheDawn);
		registerRender(Chain_WaywardWind);
		registerRender(Chain_WinnersProof);
		registerRender(Chain_WishingLamp);
		registerRender(Chain_WishingStar);
		registerRender(Chain_YoungXehanortsKeyblade);
		registerRender(Chain_ZeroOne);

		// Other items
		registerRender(Munny);
		registerRender(EmptyBottle);
		registerRender(Potion);
        registerRender(HiPotion);
        registerRender(MegaPotion);
		registerRender(Ether);
        registerRender(MegaEther);
		registerRender(Elixir);
        registerRender(Megalixir);
        registerRender(DriveRecovery);
        registerRender(HighDriveRecovery);
        registerRender(Panacaea);
        registerRender(DefenseBoost);
        registerRender(MagicBoost);
        registerRender(PowerBoost);
		registerRender(HpOrb);
		registerRender(DriveOrb);
		registerRender(MagicOrb);
		registerRender(Heart);
		registerRender(DarkHeart);
		registerRender(PureHeart);
		registerRender(KingdomHearts);
		registerRender(DarkLeather);
		registerRender(SynthesisMaterial);
		registerRender(Recipe);
		registerRender(IceCream);
		registerRender(WinnerStick);
		registerRender(LevelUpMagicFire);
		registerRender(LevelUpMagicBlizzard);
		registerRender(LevelUpMagicThunder);
		registerRender(LevelUpMagicCure);
		registerRender(LevelUpMagicAero);
		registerRender(LevelUpMagicStop);
		registerRender(LevelUpValor);
		registerRender(LevelUpWisdom);
		registerRender(LevelUpLimit);
		registerRender(LevelUpMaster);
		registerRender(LevelUpFinal);
		registerRender(SynthesisBagS);
		registerRender(SynthesisBagM);
		registerRender(SynthesisBagL);

		// Discs
		registerRender(Disc_Birth_by_Sleep_A_Link_to_the_Future);
		registerRender(Disc_Darkness_of_the_Unknown);
		registerRender(Disc_Dearly_Beloved_Symphony_Version);
		registerRender(Disc_Dream_Drop_Distance_The_Next_Awakening);
		registerRender(Disc_Hikari_KINGDOM_Instrumental_Version);
		registerRender(Disc_L_Oscurita_Dell_Ignoto);
		registerRender(Disc_Musique_pour_la_tristesse_de_Xion);
		registerRender(Disc_No_More_Bugs_Bug_Version);
		registerRender(Disc_Organization_XIII);
		registerRender(Disc_Sanctuary);
		registerRender(Disc_Simple_And_Clean_PLANITb_Remix);
		registerRender(Disc_Sinister_Sundown);
		registerRender(Disc_The_13th_Anthology);

	}

	public static void registerRender (Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
