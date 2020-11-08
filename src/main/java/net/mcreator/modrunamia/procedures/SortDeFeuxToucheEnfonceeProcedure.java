package net.mcreator.modrunamia.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.item.BouleDeFeuxSortItem;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class SortDeFeuxToucheEnfonceeProcedure extends ModRunamiaModElements.ModElement {
	public SortDeFeuxToucheEnfonceeProcedure(ModRunamiaModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SortDeFeuxToucheEnfoncee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(BouleDeFeuxSortItem.block, (int) (1));
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
