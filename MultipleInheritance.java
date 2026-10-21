// MultipleInheritance.java
interface FarmMachineCapability {
    void performFarmOperation();
}

interface IrrigationCapability {
    void manageIrrigation();
}

class SmartAgricultureMachine
        implements FarmMachineCapability, IrrigationCapability {

    @Override
    public void performFarmOperation() {
        System.out.println("Performing agricultural operations.");
        System.out.println("Machine: Smart Tractor");
    }

    @Override
    public void manageIrrigation() {
        System.out.println("Managing automatic irrigation.");
        System.out.println("Water supply adjusted for the crop.");
    }
}

public class MultipleInheritance {
    public static void run() {
        System.out.println("\n--- MULTIPLE INHERITANCE ---");

        SmartAgricultureMachine machine = new SmartAgricultureMachine();
        machine.performFarmOperation();
        machine.manageIrrigation();
    }
}
