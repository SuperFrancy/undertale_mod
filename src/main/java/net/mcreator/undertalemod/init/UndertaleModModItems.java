
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertalemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.undertalemod.item.PerseveranceSoulItem;
import net.mcreator.undertalemod.item.PatienceSoulItem;
import net.mcreator.undertalemod.item.KindnessSoulItem;
import net.mcreator.undertalemod.item.JusticeSuolProjectileItem;
import net.mcreator.undertalemod.item.JusticeSoulItem;
import net.mcreator.undertalemod.item.IntegritySoulItem;
import net.mcreator.undertalemod.item.DeterminationSoulItem;
import net.mcreator.undertalemod.item.BraverySoulItem;
import net.mcreator.undertalemod.UndertaleModMod;

public class UndertaleModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(UndertaleModMod.MODID);
	public static final DeferredItem<Item> DETERMINATION_SOUL = REGISTRY.register("determination_soul", DeterminationSoulItem::new);
	public static final DeferredItem<Item> PATIENCE_SOUL = REGISTRY.register("patience_soul", PatienceSoulItem::new);
	public static final DeferredItem<Item> BRAVERY_SOUL = REGISTRY.register("bravery_soul", BraverySoulItem::new);
	public static final DeferredItem<Item> INTEGRITY_SOUL = REGISTRY.register("integrity_soul", IntegritySoulItem::new);
	public static final DeferredItem<Item> PERSEVERANCE_SOUL = REGISTRY.register("perseverance_soul", PerseveranceSoulItem::new);
	public static final DeferredItem<Item> KINDNESS_SOUL = REGISTRY.register("kindness_soul", KindnessSoulItem::new);
	public static final DeferredItem<Item> JUSTICE_SOUL = REGISTRY.register("justice_soul", JusticeSoulItem::new);
	public static final DeferredItem<Item> JUSTICE_SUOL_PROJECTILE = REGISTRY.register("justice_suol_projectile", JusticeSuolProjectileItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
