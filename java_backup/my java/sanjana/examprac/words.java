package examprac;

import java.io.*;
class words
{
    public static void main()throws IOException
    {
        String S,w;
        int i,c;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a String");
        S=br.readLine();
        w="";
        c=0;
        for (i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
                System.out.println ("First word:" +w);
               c=i+1;
               break;
            }
            else
            w=w+S.charAt(i);
        }
        for (i=c;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
                w="";
            }
            else
            w=w+S.charAt(i);
        }
        System.out.println ("Last word:" +w);
    }
}