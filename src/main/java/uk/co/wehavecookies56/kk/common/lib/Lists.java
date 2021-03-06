package uk.co.wehavecookies56.kk.common.lib;

import static uk.co.wehavecookies56.kk.common.item.ModItems.*;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import uk.co.wehavecookies56.kk.common.util.Utils;

public class Lists {

    public static List<String> recipes = new ArrayList<String>();

    public static List<Item> Xemnas = new ArrayList<Item>();
    public static List<Item> Xigbar = new ArrayList<Item>();
    public static List<Item> Xaldin = new ArrayList<Item>();
    public static List<Item> Vexen = new ArrayList<Item>();
    public static List<Item> Lexaeus = new ArrayList<Item>();
    public static List<Item> Zexion = new ArrayList<Item>();
    public static List<Item> Saix = new ArrayList<Item>();
    public static List<Item> Axel = new ArrayList<Item>();
    public static List<Item> Demyx = new ArrayList<Item>();
    public static List<Item> Luxord = new ArrayList<Item>();
    public static List<Item> Marluxia = new ArrayList<Item>();
    public static List<Item> Larxene = new ArrayList<Item>();
    public static List<Item> Roxas = new ArrayList<>();

    public static List<Item> getListForMember(Utils.OrgMember member) {
        switch (member) {
            case AXEL: return Axel;
            case DEMYX: return Demyx;
            case LARXENE: return Larxene;
            case LEXAEUS: return Lexaeus;
            case LUXORD: return Luxord;
            case MARLUXIA: return Marluxia;
            case ROXAS: return Roxas;
            case SAIX: return Saix;
            case VEXEN: return Vexen;
            case XALDIN: return Xaldin;
            case XEMNAS: return Xemnas;
            case XIGBAR: return Xigbar;
            case ZEXION: return Zexion;
            case NONE: return null;
        }
        return null;
    }

