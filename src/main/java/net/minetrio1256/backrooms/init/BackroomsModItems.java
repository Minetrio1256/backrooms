
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minetrio1256.backrooms.init;

import net.minetrio1256.backrooms.BackroomsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class BackroomsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BackroomsMod.MODID);
	public static final RegistryObject<Item> WALLSLEVEL_1 = block(BackroomsModBlocks.WALLSLEVEL_1);
	public static final RegistryObject<Item> FLOOR_1 = block(BackroomsModBlocks.FLOOR_1);
	public static final RegistryObject<Item> ROOF_1 = block(BackroomsModBlocks.ROOF_1);
	public static final RegistryObject<Item> LIGTH_1 = block(BackroomsModBlocks.LIGTH_1);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
