package com.destrox.marvelzombies.init;

import com.destrox.marvelzombies.entity.ShadowMinionEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "marvelzombiesmod");

    public static final RegistryObject<EntityType<ShadowMinionEntity>> SHADOW_MINION = ENTITY_TYPES.register("shadow_minion",
            () -> EntityType.Builder.of(ShadowMinionEntity::new, MobCategory.MONSTER)
                    .sized(0.8F, 1.8F)
                    .build(new ResourceLocation("marvelzombiesmod", "shadow_minion").toString()));

    private ModEntities() {
    }
}
