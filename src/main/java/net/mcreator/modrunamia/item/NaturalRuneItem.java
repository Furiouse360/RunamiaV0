
package net.mcreator.modrunamia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.modrunamia.itemgroup.RunamiaItemGroup;
import net.mcreator.modrunamia.ModRunamiaModElements;

@ModRunamiaModElements.ModElement.Tag
public class NaturalRuneItem extends ModRunamiaModElements.ModElement {
	@ObjectHolder("mod_runamia:natural_rune")
	public static final Item block = null;
	public NaturalRuneItem(ModRunamiaModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RunamiaItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("natural_rune");
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
	}
}
