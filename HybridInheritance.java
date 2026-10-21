// HybridInheritance.java
interface IrrigationMonitoring {
    void monitorSoilMoisture();
}

class AgriculturalTechnology {
    void displayTechnology() {
        System.out.println("Technology: Smart Agriculture");
        System.out.println("Purpose: Improving Farm Efficiency");
    }
}

class SmartIrrigation extends AgriculturalTechnology
        implements IrrigationMonitoring {

    @Override
    public void monitorSoilMoisture() {
        System.out.println("Monitoring soil moisture.");
        System.out.println("Soil moisture level: 35%");
    }

    void controlWaterSupply() {
        System.out.println("Checking soil moisture requirements.");
        System.out.println("Activating irrigation when required.");
    }
}

public class HybridInheritance {
    public static void run() {
        System.out.println("\n--- HYBRID INHERITANCE ---");

        SmartIrrigation system = new SmartIrrigation();
        system.displayTechnology();
        system.monitorSoilMoisture();
        system.controlWaterSupply();
    }
}
