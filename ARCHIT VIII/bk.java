class bk
{
    public static void main()
    {
        double bur,puff,fries,n1,n2,n3;
        bur=250;
        puff=150;
        fries=120;
        n1=3;
        n2=5;
        n3=2;
        double p1,p2,p3,fc;
        p1=bur*n1;
        p2=puff*n2;
        p3=fries*n3;
        fc=(p1+p2+p3)-75;
        System.out.println("                 BILL                 ");
        System.out.println("--------------------------------------");
        System.out.println("ITEM NO     ITEM NAME     QUANTITY     PRICE     AMT");
        System.out.println("--------------------------------------");
        System.out.println("1             BUR          "+n1+"       "+bur+"     "+p1);
        System.out.println("2             PUFF         "+n2+"       "+puff+"    "+p2);
    }

}
        