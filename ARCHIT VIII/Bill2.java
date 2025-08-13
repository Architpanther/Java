class Bill2
{
    public static void main()
    {
        int brg, puf, n1, n2;
        int tot; 
        brg=45;
        puf=25;
        n1=4;
        n2=3;
        int p1=brg*n1;
        int p2=puf*n2;
        tot = p1+p2;
        System.out.println("No.\t Name \t Qty \t Price \t Amt");
        System.out.println("1." + "\t" + "Burger" + "\t" + n1 + "\t" + brg + "\t" + p1);
        System.out.println("2." + "\t" + "Puff" + "\t" + n2 + "\t" + puf + "\t" + p2);

        System.out.println("Total Bill = "+ tot);
        System.out.println("");
        System.out.println("Thank You, Visit Again");
        System.out.println("*");
    }
}