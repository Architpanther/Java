import java.util.*;
class Electric
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int e;
        double ch;
        System.out.println("Enter Consumption");
        e=in.nextInt();
        if (e<=100)
        ch=250;
        else if(e>100 && e<=350)
        ch=250+(2.5*(e-100));
        else if(e>350 && e<=700)
        ch=250+(250*2.5)+(3.5*(e-350));
        else
        ch=250+(250*2.5)+(3.5*350)+(4.5*(e-700))+500;
        System.out.println("Charges= "+ch);
    }
}