// SingleInheritance.java
class Crop {
    String cropName;
    int duration;

    void displayCropDetails() {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Crop Duration: " + duration + " days");
    }
}

class RiceCrop extends Crop {
    void displayRiceDetails() {
        System.out.println("Crop Type: Rice");
        System.out.println("Cultivation Method: Paddy Farming");
        System.out.println("Water Requirement: High");
    }
}

public class SingleInheritance {
    public static void run() {
        System.out.println("\n--- SINGLE INHERITANCE ---");

        RiceCrop rice = new RiceCrop();
        rice.cropName = "Rice";
        rice.duration = 120;

        rice.displayCropDetails();
        rice.displayRiceDetails();
    }
}
