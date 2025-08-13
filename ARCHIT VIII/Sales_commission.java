import java.util.*;
class Sales_commission
{ 
    public static void main()
    { 
        Scanner in=new Scanner(System.in);
        int s,n;
        double c;
        System.out.println("Enter Salary");
        s=in.nextInt();
        System.out.println("Enter Sales");
        n=in.nextInt();

        if(n<15000) 
        c=(0.03)*s;
        else if(n>=15000 && n<20000)
        c=(0.05)*s;
        else if(n>=20000 && n<50000)
        c=(0.1)*s;
        else 
        {c=(0.12)*s;}
        System.out.println("Commission= "+c);        
        System.out.println("Total Salary= "+(s+c));

    
    }
}