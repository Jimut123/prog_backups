package project_2011_half_yearly;

import java.io.*;
class spiral_mtrx
{
public static void main()throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit for spiral matrix : (limit<5) :");
n=Integer.parseInt(br.readLine());
if(n==5)
System.out.println("give limit < 5 !!!!!!!!!!!!!");
else
{
int ar[][]=new int[n][n];
int i,j;
int p,k,u,c=0,u1;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
ar[i][j]=0;
p=n*n;
k=1;
int r=0;
u=n;
i=j=0;
u1=0;
while(k<=p)
{
i=r;
j=c;
while(j<u)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
j++;
}
j=j-1;
i=i+1;
while(i<u)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
i++;
}
i=i-1;
j=j-1;
while(j>=c)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
j--;
}
j=j+1;
i=i-1;
while(i>0)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k++;
}
i--;
}
r=r+1;
c=c+1;
/*for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(ar[i][j]+",");
System.out.println("");
}*/
u=u-1;
}
System.out.println("the spiral matrix is: ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(ar[i][j]+",");
System.out.println("");
}
}
}
}
