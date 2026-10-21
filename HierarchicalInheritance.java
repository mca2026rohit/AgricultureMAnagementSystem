// HierarchicalInheritance.java
class AgriculturalEquipment {
    void displayEquipment() {
        System.out.println("Category: Agricultural Equipment");
        System.out.println("Purpose: Supporting Farm Operations");
    }
}

class Tractor extends AgriculturalEquipment {
    void ploughField() {
        System.out.println("Tractor is ploughing the field.");
    }
}

class Harvester extends AgriculturalEquipment {
    void harvestCrop() {
        System.out.println("Harvester is harvesting the crop.");
    }
}

public class HierarchicalInheritance {
    public static void run() {
        System.out.println("\n--- HIERARCHICAL INHERITANCE ---");

        System.out.println("\nTractor Details:");
        Tractor tractor = new Tractor();
        tractor.displayEquipment();
        tractor.ploughField();

        System.out.println("\nHarvester Details:");
        Harvester harvester = new Harvester();
        harvester.displayEquipment();
        harvester.harvestCrop();
    }
}
