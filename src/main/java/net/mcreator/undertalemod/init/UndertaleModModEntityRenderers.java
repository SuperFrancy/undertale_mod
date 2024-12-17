
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertalemod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UndertaleModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UndertaleModModEntities.PESEVERANCE_SOUL_PR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UndertaleModModEntities.JUSTICE_SOUL_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
