class bill
{ 
    public static void main()
    {
        double puff,pizz,q1,q2,tc1,tc2,tc,d,fb;
        puff=50;
        pizz=100;
        q1=4;
        q2=3;
        tc1=puff*q1;
        tc2=pizz*q2;
        tc=tc1+tc2;
        d=0.05*tc;
        fb=tc-d;
        System.out.println("                Bill                ");
        System.out.println("************************************");
        System.out.println("Item    Quantity      Rate     Total");
        System.out.println("Puff     "+q1+"        "+puff+"       "+tc1);
        System.out.println("Pizza    "+q2+"        "+pizz+"       "+tc2);
        System.out.println("                        TOTAL= "+tc);
        System.out.println("                      DISCOUNT= "+d);
        System.out.println("                   FINAL BILL= "+fb);
        System.out.println("************************************");
        System.out.println("        THANKS VISIT AGAIN        ");
    }
}
        
        
        