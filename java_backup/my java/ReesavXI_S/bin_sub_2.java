import java.util.*;
class bin_sub_2
{
    String n="";
    String n1="";
    bin_sub_2(String num,String num1)
    {
        n=num;
        n1=num1;
    }
    void clac()
    {
        String z="";
        int i=0,j=0;
        for(i=0;i<n1.length();i++)
        {
            if(n1.charAt(i)=='1')
            z=z+"0";
            else
            z=z+"1";
        }
        int x=Integer.parseInt(n);
        int y=Integer.parseInt(z);
        int cr=0,a=0,a1=0,i4=0;
        String s="";
        while(x>0||y>0||cr!=0)
        {
            a=x%10;
            a1=y%10;
                if(a==0&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"0";
            }
                else if(a==0&&a1==1&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==1&&cr==0)
                {
                    s=s+"0";
                    cr=1;
                }
             else if(a==0&&a1==0&&cr==1)
              {
                cr=0;  
                s=s+"1";
            }
                else if(a==0&&a1==1&&cr==1)
                {
                cr=1;    
                s=s+"0";
            }
                else if(a==1&&a1==0&&cr==1)
                {
                    cr=1;
                    s=s+"0";
            }
                else if(a==1&&a1==1&&cr==1)
                {
                    s=s+"1";
                    cr=1;
                }
            x=x/10;
            y=y/10;
        } 
        int n3;
        if(Integer.parseInt(n)>Integer.parseInt(n1))
        n3=Integer.parseInt(n);
        else
        n3=Integer.parseInt(n1);
        int cr1=0;
        while(n3>0)
        {
            cr1++;
            n3=n3/10;
        }
        String z1="";
        for(int k6=s.length()-1;k6>=0;k6--)
        z1=z1+s.charAt(k6);
        int r2=Integer.parseInt(z1);
        int r1=r2/(int)(Math.pow(10,cr1));
        r2=r2%(int)(Math.pow(10,cr1));
        cr=0;a=0;a1=0;i4=0;
        s="";
        while(r2>0||r1>0||cr!=0)
        {
            a=r2%10;
            a1=r1%10;
                if(a==0&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"0";
            }
                else if(a==0&&a1==1&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==1&&cr==0)
                {
                    s=s+"0";
                    cr=1;
                }
             else if(a==0&&a1==0&&cr==1)
              {
                cr=0;  
                s=s+"1";
            }
                else if(a==0&&a1==1&&cr==1)
                {
                cr=1;    
                s=s+"0";
            }
                else if(a==1&&a1==0&&cr==1)
                {
                    cr=1;
                    s=s+"0";
            }
                else if(a==1&&a1==1&&cr==1)
                {
                    s=s+"1";
                    cr=1;
                }
            r2=r2/10;
            r1=r1/10;
        }
        
        for(i=s.length()-1;i>=0;i--)
        System.out.print(s.charAt(i));
           }
}