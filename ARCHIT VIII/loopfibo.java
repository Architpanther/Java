 class loopfibo {
    public static void main() {
        int n1=0,n2=1;
        int i;
       
        System.out.print(n1+" "+n2);
        for(i=2;i<=34;i++)
        {
            int n3=n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;
            i=n2;
        }
   }
}
