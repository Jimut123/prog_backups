import java.io.*;
class saddlepoint
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int max=0;
int t=0,t1=0,i,n,j;
System.out.println("Enter array length:");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int ar1[]=new int[n];
int ar2[]=new int[n];
System.out.println("Enter the numbers in array");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Enter element for position ("+i+","+j+")");
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("ORIGINAL ARRAY");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
max=0;
for(j=0;j<n;j++)
{
if(a[i][j]>max)
max=a[i][j];
}
ar1[t++]=max;
}
int min=ar1[0];
for(i=0;i<t;i++)
if(ar1[i]<min)
min=ar1[i];
t1=0;
int min1=a[0][0];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[j][i]<min1)
min1=a[j][i];
}
ar2[t1++]=min1;
if((i+1)<n)
min1=a[0][i+1];
}
int max1=0;
for(i=0;i<t1;i++)
if(ar2[i]>max1)
max1=ar2[i];
int f=0;
if(min==max1)
{
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(a[i][j]==min)
{
f=1;
System.out.println("Saddle point is:"+i+","+j+ "Element:" +min);
break;
}
}
else
{
System.out.println("Saddle point not found:");
}
}
}