import java.io.*;
public class sentence
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        System.out.println("ENTER THE SENTENCE ::");
        String input = br.readLine();
        input = " "+input;
        input = input.toLowerCase();
        String output = "";
        int length = input.length();
        for(int i = 1; i<length ; i++)
        {
            if(input.charAt(i-1) == ' ')
            {
                output = output + Character.toUpperCase(input.charAt(i));
            }
            else
            {
                output = output + input.charAt(i);
            }
        }
        System.out.println("THE NEW SENTENCE IS ::");
        System.out.println(output);
    }
}
