import java.util.*;
public class urispiralmatrix
{
void sum()
{
Scanner sc=new Scanner(System.in);
int a,c,d,e,g,h,i,j,m,n,ch,l,ll;
System.out.println("enter limit");
a=sc.nextInt();ll=a;
int b[][]= new int[a][a];
ch=1;
d=0;e=0;g=a-1;h=a-1;j=1;i=0;l=1;ll=1;
for(c=1;c<=(a*a);c=c+1)
{
switch(ch)
{
case 1:
b[d][e]=c;
if(e==g )
{d=d+1;
ch++;
continue;
}
else{e++;
break;}
case 2:
b[d][e]=c;
if(d==h)
{
ch++;
e=e-1;
break;
}
d++;
break;
case 3:
b[d][e]=c;
if(e==i)
{
ch++;
d=d-1;
break;
}
e=e-1;
break;
case 4:
b[d][e]=c;
if(d==j)
{
ch++;
e=e+1;
break;
}
d=d-1;
break;
}
if(ch>=5)
{ch=1;
d=l;e=ll;
g=g-1;
h=h-1;
j=j+1;
i=i+1;
l++;
ll++;
}
}
for(m=0;m<a;m=m+1)
{
for(n=0;n<a;n=n+1)
{
System.out.print("    "+b[m][n]+"    ");
}System.out.println();
}
}
}