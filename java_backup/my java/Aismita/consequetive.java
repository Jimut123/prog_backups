import java.io.*;
class consequetive
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number greater than 0");
        int n=Integer.parseInt(in.readLine());
        String w="";int s=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
            s=s+j;//System.out.println(s);
            if(s>n)
            {
            s=0;
            break;
            }
            else
            if(s==n)
            {
                //k=j;
                for(int k=i;k<=j;k++)
                {
                    String p=Integer.toString(k);
                    if(k==i)
                    w=w+p;
                    else
                    w=w+"+"+p;
                }
                System.out.println(w+"=" +n);s=0;w="";break;
            }
        }
    }
}
}
                