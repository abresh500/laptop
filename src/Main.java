import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GamingLaptop myLaptop = new GamingLaptop("MSI", "GF Thin", 16, "GTX 1650");

        myLaptop.powerOn();
        myLaptop.showSpecs();

        System.out.println();
        myLaptop.login(scanner);

        System.out.println("\nPress Enter to power off...");
        scanner.nextLine();

        myLaptop.powerOff();
        scanner.close();
    }
}