import java.util.Scanner;//well this is for askin user tf they wanted

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GamingLaptop myLaptop = new GamingLaptop("MSI", "GF Thin", 16, "GTX 1650");
//i fuckin love my pc
        myLaptop.powerOn();
        myLaptop.showSpecs();

        System.out.println();
        myLaptop.login(scanner);

        System.out.println("\nPress Enter to power off...");
        //well idk why i even used \n it feels right and it worked there
        scanner.nextLine();

        myLaptop.powerOff();
        scanner.close();
    }
}