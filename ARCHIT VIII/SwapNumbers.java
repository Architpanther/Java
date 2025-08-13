
//*WAP to swap the values of two variables
//without using the third variable
 public class SwapNumbers
  {public static void main()
          {
           int n1 = 12, n2 = 24;
           System.out.println("--Before swap--");
           System.out.println("First number = " + n1); 
           System.out.println("Second number = " + n2);
           n1 = n1-n2;
           n2 = n1+n2;
           n1 = n2-n1;
           System.out.println("--After swap--");
           System.out.println("First number = "+n1);
           System.out.println("Second number = " + n2);

}
}
