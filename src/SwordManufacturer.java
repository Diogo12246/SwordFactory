public class SwordManufacturer {
    public static SwordFactory getManufacturer(String manufacturer){
        if (manufacturer.equals("")){
            return null;
        } else if (manufacturer.equalsIgnoreCase("Riften")){
            System.out.println("Sword produced in Riften");
            return new MaterialFactory(); }
        else if (manufacturer.equalsIgnoreCase("Markarth")){
            System.out.println("Sword produced in Markarth");
            return new MaterialFactory();
        }
        else if (manufacturer.equalsIgnoreCase("Solitude")){
            System.out.println("Sword produced in Solitude");
            return new MaterialFactory();
        }
    return null;
    }

    public static SwordFactory getEnchantment(String enchantment){
        if (enchantment.equalsIgnoreCase("")){
            return null;
        } else if (enchantment.equalsIgnoreCase("enchanted")){
            return new EnchantmentFactory();
        }
        return null;
    }
}
