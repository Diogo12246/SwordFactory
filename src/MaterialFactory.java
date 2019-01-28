public class MaterialFactory extends SwordFactory {

    @Override
    Material getMaterial(String materialType) {
        if (materialType == null){
            return null;
        }
        if (materialType.equalsIgnoreCase("Steel")){
            return new Steel();
        } else if (materialType.equalsIgnoreCase("Ebony")){
            return new Ebony();
        } else  if (materialType.equalsIgnoreCase("Dwarven")){
            return new Dwarven();
        } else if (materialType.equalsIgnoreCase("Daedric")){
            return new Daedric();
        }
        return null;
    }

    @Override
    Enchantment getEnchantment(String enchantment) {
        return null;
    }

    @Override
    SwordManufacturer getManufacturer(String Manufacturer) {
        return null;
    }
}
