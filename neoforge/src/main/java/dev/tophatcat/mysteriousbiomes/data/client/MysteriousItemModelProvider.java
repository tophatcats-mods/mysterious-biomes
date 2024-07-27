/*
 * A Minecraft mod made for SpookyJam 2017, contains Halloween themed biomes and content.
 * Copyright (C) KiriCattus 2013 - 2024
 * https://github.com/kiris-mods/mysterious-biomes/blob/dev/LICENSE.md
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package dev.tophatcat.mysteriousbiomes.data.client;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.registries.BlockRegistry;
import dev.tophatcat.mysteriousbiomes.registries.ItemRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MysteriousItemModelProvider extends ItemModelProvider {

    public MysteriousItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MysteriousCommon.MOD_ID, existingFileHelper);
    }

    protected void simpleBlockItemModel(Block block) {
        var name = getName(block);
        withExistingParent(name, modLoc("block/" + name));
    }

    protected void simpleTrapdoorBlockItemModel(Block block) {
        var name = getName(block);
        withExistingParent(name, modLoc("block/" + name + "_bottom"));
    }

    protected void simpleSaplingItemModel(Block block) {
        var name = getName(block);
        singleTexture(name, ResourceLocation.fromNamespaceAndPath("minecraft", "item/generated"),
            "layer0", modLoc("block/" + name));
    }

    protected String getName(Block item) {
        return BuiltInRegistries.BLOCK.getKey(item).getPath();
    }

    @Override
    protected void registerModels() {
        simpleBlockItemModel(BlockRegistry.BLOODIED_GRASS.get());
        simpleBlockItemModel(BlockRegistry.BLOODIED_DIRT.get());

        // Logs
        simpleBlockItemModel(BlockRegistry.BLOODWOOD_LOG.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_LOG.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_LOG.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_LOG.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_LOG.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_STRIPPED_LOG.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_STRIPPED_LOG.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_STRIPPED_LOG.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_STRIPPED_LOG.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_STRIPPED_LOG.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_WOOD.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_WOOD.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_WOOD.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_WOOD.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_WOOD.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_STRIPPED_WOOD.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_STRIPPED_WOOD.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_STRIPPED_WOOD.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_STRIPPED_WOOD.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_STRIPPED_WOOD.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_PLANKS.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_PLANKS.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_PLANKS.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_PLANKS.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_PLANKS.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_STAIRS.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_STAIRS.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_STAIRS.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_STAIRS.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_STAIRS.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_LEAVES.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_LEAVES.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_LEAVES.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_LEAVES.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_LEAVES.get());

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_SLAB.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_SLAB.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_SLAB.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_SLAB.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_SLAB.get());

        fenceInventory(getName(BlockRegistry.BLOODWOOD_FENCE.get()), ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/" + getName(BlockRegistry.BLOODWOOD_PLANKS.get())));
        fenceInventory(getName(BlockRegistry.GHOSTLY_FENCE.get()), ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/" + getName(BlockRegistry.GHOSTLY_PLANKS.get())));
        fenceInventory(getName(BlockRegistry.SEEPING_FENCE.get()), ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/" + getName(BlockRegistry.SEEPING_PLANKS.get())));
        fenceInventory(getName(BlockRegistry.SORBUS_FENCE.get()), ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/" + getName(BlockRegistry.SORBUS_PLANKS.get())));
        // fenceInventory(getName(MysteriousRegistry.WALNUT_FENCE.get()), ResourceLocation.fromNamespaceAndPath(
        // MysteriousCommon.MOD_ID, "block/" + getName(MysteriousRegistry.WALNUT_PLANKS.get())));

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_GATE.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_GATE.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_GATE.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_GATE.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_GATE.get());

        buttonInventory("bloodwood_button", ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/bloodwood_planks"));
        buttonInventory("ghostly_button", ResourceLocation.fromNamespaceAndPath(
            MysteriousCommon.MOD_ID, "block/ghostly_planks"));
        buttonInventory("seeping_button", ResourceLocation.fromNamespaceAndPath(
                MysteriousCommon.MOD_ID, "block/seeping_planks"));
        buttonInventory("sorbus_button", ResourceLocation.fromNamespaceAndPath(
                MysteriousCommon.MOD_ID, "block/sorbus_planks"));
        // buttonInventory("walnut_button", ResourceLocation.fromNamespaceAndPath(
        // MysteriousCommon.MOD_ID, "block/walnut_planks"));

        simpleBlockItemModel(BlockRegistry.BLOODWOOD_PRESSURE_PLATE.get());
        simpleBlockItemModel(BlockRegistry.GHOSTLY_PRESSURE_PLATE.get());
        simpleBlockItemModel(BlockRegistry.SEEPING_PRESSURE_PLATE.get());
        simpleBlockItemModel(BlockRegistry.SORBUS_PRESSURE_PLATE.get());
        // simpleBlockItemModel(MysteriousRegistry.WALNUT_PRESSURE_PLATE.get());

        simpleTrapdoorBlockItemModel(BlockRegistry.BLOODWOOD_TRAPDOOR.get());
        simpleTrapdoorBlockItemModel(BlockRegistry.GHOSTLY_TRAPDOOR.get());
        simpleTrapdoorBlockItemModel(BlockRegistry.SEEPING_TRAPDOOR.get());
        simpleTrapdoorBlockItemModel(BlockRegistry.SORBUS_TRAPDOOR.get());
        // simpleTrapdoorBlockItemModel(MysteriousRegistry.WALNUT_TRAPDOOR.get());

        basicItem(BlockRegistry.BLOODWOOD_DOOR.get().asItem());
        basicItem(BlockRegistry.GHOSTLY_DOOR.get().asItem());
        basicItem(BlockRegistry.SEEPING_DOOR.get().asItem());
        basicItem(BlockRegistry.SORBUS_DOOR.get().asItem());
        // basicItem(MysteriousRegistry.WALNUT_DOOR.get().asItem());

        simpleSaplingItemModel(BlockRegistry.BLOODWOOD_SAPLING.get());
        simpleSaplingItemModel(BlockRegistry.GHOSTLY_SAPLING.get());
        simpleSaplingItemModel(BlockRegistry.SEEPING_SAPLING.get());
        simpleSaplingItemModel(BlockRegistry.SORBUS_SAPLING.get());
        // simpleSaplingItemModel(MysteriousRegistry.WALNUT_SAPLING.get());

        basicItem(ItemRegistry.BLOODWOOD_SIGN.get());
        basicItem(ItemRegistry.GHOSTLY_SIGN.get());
        basicItem(ItemRegistry.SEEPING_SIGN.get());
        basicItem(ItemRegistry.SORBUS_SIGN.get());
        // basicItem(MysteriousRegistry.WALNUT_SIGN.get());

        // TODO Enable these once we have textures, data generation fails without them.
        // basicItem(MysteriousRegistry.BLOODWOOD_HANGING_SIGN_ITEM.get());
        // basicItem(MysteriousRegistry.GHOSTLY_HANGING_SIGN_ITEM.get());
        // basicItem(MysteriousRegistry.SEEPING_HANGING_SIGN_ITEM.get());
        // basicItem(MysteriousRegistry.SORBUS_HANGING_SIGN_ITEM.get());
        // basicItem(MysteriousRegistry.WALNUT_HANGING_SIGN_ITEM.get());
    }
}
