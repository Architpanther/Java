import java.util.Scanner;

public class ViscosityCalculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the force applied (in Newtons): ");
        double force = sc.nextDouble();

        System.out.println("Enter the area over which force is applied (in square meters): ");
        double area = sc.nextDouble();

        System.out.println("Enter the velocity of the liquid layer (in m/s): ");
        double velocity = sc.nextDouble();

        System.out.println("Enter the distance between layers (in meters): ");
        double distance = sc.nextDouble();

        // Calculations
        double shearStress = force / area;
        double shearRate = velocity / distance;
        double viscosity = shearStress / shearRate;

        // Output
        System.out.printf("The viscosity of the liquid is: %.4f Pa·s\n", viscosity);
    }
}
