import java.util.*;
class SCH_one
{ 
    public static void main()
    { 
        Scanner in=new Scanner(System.in);
        int t1,t2,t3;
        double fm;
        System.out.println("Enter 3 term Marks");
        t1=in.nextInt();
        t2=in.nextInt();
        t3=in.nextInt();
        fm=(0.3*t1)+(0.3*t2)+0.4*t3;
        System.out.println("Weighted Marks= "+fm);
        System.out.println("Weighted %= "+((fm/300)*100)+"%");
        
    }
}