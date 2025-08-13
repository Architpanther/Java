public class DigitSplitter {
    public static void main() {
        int number = 123; // Example three-digit number
        
        int thirdDigit = number % 10;
        number = number / 10;
        
        int secondDigit = number % 10;
        int firstDigit = number / 10;
        
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Second Digit: " + secondDigit);
        System.out.println("Third Digit: " + thirdDigit);
   }
}
