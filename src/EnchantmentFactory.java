public class EnchantmentFactory extends SwordFactory {

    @Override
    Material getMaterial(String materialType) {
        return null;
    }

    @Override
    Enchantment getEnchantment(String enchantmentType) {
        String nullEnchant = "Sword has no enchantments.";
        if (enchantmentType == null || equals("")){
            System.out.println(nullEnchant);
            return null;
        }
        if (enchantmentType.equalsIgnoreCase("Frost")){
            return new Frost();
        } else if (enchantmentType.equalsIgnoreCase("SoulDrain")){
            return new SoulDrain();
        } else  if (enchantmentType.equalsIgnoreCase("Fire")){
            return new Fire();
        } else if (enchantmentType.equalsIgnoreCase("Shock")){
            return new Shock();
        }
        return null;
    }

    @Override
    SwordManufacturer getManufacturer(String Manufacturer) {
        return null;
    }
}
