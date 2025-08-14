import java.util.*;
class no_of_digits
{
    public static void archit()
    { 
        Scanner in=new Scanner(System.in);
        int n,d=0,i;
        System.out.println(" Enter A No. ");
        n=in.nextInt();
        for(i=n;i>0;i/=10)
            d++;
            System.out.println("No. Of digits= "+d);
    }
}