import java.util.*;
class Buzze
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter A No.");
        n=in.nextInt();
        if (n%7==0 || n%10==7)
        System.out.println("Buzz");
        else if(n/11==0)
        System.out.println("Pallendrom");
        else
        System.out.println("None");
    }
}
