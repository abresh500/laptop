import java.util.Scanner;

public class GamingLaptop extends Laptop {

    String gpu;
    String correctPassword = "rod wave";

    GamingLaptop(String brand, String model, int ram, String gpu) {
        super(brand, model, ram);
        this.gpu = gpu;
    }

    @Override
    void showSpecs() {
        super.showSpecs();
        System.out.println("GPU: " + gpu);
    }

    void login(Scanner scanner) {
        String input = "";

        while (!input.equals(correctPassword)) {
            System.out.print("Enter password: ");
            input = scanner.nextLine();

            if (!input.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }
        }

        System.out.println("Access granted! Welcome.");
    }
}