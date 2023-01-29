package com.mrcrayfish.guns.init;

import com.mrcrayfish.guns.GunMod;
import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.AmmoItem;
import com.mrcrayfish.guns.item.BarrelItem;
import com.mrcrayfish.guns.item.GrenadeItem;
import com.mrcrayfish.guns.item.GunItem;
import com.mrcrayfish.guns.item.ScopeItem;
import com.mrcrayfish.guns.item.StockItem;
import com.mrcrayfish.guns.item.StunGrenadeItem;
import com.mrcrayfish.guns.item.UnderBarrelItem;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<GunItem> PISTOL = REGISTER.register("pistol", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<AmmoItem> UNFINISHED_PISTOL = REGISTER.register("unfinished_pistol", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_GRENADE_LAUNCHER = REGISTER.register("unfinished_grenade_launcher", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_FLINTLOCK = REGISTER.register("unfinished_flintlock", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_MUSKET = REGISTER.register("unfinished_musket", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_SHOTGUN = REGISTER.register("unfinished_shotgun", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_RIFLE = REGISTER.register("unfinished_rifle", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_MACHINE_PISTOL = REGISTER.register("unfinished_machine_pistol", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> UNFINISHED_ASSAULT_RIFLE = REGISTER.register("unfinished_assault_rifle", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<AmmoItem> STEEL_NUGGET = REGISTER.register("steel_nugget", () -> new AmmoItem(new Item.Properties().stacksTo(64).tab(GunMod.GROUP)));
    public static final RegistryObject<AmmoItem> CRUDE_GUN_KIT = REGISTER.register("crude_gun_kit", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<GunItem> FLINTLOCK = REGISTER.register("flintlock", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<GunItem> MUSKET = REGISTER.register("musket", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> SHOTGUN = REGISTER.register("shotgun", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> RIFLE = REGISTER.register("rifle", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<GunItem> GRENADE_LAUNCHER = REGISTER.register("grenade_launcher", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> BAZOOKA = REGISTER.register("bazooka", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> MINI_GUN = REGISTER.register("mini_gun", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<GunItem> ASSAULT_RIFLE = REGISTER.register("assault_rifle", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> MACHINE_PISTOL = REGISTER.register("machine_pistol", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> HEAVY_RIFLE = REGISTER.register("heavy_rifle", () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> BASIC_BULLET = REGISTER.register("basic_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> CRUDE_SHOT = REGISTER.register("crude_shot", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));

    public static final RegistryObject<Item> COMPLEX_BULLET = REGISTER.register("complex_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> COMPLEX_BULLET_CASING = REGISTER.register("complex_bullet_casing", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> INCOMPLETE_COMPLEX_BULLET = REGISTER.register("incomplete_complex_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BASIC_GUN_KIT = REGISTER.register("basic_gun_kit", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> ADVANCED_GUN_KIT = REGISTER.register("advanced_gun_kit", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> COMPLEX_GUN_KIT = REGISTER.register("complex_gun_kit", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> BASIC_BULLET_CASING = REGISTER.register("basic_bullet_casing", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> INCOMPLETE_BASIC_BULLET = REGISTER.register("incomplete_basic_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ADVANCED_BULLET_CASING = REGISTER.register("advanced_bullet_casing", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> INCOMPLETE_ADVANCED_BULLET = REGISTER.register("incomplete_advanced_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> EMPTY_SHELL = REGISTER.register("empty_shell", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> REVOLVER_CYLINDER = REGISTER.register("revolver_cylinder", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> MAGAZINE = REGISTER.register("magazine", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> INCOMPLETE_SHELL = REGISTER.register("incomplete_shell", () -> new AmmoItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> COMPRESSED_AIR_CANISTER = REGISTER.register("compressed_air_canister", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> UNARMED_MISSILE = REGISTER.register("unarmed_missile", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GUNPOWDER_BOTTLE = REGISTER.register("gunpowder_bottle", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> ADVANCED_AMMO = REGISTER.register("advanced_bullet", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> SHELL = REGISTER.register("shell", () -> new AmmoItem(new Item.Properties().stacksTo(16).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> MISSILE = REGISTER.register("missile", () -> new AmmoItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> GRENADE = REGISTER.register("grenade", () -> new GrenadeItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP), 20 * 4));
    public static final RegistryObject<Item> HARMLESS_GRENADE = REGISTER.register("harmless_grenade", () -> new AmmoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STUN_GRENADE = REGISTER.register("stun_grenade", () -> new StunGrenadeItem(new Item.Properties().stacksTo(1).tab(GunMod.GROUP), 72000));

    /* Scope Attachments */
    public static final RegistryObject<Item> SHORT_SCOPE = REGISTER.register("short_scope", () -> new ScopeItem(Scope.create(0.1F, 1.55F, GunModifiers.SLOW_ADS).viewFinderOffset(0.4), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> MEDIUM_SCOPE = REGISTER.register("medium_scope", () -> new ScopeItem(Scope.create(0.25F, 1.625F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> LONG_SCOPE = REGISTER.register("long_scope", () -> new ScopeItem(Scope.create(0.4F, 1.4F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.275), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));

    /* Barrel Attachments */
    public static final RegistryObject<Item> SILENCER = REGISTER.register("silencer", () -> new BarrelItem(Barrel.create(8.0F, GunModifiers.SILENCED, GunModifiers.REDUCED_DAMAGE), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));

    /* Stock Attachments */
    public static final RegistryObject<Item> LIGHT_STOCK = REGISTER.register("light_stock", () -> new StockItem(Stock.create(GunModifiers.BETTER_CONTROL), new Item.Properties().stacksTo(1).tab(GunMod.GROUP), false));
    public static final RegistryObject<Item> TACTICAL_STOCK = REGISTER.register("tactical_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), new Item.Properties().stacksTo(1).tab(GunMod.GROUP), false));
    public static final RegistryObject<Item> WEIGHTED_STOCK = REGISTER.register("weighted_stock", () -> new StockItem(Stock.create(GunModifiers.SUPER_STABILISED), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> LIGHT_GRIP = REGISTER.register("light_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
    public static final RegistryObject<Item> SPECIALISED_GRIP = REGISTER.register("specialised_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.REDUCED_RECOIL), new Item.Properties().stacksTo(1).tab(GunMod.GROUP)));
}
