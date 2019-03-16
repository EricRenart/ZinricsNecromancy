package muchahawlucha.necromancymod.common.soul;

public class Soul {

    // This soul's Type (aka the mob it came from)
    EnumSoulType type;

    public Soul() {
        type = EnumSoulType.EMPTY_SOUL;
    }

    public Soul(EnumSoulType initType) {
        type = initType;
    }

    // Gets the Display Name of this soul.
    public String getSoulName() {
        switch(type) {

            case EMPTY_SOUL:
                return "Empty";
            case SOUL_PIG:
                return "Pig";
            case SOUL_COW:
                return "Cow";
            case SOUL_CHICKEN:
                return "Chicken";
            case SOUL_SHEEP:
                return "Sheep";
            case SOUL_HORSE:
                return "Horse";
            case SOUL_PARROT:
                return "Parrot";
            case SOUL_SQUID:
                return "Squid";
            case SOUL_OCELOT:
                return "Ocelot";
            case SOUL_WOLF:
                return "Wolf";
            case SOUL_SPIDER:
                return "Spider";
            case SOUL_ZOMBIE:
                return "Zombie";
            case SOUL_SKELETON:
                return "Skeleton";
            case SOUL_WITHER_SKELETON:
                return "Wither Skeleton";
            case SOUL_ZOMBIE_PIGMAN:
                return "Zombie Pigman";
            case SOUL_BLAZE:
                return "Blaze";
            case SOUL_GHAST:
                return "Ghast";
            case SOUL_CREEPER:
                return "Creeper";
            case SOUL_ENDERMAN:
                return "Enderman";
            case SOUL_GUARDIAN:
                return "Guardian";
            case SOUL_SILVERFISH:
                return "Silverfish";
            case SOUL_ENDER_DRAGON:
                return "Ender Dragon";
            case SOUL_VILLAGER:
                return "Villager";
            case SOUL_ZOMBIE_VILLAGER:
                return "Zombie Villager";
            case SOUL_ILLAGER:
                return "Illager";
            default:
                return null;
        }
    }

    // Gets the type enum of this Soul.
    public EnumSoulType getType() {
        return type;
    }
}
