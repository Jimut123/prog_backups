package gr;


import java.io.*;
 class add_large
{
    String s,s1,s2;
    int sum,c,k,i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    add_large()throws IOException
    {
      System.out.println("Enter 1st number:");
      s=br.readLine();
      System.out.println("Enter 2nd number:");
      s1=br.readLine();
      sum=c=0;
      s2="";
      if(s.length()>s1.length())
      {
          while(s1.length()<s.length())
           s1="0"+s1;
        }
        else
         if(s1.length()>s.length())
      {
          while(s.length()<s1.length())
           s="0"+s;
        }
    }

    void start()
    {
      for(i=s.length()-1;i>=0;i--)
      {
          calc(s.charAt(i),s1.charAt(i));
        }
        if(c>0)
s2=c+s2;
    }
    void calc(char c1, char d)
    {
        int a,b;
        if(((int)c1-48>=0 && (int)c1-48<=9)&&((int)d-48>=0 && (int)d-48<=9))
        {
            a=(int)c1-48;
            b=(int)d-48;
            k=(a+b);
            //System.out.println("b"+c);
            if((k+c)>=10)
            {
            sum=(k+c)%10;
            c=(k+c)/10;
        }
        else
        {
         sum=(k+c);
            c=(k+c)/10;
        }
            //sum=((a+b)%10)+c;
            //c=(a+b)/10;
            //System.out.println(sum);
            //System.out.println(c);
                s2=sum+s2;
             
            
    
}

}
             
void show()
{
    System.out.println("Number is:"+s2);
}
public static void main(String args[])throws IOException
{
    add_large ad=new add_large();
    ad.start();
    ad.show();
}
}


