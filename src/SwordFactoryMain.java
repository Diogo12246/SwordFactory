//import java.util.ArrayList;

public class SwordFactoryMain {

    //private ArrayList<Sword> swords = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("Sword Generator Initialized");
        System.out.println("\n");

        System.out.println("***SWORD 1***");
        SwordFactory swordFactory = SwordManufacturer.getManufacturer("Riften");
        SwordFactory enchantmentFactory = SwordManufacturer.getEnchantment("enchanted");
        Material material = swordFactory.getMaterial("Steel");
        material.forge();
        Enchantment enchantment = enchantmentFactory.getEnchantment("Fire");
        enchantment.enchant();
        System.out.println("*************");
        System.out.println("\n");

        System.out.println("***SWORD 2***");
        SwordFactory swordFactory2 = SwordManufacturer.getManufacturer("Markarth");
        SwordFactory enchantmentFactory2 = SwordManufacturer.getEnchantment("enchanted");
        Material material2 = swordFactory2.getMaterial("Daedric");
        material2.forge();
        Enchantment enchantment2 = enchantmentFactory2.getEnchantment("SoulDrain");
        enchantment2.enchant();
        System.out.println("*************");
        System.out.println("\n");

        System.out.println("***SWORD 3***");
        SwordFactory swordFactory3 = SwordManufacturer.getManufacturer("Solitude");
        SwordFactory enchantmentFactory3 = SwordManufacturer.getEnchantment("enchanted");
        Material material3 = swordFactory3.getMaterial("Ebony");
        material3.forge();
        Enchantment enchantment3 = enchantmentFactory3.getEnchantment("Frost");
        enchantment3.enchant();
        System.out.println("*************");
        System.out.println("\n");
    }
}
