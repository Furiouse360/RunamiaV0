
package net.mcreator.modrunamia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.modrunamia.procedures.UnclaimFiderProcedure;
import net.mcreator.modrunamia.itemgroup.RunamiaItemGroup;
import net.mcreator.modrunamia.ModRunamiaModElements;

import java.util.Map;
import java.util.HashMap;

@ModRunamiaModElements.ModElement.Tag
public class UnclaimFinderItem extends ModRunamiaModElements.ModElement {
	@ObjectHolder("mod_runamia:unclaim_finder")
	public static final Item block = null;
	public UnclaimFinderItem(ModRunamiaModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RunamiaItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("unclaim_finder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected) {
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				UnclaimFiderProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
