import java.io.*;
public class vowl
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        double p = 10000.0;double r = 10.0; 
        double mx = (p*Math.pow((1.1),3));
        System.out.println(mx);
    }
}
