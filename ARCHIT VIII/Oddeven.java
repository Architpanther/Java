import java.util.*;
class Oddeven
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter A No.");
        n=in.nextInt();
        if (n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}