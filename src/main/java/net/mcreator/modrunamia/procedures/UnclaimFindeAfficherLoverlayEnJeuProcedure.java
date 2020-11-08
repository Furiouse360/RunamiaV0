package net.mcreator.modrunamia.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.item.UnclaimFinderItem;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class UnclaimFindeAfficherLoverlayEnJeuProcedure extends ModRunamiaModElements.ModElement {
	public UnclaimFindeAfficherLoverlayEnJeuProcedure(ModRunamiaModElements instance) {
		super(instance, 16);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure UnclaimFindeAfficherLoverlayEnJeu!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(UnclaimFinderItem.block, (int) (1)).getItem())
				|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(UnclaimFinderItem.block, (int) (1)).getItem()));
	}
}
