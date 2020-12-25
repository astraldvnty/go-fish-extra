package draylar.gofish.registry;

import draylar.gofish.GoFish;
import draylar.gofish.loot.BiomeLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.registry.Registry;

public class GoFishLoot {

    public static final LootConditionType MATCH_BIOME = register("match_biome", new BiomeLootCondition.Serializer());

    private static LootConditionType register(String id, JsonSerializer<? extends LootCondition> serializer) {
        return Registry.register(Registry.LOOT_CONDITION_TYPE, GoFish.id(id), new LootConditionType(serializer));
    }

    public static void init() {

    }

    private GoFishLoot() {

    }
}