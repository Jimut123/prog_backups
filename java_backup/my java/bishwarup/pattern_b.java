class pattern_b
{
public static void main(int n)
{
int i,j,m;
for(i=1;i<=n;i++)
{
if(i%2==0)
m=0;
else
m=1;
for(j=1;j<=i;j++)
{
System.out.print(m);
if(m==0)
m=1;
else
m=0;
}
System.out.println(" ");
}
}
}

