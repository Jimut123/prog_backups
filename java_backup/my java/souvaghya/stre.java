import java.io.*;
class stre
{
    public static void main(String args[])throws IOException
    
    {
        String t;
        t="";
       int i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=new String[5];
        for( i=0;i<5;i++)
        { 
            System.out.println("Enter name:");
            s[i]=br.readLine();
        }
        for( i=0;i<5;i++)
        { 
            for( j=0;j<5-i-1;j++)
            if(s[j].compareTo(s[j+1])>0)
            {
            t=s[j];
            s[j]=s[j+1];
            s[j+1]=t;
        }
        }
        for( i=0;i<5;i++)
          System.out.println(s[i]);
        }
    }
       
       