import java.util.*;
class palin
{
    int n,orig;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        n=sc.nextInt();
        orig=n;
    }
    void clac()
    {
        int m=0,z=0,i=0;
        for(i=0;i<15;i++)
        {
            m=rev(n);
            z=m+n;
            if(palin(z)==true)
            break;
            n=z;
        }
        System.out.println("The number was "+orig);
        System.out.println("The palindrome is "+z);
        System.out.println("The step was "+(i+1));
    }
    int rev(int n)
    {
        int a,rev=0;
        while(n>0)
        {
            a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        return rev;
    }
    boolean palin(int n)
    {
        int m;
        m=rev(n);
        if(m==n)
        return true;
        return false;
    }
}