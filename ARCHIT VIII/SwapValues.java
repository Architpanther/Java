public class SwapValues {
    public static void main() {
        // Step 1: Declare and initialize the variables
        int a = 10;  // Assign 10 to variable a
        int b = 20;  // Assign 20 to variable b
        
        // Step 2: Display initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Step 3: Swap the values using a different variable (x)
        int x = a;  // Store value of a in x (instead of temp)
        a = b;      // Assign value of b to a
        b = x;      // Assign value of x (original a) to b
        
        // Step 4: Display swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
