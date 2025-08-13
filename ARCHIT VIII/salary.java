import java.util.Scanner;
class salary
{
     public static void main()
     { 
         Scanner in=new Scanner(System.in);
         System.out.println("Enter Salary");
         double b=in.nextDouble();
         double incentive= b*7/100;
         double net_salary= b+incentive;
         System.out.println("          CJC         ");
         System.out.println("----------------------");
         System.out.println("Name= Mr.Agarwal   ");
         System.out.println("Basic Salary= "+b);
         System.out.println("Incentive= "+incentive);
         System.out.println("Net Salary= "+net_salary);
         
         System.out.println("----------------------");
         System.out.println("       THANK YOU      ");
        }
    }