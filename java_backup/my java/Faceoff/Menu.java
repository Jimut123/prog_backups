import java.io.*;
class Menu
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader(isr);
        int a;
        a=Integer.parseInt(br.readLine());
        if (a<0)
        {
        System.out.println("Negative no");
    }
    else
    {
        System.out.println("Positive no");
    }
}
}
