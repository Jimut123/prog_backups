import java.io.*;
class decimal_binary
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double d,d1,d2;int n,k,t,c,i;
System.out.print("Enter the number");
d=Double.parseDouble(br.readLine());
d1=0;d2=0;k=0;c=0;
n=(int)d;
//System.out.print(n);
d1=d-(double)n;
int a[]=new int[100];
t=0;
while(n>0)
{
    k=n%2;
    a[t++]=k;
    n=n/2;
}
for(i=t-1;i>=0;i--)
{
    System.out.print(a[i]);
}
System.out.print(".");
while(d1>0)
{
    d2=d1*2;
    if(d2>=1)
    { 
       System.out.print("1");
       d1=d2-1;
    }
    else if(d2<1)
    {
        System.out.print("0");
        d1=d2;
    }
    c++;
    if(c>4)
    break;
}
}
}
        