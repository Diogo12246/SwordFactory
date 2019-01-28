public class Sword {
    Material materialType;
    Enchantment enchantmentType;

    public Material getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Material materialType) {
        this.materialType = materialType;
    }

    public Enchantment getEnchantmentType() {
        return enchantmentType;
    }

    public void setEnchantmentType(Enchantment enchantmentType) {
        this.enchantmentType = enchantmentType;
    }

    public Sword(Material materialType, Enchantment enchantmentType) {
        this.materialType = materialType;
        this.enchantmentType = enchantmentType;
    }

    public Sword(Material materialType) {
        this.materialType = materialType;
    }

    public Sword() {
    }
}
