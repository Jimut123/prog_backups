import java.util.*;
class DQ
{
    double p,r,t,s;
    double p1,r1,t1,c,c1;
    
    void cal(double a,double b,double c)
    {
        p=a;
        r=b;
        t=c;
        s=(a*b*c)/100;
        System.out.println(s);
    }
    void cal(double d,int e,double f)
    {
       p1=d;
        r1=e;
        t1=f;
        c=d*(1+(e/100));
        c1=(Math.pow(c,f));
        System.out.println(c1);
    }
    public static void main(String[]args)
{
    double w,x,y;
    int z;
    Scanner sc=new Scanner(System.in);
    w=sc.nextDouble();
    x=sc.nextDouble();
    y=sc.nextDouble();
    z=sc.nextInt();
    DQ d=new DQ();
    d.cal(w,x,y);
    d.cal(y,z,w);
}}