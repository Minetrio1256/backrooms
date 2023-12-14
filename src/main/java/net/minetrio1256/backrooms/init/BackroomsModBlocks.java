
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minetrio1256.backrooms.init;

import net.minetrio1256.backrooms.block.Wallslevel1Block;
import net.minetrio1256.backrooms.block.Roof1Block;
import net.minetrio1256.backrooms.block.Ligth1Block;
import net.minetrio1256.backrooms.block.Floor1Block;
import net.minetrio1256.backrooms.BackroomsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class BackroomsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BackroomsMod.MODID);
	public static final RegistryObject<Block> WALLSLEVEL_1 = REGISTRY.register("wallslevel_1", () -> new Wallslevel1Block());
	public static final RegistryObject<Block> FLOOR_1 = REGISTRY.register("floor_1", () -> new Floor1Block());
	public static final RegistryObject<Block> ROOF_1 = REGISTRY.register("roof_1", () -> new Roof1Block());
	public static final RegistryObject<Block> LIGTH_1 = REGISTRY.register("ligth_1", () -> new Ligth1Block());
}
