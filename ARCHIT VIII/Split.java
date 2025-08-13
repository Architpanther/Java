import java.util.*;
class Split
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,a,b,c;
        System.out.println("Enter A No.");
        n=in.nextInt();
        a=n%10;
        b=((n%100)-a)/10;
        c= n/100;
        System.out.println(c+" "+b+" "+a+" ");
    }
}