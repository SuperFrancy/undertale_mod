
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertalemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertalemod.UndertaleModMod;

public class UndertaleModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UndertaleModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOULS = REGISTRY.register("souls",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.undertale_mod.souls")).icon(() -> new ItemStack(UndertaleModModItems.DETERMINATION_SOUL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UndertaleModModItems.DETERMINATION_SOUL.get());
				tabData.accept(UndertaleModModItems.PATIENCE_SOUL.get());
				tabData.accept(UndertaleModModItems.BRAVERY_SOUL.get());
				tabData.accept(UndertaleModModItems.INTEGRITY_SOUL.get());
				tabData.accept(UndertaleModModItems.PERSEVERANCE_SOUL.get());
				tabData.accept(UndertaleModModItems.KINDNESS_SOUL.get());
				tabData.accept(UndertaleModModItems.JUSTICE_SOUL.get());
			})

					.build());
}
