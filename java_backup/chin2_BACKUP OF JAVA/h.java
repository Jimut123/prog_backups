
/**
 * Write a description of class h here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class h
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE STRING ::");
        String input = br.readLine();
        int lenth = input.length();
        System.out.println();
        System.out.println();
        for(int i = 0; i <= lenth ; i++)
        {
            System.out.println(input.substring(i,lenth));
        }
    }
}
