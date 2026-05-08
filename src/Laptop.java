import java.util.Scanner;

public class Laptop {

    String brand;
    String model;
    int ram;
    boolean isOn;

    Laptop(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.isOn = false;
    }

    void powerOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is powering on...");
        System.out.println("RAM: " + ram + "GB | Status: ON");
    }

    void powerOff() {
        isOn = false;
        System.out.println("Shutting down " + brand + " " + model + "...");
        System.out.println("Goodbye!");
    }

    void showSpecs() {
        System.out.println("--- Specs ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + "GB");
    }
}