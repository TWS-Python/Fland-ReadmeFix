package com.flemmli97.flan.claim;

import com.flemmli97.flan.config.ConfigHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.raid.Raid;

public enum EnumPermission {

    EDITCLAIM(ConfigHandler.config.claimingItem),
    EDITPERMS(Items.COMMAND_BLOCK),
    BREAK(Items.DIAMOND_PICKAXE),
    PLACE(Items.GRASS_BLOCK),
    OPENCONTAINER(Items.CHEST),
    ANVIL(Items.ANVIL),
    BED(Items.RED_BED),
    BEACON(Items.BEACON),
    DOOR(Items.OAK_DOOR),
    FENCEGATE(Items.OAK_FENCE_GATE),
    TRAPDOOR(Items.OAK_TRAPDOOR),
    BUTTONLEVER(Items.LEVER),
    PRESSUREPLATE(Items.STONE_PRESSURE_PLATE),
    NOTEBLOCK(Items.NOTE_BLOCK),
    REDSTONE(Items.REDSTONE),
    JUKEBOX(Items.JUKEBOX),
    ITEMFRAMEROTATE(Items.ITEM_FRAME),
    LECTERNTAKE(Items.LECTERN),
    ENDCRYSTALPLACE(Items.END_CRYSTAL),
    TARGETBLOCK(Items.TARGET),
    PROJECTILES(Items.ARROW),
    TRAMPLE(Items.FARMLAND),
    PORTAL(Items.OBSIDIAN),
    RAID(null),
    BOAT(Items.OAK_BOAT),
    MINECART(Items.MINECART),
    BUCKET(Items.BUCKET),
    ENDERPEARL(Items.ENDER_PEARL),
    ANIMALINTERACT(Items.CHICKEN_SPAWN_EGG),
    HURTANIMAL(Items.BEEF),
    HURTPLAYER(Items.DIAMOND_SWORD),
    XP(Items.EXPERIENCE_BOTTLE),
    TRADING(Items.EMERALD),
    EXPLOSIONS(Items.TNT),
    WITHER(Items.WITHER_SKELETON_SKULL),
    ARMORSTAND(Items.ARMOR_STAND),
    BREAKNONLIVING(Items.COMMAND_BLOCK_MINECART);

    private final Item item;

    EnumPermission(Item item) {
        this.item = item;
    }

    public ItemStack getItem() {
        if(this==RAID)
            return Raid.getOminousBanner();
        return new ItemStack(this.item);
    }
}
