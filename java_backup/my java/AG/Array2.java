import java.util.*;
class Array2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i;
        System.out.println("Even term");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println(a[0]);
        System.out.println(a[n-1]);
    }
}
        