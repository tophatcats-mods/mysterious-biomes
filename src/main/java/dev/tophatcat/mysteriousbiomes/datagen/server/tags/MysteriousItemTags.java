/*
 * Mysterious Biomes - https://github.com/tophatcats-mods/mysterious-biomes
 * Copyright (C) 2013-2023 <KiriCattus>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * Specifically version 2.1 of the License.
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
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 */
package dev.tophatcat.mysteriousbiomes.datagen.server.tags;

import dev.tophatcat.mysteriousbiomes.MysteriousBiomes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MysteriousItemTags {

    public static final TagKey<Item> DIRT = TagKey.create(Registries.ITEM,
            new ResourceLocation("dirt"));
    public static final TagKey<Item> PLANKS = TagKey.create(Registries.ITEM,
            new ResourceLocation("planks"));
    public static final TagKey<Item> WOODEN_BUTTONS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_buttons"));
    public static final TagKey<Item> BUTTONS = TagKey.create(Registries.ITEM,
            new ResourceLocation("buttons"));
    public static final TagKey<Item> WOODEN_DOORS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_doors"));
    public static final TagKey<Item> WOODEN_STAIRS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_stairs"));
    public static final TagKey<Item> WOODEN_SLABS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_slabs"));
    public static final TagKey<Item> WOODEN_FENCES = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_fences"));
    public static final TagKey<Item> WOODEN_PRESSURE_PLATES = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_pressure_plates"));
    public static final TagKey<Item> PRESSURE_PLATES = TagKey.create(Registries.ITEM,
            new ResourceLocation("pressure_plates"));
    public static final TagKey<Item> WOODEN_TRAPDOORS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wooden_trapdoors"));
    public static final TagKey<Item> DOORS = TagKey.create(Registries.ITEM,
            new ResourceLocation("doors"));
    public static final TagKey<Item> SAPLINGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("saplings"));
    public static final TagKey<Item> LOGS_THAT_BURN = TagKey.create(Registries.ITEM,
            new ResourceLocation("logs_that_burn"));
    public static final TagKey<Item> LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation("logs"));
    public static final TagKey<Item> BLOODWOOD_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation(MysteriousBiomes.MOD_ID, "bloodwood_logs"));
    public static final TagKey<Item> GHOSTLY_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation(MysteriousBiomes.MOD_ID, "ghostly_logs"));
    public static final TagKey<Item> SEEPING_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation(MysteriousBiomes.MOD_ID, "seeping_logs"));
    public static final TagKey<Item> SORBUS_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation(MysteriousBiomes.MOD_ID, "sorbus_logs"));
    public static final TagKey<Item> WALNUT_LOGS = TagKey.create(Registries.ITEM,
            new ResourceLocation(MysteriousBiomes.MOD_ID, "walnut_logs"));
    public static final TagKey<Item> STAIRS = TagKey.create(Registries.ITEM,
            new ResourceLocation("stairs"));
    public static final TagKey<Item> SLABS = TagKey.create(Registries.ITEM,
            new ResourceLocation("slabs"));
    public static final TagKey<Item> LEAVES = TagKey.create(Registries.ITEM,
            new ResourceLocation("leaves"));
    public static final TagKey<Item> TRAPDOORS = TagKey.create(Registries.ITEM,
            new ResourceLocation("trapdoors"));
    public static final TagKey<Item> FENCES = TagKey.create(Registries.ITEM,
            new ResourceLocation("fences"));
    public static final TagKey<Item> STANDING_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("standing_signs"));
    public static final TagKey<Item> WALL_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wall_signs"));
    public static final TagKey<Item> SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("signs"));
    public static final TagKey<Item> CEILING_HANGING_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("ceiling_hanging_signs"));
    public static final TagKey<Item> WALL_HANGING_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("wall_hanging_signs"));
    public static final TagKey<Item> ALL_HANGING_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("all_hanging_signs"));
    public static final TagKey<Item> ALL_SIGNS = TagKey.create(Registries.ITEM,
            new ResourceLocation("all_signs"));
    public static final TagKey<Item> FENCE_GATES = TagKey.create(Registries.ITEM,
            new ResourceLocation("fence_gates"));
}
