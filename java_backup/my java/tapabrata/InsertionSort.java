//insertion sort
import java.io.*;
class InsertionSort
{
  int n;
  int a[]=new int[100];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException
  {
      int i;
      System.out.println("enter no. of terms");
       n=Integer.parseInt(br.readLine());
      for(i=0;i<n;i++)
      {
          System.out.println("enter element:");
           a[i]=Integer.parseInt(br.readLine());
        }
        isort();
        disp();
    }
    void isort()
    {
        int i,j,t;
        for(i=0;i<n;i++)
        {
            t=a[i];
            for(j=i-1;j>=0;j--)
            {
                if (t<a[j])
                {
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    void disp()
    {
int i,j,max,min;
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
max=min=a[0];
for(i=0;i<n;i++)
{if(a[i]>max)
max=a[i];
else
if(a[i]<min)
min=a[i];
}
for(i=max;i>=min;i--)
{int f=0;
for(j=0;j<n;j++)
{if(i==a[j])
{f++;
}
}
System.out.println(i+  "Freq "  +f);
}
}
}
        