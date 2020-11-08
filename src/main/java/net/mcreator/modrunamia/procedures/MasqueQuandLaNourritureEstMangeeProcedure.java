package net.mcreator.modrunamia.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class MasqueQuandLaNourritureEstMangeeProcedure extends ModRunamiaModElements.ModElement {
	public MasqueQuandLaNourritureEstMangeeProcedure(ModRunamiaModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MasqueQuandLaNourritureEstMangee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 10, (int) 1));
	}
}