    public static void init () {

        //Xemnas
        Xemnas.add(Malice);
        Xemnas.add(Sanction);
        Xemnas.add(Overlord);
        Xemnas.add(Veneration);
        Xemnas.add(Autocracy);
        Xemnas.add(Conquest);
        Xemnas.add(Terminus);
        Xemnas.add(Judgement);
        Xemnas.add(Discipline);
        Xemnas.add(Aristocracy);
        Xemnas.add(Superiority);
        Xemnas.add(Aggression);
        Xemnas.add(Fury);
        Xemnas.add(Despair);
        Xemnas.add(Triumph);
        Xemnas.add(Ruination);
        Xemnas.add(Domination);
        Xemnas.add(Annihilation);
        Xemnas.add(Tyrant);
        Xemnas.add(Magnificence);
        Xemnas.add(Infinity);
        Xemnas.add(Interdiction);
        Xemnas.add(RoundFan);
        Xemnas.add(Absolute);

        //Xigbar
        Xigbar.add(Standalone);
        Xigbar.add(Killerbee);
        Xigbar.add(Stingray);
        Xigbar.add(Counterweight);
        Xigbar.add(Precision);
        Xigbar.add(DualHead);
        Xigbar.add(Bahamut);
        Xigbar.add(Gullwing);
        Xigbar.add(BlueFrame);
        Xigbar.add(StarShell);
        Xigbar.add(Sunrise);
        Xigbar.add(Ignition);
        Xigbar.add(Armstrong);
        Xigbar.add(HardBoiledHeat);
        Xigbar.add(DiabloEye);
        Xigbar.add(DoubleTap);
        Xigbar.add(Stardust);
        Xigbar.add(EnergyMuzzle);
        Xigbar.add(CrimeAndPunishment);
        Xigbar.add(CupidsArrow);
        Xigbar.add(FinalWeapon);
        Xigbar.add(Sharpshooter);
        Xigbar.add(Dryer);
        Xigbar.add(Trumpet);

        //Xaldin
        Xaldin.add(Zephyr);
        Xaldin.add(Moonglade);
        Xaldin.add(Aer);
        Xaldin.add(Nescience);
        Xaldin.add(Brume);
        Xaldin.add(Asura);
        Xaldin.add(Crux);
        Xaldin.add(Paladin);
        Xaldin.add(Fellking);
        Xaldin.add(Nightcloud);
        Xaldin.add(Shimmer);
        Xaldin.add(Vortex);
        Xaldin.add(Scission);
        Xaldin.add(Heavenfall);
        Xaldin.add(Aether);
        Xaldin.add(Mazzaroth);
        Xaldin.add(Hegemon);
        Xaldin.add(Foxfire);
        Xaldin.add(Yaksha);
        Xaldin.add(Cynosura);
        Xaldin.add(Dragonreign);
        Xaldin.add(Lindworm);
        Xaldin.add(Broom);
        Xaldin.add(Wyvern);

        //Vexen
        Vexen.add(TesterZero);
        Vexen.add(ProductOne);
        Vexen.add(DeepFreeze);
        Vexen.add(CryoliteShield);
        Vexen.add(FalseTheory);
        Vexen.add(Glacier);
        Vexen.add(AbsoluteZero);
        Vexen.add(Gunz);
        Vexen.add(Mindel);
        Vexen.add(Snowslide);
        Vexen.add(Iceberg);
        Vexen.add(Inquisition);
        Vexen.add(Scrutiny);
        Vexen.add(Empiricism);
        Vexen.add(Edification);
        Vexen.add(Contrivance);
        Vexen.add(Wurm);
        Vexen.add(Subzero);
        Vexen.add(ColdBlood);
        Vexen.add(DiamondShield);
        Vexen.add(Aegis);
        Vexen.add(FrozenPride);
        Vexen.add(PotLid);
        Vexen.add(Snowman);

        //Lexaeus
        Lexaeus.add(Reticence);
        Lexaeus.add(Goliath);
        Lexaeus.add(CopperRed);
        Lexaeus.add(Daybreak);
        Lexaeus.add(Colossus);
        Lexaeus.add(UrsaMajor);
        Lexaeus.add(Megacosm);
        Lexaeus.add(Terrene);
        Lexaeus.add(Fuligin);
        Lexaeus.add(HardWinter);
        Lexaeus.add(Firefly);
        Lexaeus.add(Harbinger);
        Lexaeus.add(Redwood);
        Lexaeus.add(Sequoia);
        Lexaeus.add(IronBlack);
        Lexaeus.add(Earthshine);
        Lexaeus.add(Octiron);
        Lexaeus.add(Hyperion);
        Lexaeus.add(Clarity);
        Lexaeus.add(OneThousandAndOneNights);
        Lexaeus.add(CardinalVirtue);
        Lexaeus.add(Skysplitter);
        Lexaeus.add(BleepBloopBop);
        Lexaeus.add(Monolith);

        //Zexion
        Zexion.add(BlackPrimer);
        Zexion.add(WhiteTome);
        Zexion.add(IllicitResearch);
        Zexion.add(BuriedSecrets);
        Zexion.add(ArcaneCompendium);
        Zexion.add(DissentersNotes);
        Zexion.add(NefariousCodex);
        Zexion.add(MysticAlbum);
        Zexion.add(CursedManual);
        Zexion.add(TabooText);
        Zexion.add(EldritchEsoterica);
        Zexion.add(FreakishBestiary);
        Zexion.add(MadmansVita);
        Zexion.add(UntitledWritings);
        Zexion.add(AbandonedDogma);
        Zexion.add(AtlasOfOmens);
        Zexion.add(RevoltingScrapbook);
        Zexion.add(LostHeterodoxy);
        Zexion.add(OtherworldlyTales);
        Zexion.add(IndescribableLore);
        Zexion.add(RadicalTreatise);
        Zexion.add(BookofRetribution);
        Zexion.add(MidnightSnack);
        Zexion.add(DearDiary);

        //Saix
        Saix.add(NewMoon);
        Saix.add(Werewolf);
        Saix.add(Artemis);
        Saix.add(Luminary);
        Saix.add(Selene);
        Saix.add(Moonrise);
        Saix.add(Astrologia);
        Saix.add(Crater);
        Saix.add(LunarPhase);
        Saix.add(Crescent);
        Saix.add(Gibbous);
        Saix.add(Berserker);
        Saix.add(Twilight);
        Saix.add(QueenOfTheNight);
        Saix.add(BalsamicMoon);
        Saix.add(Orbit);
        Saix.add(LightYear);
        Saix.add(KingOfTheNight);
        Saix.add(Moonset);
        Saix.add(Horoscope);
        Saix.add(Dichotomy);
        Saix.add(Lunatic);
        Saix.add(JustDesserts);
        Saix.add(Bunnymoon);

        //Axel
        Axel.add(Ashes);
        Axel.add(Doldrums);
        Axel.add(DelayedAction);
        Axel.add(DiveBombers);
        Axel.add(Combustion);
        Axel.add(MoulinRouge);
        Axel.add(BlazeofGlory);
        Axel.add(Prometheus);
        Axel.add(Ifrit);
        Axel.add(MagmaOcean);
        Axel.add(Volcanics);
        Axel.add(Inferno);
        Axel.add(SizzlingEdge);
        Axel.add(Corona);
        Axel.add(FerrisWheel);
        Axel.add(Burnout);
        Axel.add(OmegaTrinity);
        Axel.add(Outbreak);
        Axel.add(DoubleEdge);
        Axel.add(Wildfire);
        Axel.add(Prominence);
        Axel.add(EternalFlames);
        Axel.add(PizzaCut);
        Axel.add(Conformers);

        //Demyx
        Demyx.add(BasicModel);
        Demyx.add(TuneUp);
        Demyx.add(Quartet);
        Demyx.add(Quintet);
        Demyx.add(Overture);
        Demyx.add(OldHand);
        Demyx.add(DaCapo);
        Demyx.add(PowerChord);
        Demyx.add(Fermata);
        Demyx.add(Interlude);
        Demyx.add(Serenade);
        Demyx.add(Songbird);
        Demyx.add(RiseToFame);
        Demyx.add(RockStar);
        Demyx.add(EightFinger);
        Demyx.add(Concerto);
        Demyx.add(Harmonics);
        Demyx.add(MillionBucks);
        Demyx.add(Fortissimo);
        Demyx.add(UpToEleven);
        Demyx.add(Sanctuary);
        Demyx.add(Arpeggio);
        Demyx.add(PrinceOfAwesome);
        Demyx.add(AfterSchool);

        //Luxord
        Luxord.add(TheFool);
        Luxord.add(TheMagician);
        Luxord.add(TheStar);
        Luxord.add(TheMoon);
        Luxord.add(Justice);
        Luxord.add(TheHierophant);
        Luxord.add(TheWorld);
        Luxord.add(Temperance);
        Luxord.add(TheHighPriestess);
        Luxord.add(TheTower);
        Luxord.add(TheHangedMan);
        Luxord.add(Death);
        Luxord.add(TheHermit);
        Luxord.add(Strength);
        Luxord.add(TheLovers);
        Luxord.add(TheChariot);
        Luxord.add(TheSun);
        Luxord.add(TheDevil);
        Luxord.add(TheEmpress);
        Luxord.add(TheEmperor);
        Luxord.add(TheJoker);
        Luxord.add(FairGame);
        Luxord.add(FinestFantasy13);
        Luxord.add(HighRollersSecret);

        //Marluxia
        Marluxia.add(FickleErica);
        Marluxia.add(JiltedAnemone);
        Marluxia.add(ProudAmaryllis);
        Marluxia.add(MadSafflower);
        Marluxia.add(PoorMelissa);
        Marluxia.add(TragicAllium);
        Marluxia.add(MournfulCineria);
        Marluxia.add(PseudoSilene);
        Marluxia.add(FaithlessDigitalis);
        Marluxia.add(GrimMuscari);
        Marluxia.add(DocileVallota);
        Marluxia.add(QuietBelladonna);
        Marluxia.add(PartingIpheion);
        Marluxia.add(LoftyGerbera);
        Marluxia.add(GallantAchillea);
        Marluxia.add(NoblePeony);
        Marluxia.add(FearsomeAnise);
        Marluxia.add(VindictiveThistle);
        Marluxia.add(FairHelianthus);
        Marluxia.add(SolemnMagnolia);
        Marluxia.add(HallowedLotus);
        Marluxia.add(GracefulDahlia);
        Marluxia.add(StirringLadle);
        Marluxia.add(DaintyBellflowers);

        //Larxene
        Larxene.add(Trancheuse);
        Larxene.add(Orage);
        Larxene.add(Tourbillon);
        Larxene.add(Tempete);
        Larxene.add(Carmin);
        Larxene.add(Meteore);
        Larxene.add(Etoile);
        Larxene.add(Irregulier);
        Larxene.add(Dissonance);
        Larxene.add(Eruption);
        Larxene.add(SoleilCouchant);
        Larxene.add(Indigo);
        Larxene.add(Vague);
        Larxene.add(Deluge);
        Larxene.add(Rafale);
        Larxene.add(Typhon);
        Larxene.add(Extirpeur);
        Larxene.add(CroixDuSud);
        Larxene.add(Lumineuse);
        Larxene.add(ClairdeLune);
        Larxene.add(VoldeNuit);
        Larxene.add(Foudre);
        Larxene.add(Demoiselle);
        Larxene.add(Ampoule);

        Roxas.add(KingdomKey);
        Roxas.add(MissingAche);
        Roxas.add(OminousBlight);
        Roxas.add(AbaddonPlasma);
        Roxas.add(PainofSolitude);
        Roxas.add(SignofInnocence);
        Roxas.add(CrownofGuilt);
        Roxas.add(AbyssalTide);
        Roxas.add(Leviathan);
        Roxas.add(TrueLightsFlight);
        Roxas.add(RejectionofFate);
        Roxas.add(MidnightRoar);
        Roxas.add(GlimpseofDarkness);
        Roxas.add(TotalEclipse);
        Roxas.add(SilentDirge);
        Roxas.add(LunarEclipse);
        Roxas.add(DarkerThanDark);
        Roxas.add(AstralBlast);
        Roxas.add(MaverickFlare);
        Roxas.add(TwilightBlaze);
        Roxas.add(OmegaWeapon);
        Roxas.add(Oathkeeper);
        Roxas.add(TwoBecomeOne);
        Roxas.add(Oblivion);
        Roxas.add(Umbrella);
        Roxas.add(Aubade);
        Roxas.add(WoodenStick);

        //Keyblades
        recipes.add(AbaddonPlasma.getUnlocalizedName());
        recipes.add(AbyssalTide.getUnlocalizedName());
        recipes.add(AllforOne.getUnlocalizedName());
        recipes.add(AnguisForetellersKeyblade.getUnlocalizedName());
        recipes.add(AstralBlast.getUnlocalizedName());
        recipes.add(Aubade.getUnlocalizedName());
        recipes.add(BondofFlame.getUnlocalizedName());
        recipes.add(Brightcrest.getUnlocalizedName());
        recipes.add(ChaosRipper.getUnlocalizedName());
        recipes.add(CircleofLife.getUnlocalizedName());
        recipes.add(Counterpoint.getUnlocalizedName());
        recipes.add(Crabclaw.getUnlocalizedName());
        recipes.add(CrownofGuilt.getUnlocalizedName());
        recipes.add(DarkerThanDark.getUnlocalizedName());
        recipes.add(Darkgnaw.getUnlocalizedName());
        recipes.add(DecisivePumpkin.getUnlocalizedName());
        recipes.add(DestinysEmbrace.getUnlocalizedName());
        recipes.add(DiamondDust.getUnlocalizedName());
        recipes.add(Divewing.getUnlocalizedName());
        recipes.add(DivineRose.getUnlocalizedName());
        recipes.add(DreamShield.getUnlocalizedName());
        recipes.add(DreamStaff.getUnlocalizedName());
        recipes.add(DreamSword.getUnlocalizedName());
        recipes.add(DualDisc.getUnlocalizedName());
        recipes.add(Earthshaker.getUnlocalizedName());
        recipes.add(EndofPain.getUnlocalizedName());
        recipes.add(EndsoftheEarth.getUnlocalizedName());
        recipes.add(FairyHarp.getUnlocalizedName());
        recipes.add(FairyStars.getUnlocalizedName());
        recipes.add(FatalCrest.getUnlocalizedName());
        recipes.add(Fenrir.getUnlocalizedName());
        recipes.add(FerrisGear.getUnlocalizedName());
        recipes.add(FollowtheWind.getUnlocalizedName());
        recipes.add(FrolicFlame.getUnlocalizedName());
        recipes.add(GlimpseofDarkness.getUnlocalizedName());
        recipes.add(GuardianBell.getUnlocalizedName());
        recipes.add(GuardianSoul.getUnlocalizedName());
        recipes.add(GullWing.getUnlocalizedName());
        recipes.add(HerosCrest.getUnlocalizedName());
        recipes.add(HiddenDragon.getUnlocalizedName());
        recipes.add(Hyperdrive.getUnlocalizedName());
        recipes.add(IncompleteKiblade.getUnlocalizedName());
        recipes.add(JungleKing.getUnlocalizedName());
        recipes.add(KeybladeofPeoplesHearts.getUnlocalizedName());
        recipes.add(Kiblade.getUnlocalizedName());
        recipes.add(KingdomKey.getUnlocalizedName());
        recipes.add(KingdomKeyD.getUnlocalizedName());
        recipes.add(KnockoutPunch.getUnlocalizedName());
        recipes.add(LadyLuck.getUnlocalizedName());
        recipes.add(LeasKeyblade.getUnlocalizedName());
        recipes.add(LeopardosForetellersKeyblade.getUnlocalizedName());
        recipes.add(Leviathan.getUnlocalizedName());
        recipes.add(Lionheart.getUnlocalizedName());
        recipes.add(LostMemory.getUnlocalizedName());
        recipes.add(LunarEclipse.getUnlocalizedName());
        recipes.add(MarkofaHero.getUnlocalizedName());
        recipes.add(MastersDefender.getUnlocalizedName());
        recipes.add(MasterXehanortsKeyblade.getUnlocalizedName());
        recipes.add(MaverickFlare.getUnlocalizedName());
        recipes.add(MetalChocobo.getUnlocalizedName());
        recipes.add(MidnightRoar.getUnlocalizedName());
        recipes.add(MirageSplit.getUnlocalizedName());
        recipes.add(MissingAche.getUnlocalizedName());
        recipes.add(Monochrome.getUnlocalizedName());
        recipes.add(MysteriousAbyss.getUnlocalizedName());
        recipes.add(NightmaresEnd.getUnlocalizedName());
        recipes.add(NightmaresEndandMirageSplit.getUnlocalizedName());
        recipes.add(NoName.getUnlocalizedName());
        recipes.add(Oathkeeper.getUnlocalizedName());
        recipes.add(Oblivion.getUnlocalizedName());
        recipes.add(OceansRage.getUnlocalizedName());
        recipes.add(Olympia.getUnlocalizedName());
        recipes.add(OmegaWeapon.getUnlocalizedName());
        recipes.add(OminousBlight.getUnlocalizedName());
        recipes.add(OneWingedAngel.getUnlocalizedName());
        recipes.add(PainofSolitude.getUnlocalizedName());
        recipes.add(PhotonDebugger.getUnlocalizedName());
        recipes.add(PixiePetal.getUnlocalizedName());
        recipes.add(Pumpkinhead.getUnlocalizedName());
        recipes.add(Rainfell.getUnlocalizedName());
        recipes.add(RejectionofFate.getUnlocalizedName());
        recipes.add(RoyalRadiance.getUnlocalizedName());
        recipes.add(RumblingRose.getUnlocalizedName());
        recipes.add(SignofInnocence.getUnlocalizedName());
        recipes.add(SilentDirge.getUnlocalizedName());
        recipes.add(SkullNoise.getUnlocalizedName());
        recipes.add(SleepingLion.getUnlocalizedName());
        recipes.add(SoulEater.getUnlocalizedName());
        recipes.add(Spellbinder.getUnlocalizedName());
        recipes.add(Starlight.getUnlocalizedName());
        recipes.add(StarSeeker.getUnlocalizedName());
        recipes.add(Stormfall.getUnlocalizedName());
        recipes.add(StrokeofMidnight.getUnlocalizedName());
        recipes.add(SweetDreams.getUnlocalizedName());
        recipes.add(SweetMemories.getUnlocalizedName());
        recipes.add(Sweetstack.getUnlocalizedName());
        recipes.add(ThreeWishes.getUnlocalizedName());
        recipes.add(TotalEclipse.getUnlocalizedName());
        recipes.add(TreasureTrove.getUnlocalizedName());
        recipes.add(TrueLightsFlight.getUnlocalizedName());
        recipes.add(TwilightBlaze.getUnlocalizedName());
        recipes.add(TwoBecomeOne.getUnlocalizedName());
        recipes.add(UltimaWeaponBBS.getUnlocalizedName());
        recipes.add(UltimaWeaponDDD.getUnlocalizedName());
        recipes.add(UltimaWeaponKH1.getUnlocalizedName());
        recipes.add(UltimaWeaponKH2.getUnlocalizedName());
        recipes.add(Umbrella.getUnlocalizedName());
        recipes.add(Unbound.getUnlocalizedName());
        recipes.add(UnicornisForetellersKeyblade.getUnlocalizedName());
        recipes.add(UrsusForetellersKeyblade.getUnlocalizedName());
        recipes.add(VictoryLine.getUnlocalizedName());
        recipes.add(VoidGear.getUnlocalizedName());
        recipes.add(VulpeusForetellersKeyblade.getUnlocalizedName());
        recipes.add(WaytotheDawn.getUnlocalizedName());
        recipes.add(WaywardWind.getUnlocalizedName());
        recipes.add(WinnersProof.getUnlocalizedName());
        recipes.add(WishingLamp.getUnlocalizedName());
        recipes.add(WishingStar.getUnlocalizedName());
        recipes.add(WoodenKeyblade.getUnlocalizedName());
        recipes.add(WoodenStick.getUnlocalizedName());
        recipes.add(YoungXehanortsKeyblade.getUnlocalizedName());
        recipes.add(ZeroOne.getUnlocalizedName());
    }

}
