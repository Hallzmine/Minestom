//==============================
//  AUTOGENERATED BY EnumGenerator
//==============================
package net.minestom.server.potion;

import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

@SuppressWarnings({"deprecation"})

public enum PotionEffect {
    SPEED("minecraft:speed"),
    SLOWNESS("minecraft:slowness"),
    HASTE("minecraft:haste"),
    MINING_FATIGUE("minecraft:mining_fatigue"),
    STRENGTH("minecraft:strength"),
    INSTANT_HEALTH("minecraft:instant_health"),
    INSTANT_DAMAGE("minecraft:instant_damage"),
    JUMP_BOOST("minecraft:jump_boost"),
    NAUSEA("minecraft:nausea"),
    REGENERATION("minecraft:regeneration"),
    RESISTANCE("minecraft:resistance"),
    FIRE_RESISTANCE("minecraft:fire_resistance"),
    WATER_BREATHING("minecraft:water_breathing"),
    INVISIBILITY("minecraft:invisibility"),
    BLINDNESS("minecraft:blindness"),
    NIGHT_VISION("minecraft:night_vision"),
    HUNGER("minecraft:hunger"),
    WEAKNESS("minecraft:weakness"),
    POISON("minecraft:poison"),
    WITHER("minecraft:wither"),
    HEALTH_BOOST("minecraft:health_boost"),
    ABSORPTION("minecraft:absorption"),
    SATURATION("minecraft:saturation"),
    GLOWING("minecraft:glowing"),
    LEVITATION("minecraft:levitation"),
    LUCK("minecraft:luck"),
    UNLUCK("minecraft:unluck"),
    SLOW_FALLING("minecraft:slow_falling"),
    CONDUIT_POWER("minecraft:conduit_power"),
    DOLPHINS_GRACE("minecraft:dolphins_grace"),
    BAD_OMEN("minecraft:bad_omen"),
    HERO_OF_THE_VILLAGE("minecraft:hero_of_the_village"),
    ;
    private String namespaceID;

    PotionEffect(String namespaceID) {
        this.namespaceID = namespaceID;
        Registries.potionEffects.put(NamespaceID.from(namespaceID), this);
    }

    public int getId() {
        return ordinal();
    }

    public String getNamespaceID() {
        return namespaceID;
    }

    public static PotionEffect fromId(int id) {
        if (id >= 0 && id < values().length) {
            return values()[id];
        }
        return null;
    }
}
