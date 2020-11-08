package net.mcreator.modrunamia.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.modrunamia.item.ParcheminDuFeuxItem;
import net.mcreator.modrunamia.ModRunamiaModVariables;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.function.Supplier;
import java.util.Map;

@ModRunamiaModElements.ModElement.Tag
public class SortSlot0ParcheminProcedure extends ModRunamiaModElements.ModElement {
	public SortSlot0ParcheminProcedure(ModRunamiaModElements instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SortSlot0Parchemin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(ParcheminDuFeuxItem.block, (int) (1)).getItem())
				&& (((entity.getCapability(ModRunamiaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ModRunamiaModVariables.PlayerVariables())).SortDeFeux) == (false)))) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			{
				boolean _setval = (boolean) (true);
				entity.getCapability(ModRunamiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SortDeFeux = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
