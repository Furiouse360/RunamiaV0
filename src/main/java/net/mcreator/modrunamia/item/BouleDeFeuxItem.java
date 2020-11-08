
package net.mcreator.modrunamia.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.modrunamia.itemgroup.RunamiaItemGroup;
import net.mcreator.modrunamia.ModRunamiaModElements;

@ModRunamiaModElements.ModElement.Tag
public class BouleDeFeuxItem extends ModRunamiaModElements.ModElement {
	@ObjectHolder("mod_runamia:boule_de_feux")
	public static final Item block = null;
	public BouleDeFeuxItem(ModRunamiaModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RunamiaItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("boule_de_feux");
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
