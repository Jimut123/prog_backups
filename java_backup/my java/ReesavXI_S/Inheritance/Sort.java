package Inheritance;
import java.util.*;
class Sort extends B_Search
{ 
    int n;
    Sort(int n1)
    {
        super(n1);
        super.input();
        super.insert();
    }
    void sort1()
    {
        int temp;
        n=super.n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j=1]=temp;
                }
            }
        }
    }
}