// MultilevelInheritance.java
class AgriculturalActivity {
    void displayActivity() {
        System.out.println("Activity: Agriculture");
        System.out.println("Purpose: Food Production");
    }
}

class CropCultivation extends AgriculturalActivity {
    void displayCultivation() {
        System.out.println("Activity: Crop Cultivation");
        System.out.println("Preparing soil and planting seeds.");
    }
}

class OrganicFarming extends CropCultivation {
    void displayOrganicFarming() {
        System.out.println("Method: Organic Farming");
        System.out.println("Using natural manure and compost.");
        System.out.println("Reducing the use of synthetic chemicals.");
    }
}

public class MultilevelInheritance {
    public static void run() {
        System.out.println("\n--- MULTILEVEL INHERITANCE ---");

        OrganicFarming farm = new OrganicFarming();
        farm.displayActivity();
        farm.displayCultivation();
        farm.displayOrganicFarming();
    }
}
