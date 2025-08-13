import java.util.Scanner;

public class ClockAngle {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter hours (1 to 12): ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes (0 to 59): ");
        int minutes = sc.nextInt();

        // Validating input
        if (hours < 1 || hours > 12 || minutes < 0 || minutes >= 60) {
            System.out.println("Invalid time entered.");
            return;
        }

        // Calculating the positions
        double minuteAngle = minutes * 6; // 360/60 = 6 degrees per minute
        double hourAngle = (hours % 12) * 30 + (minutes * 0.5); // 360/12 = 30 degrees per hour + 0.5 per minute

        // Finding the absolute difference
        double angle = Math.abs(hourAngle - minuteAngle);

        // Choosing the obtuse angle
        double obtuseAngle = (angle > 90) ? angle : 180 - angle;

        // Displaying the result
        System.out.println("The obtuse angle between the clock hands is: " + obtuseAngle + " degrees.");
    }
}
