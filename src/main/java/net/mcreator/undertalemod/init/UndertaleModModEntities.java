
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertalemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertalemod.entity.PeseveranceSoulPrEntity;
import net.mcreator.undertalemod.entity.JusticeSoulProjectileEntity;
import net.mcreator.undertalemod.UndertaleModMod;

public class UndertaleModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, UndertaleModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PeseveranceSoulPrEntity>> PESEVERANCE_SOUL_PR = register("peseverance_soul_pr",
			EntityType.Builder.<PeseveranceSoulPrEntity>of(PeseveranceSoulPrEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JusticeSoulProjectileEntity>> JUSTICE_SOUL_PROJECTILE = register("justice_soul_projectile",
			EntityType.Builder.<JusticeSoulProjectileEntity>of(JusticeSoulProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
