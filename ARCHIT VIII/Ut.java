import java.util.*;
class Ut
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter L and B");
        int l,b,p,a;
        l=in.nextInt();
        b=in.nextInt();
        a=l*b;
        p=2*(l+b);
        System.out.println("Area ="+a+" m^2");
        System.out.println("Perimeter ="+p+" m");
         System.out.println("Difference ="+(a-p));
    }
}
        