import java.io.*;
class duck
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int s,a,f;
        f=0;
        a=Integer.parseInt(br.readLine());
        while(a>0)
        {
            s=a%10;
            if(s==0)
            {
                f=1;
                break;
            }
            a=a/10;
        }
        if(f==1)
        System.out.println("Duck no");
        else
        System.out.println("Non-Duck no");