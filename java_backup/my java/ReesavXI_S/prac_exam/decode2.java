package prac_exam;
import java.io.*;
class decode2
{
    String s="";
    void accpet()throws IOException
    {
        DataInputsStream in=new DataInputStream(System.in);
        System.out.print("Enter ASCII CODE ");
        S=in.readLine();
    }
    void calc()
    {
        String z="";
        for(int i=0;i<s.length();i++)
        {
            z=z+s.charAt(i);
            if(Integer.parseInt(z)>=65||Integer.parseInt(z)<=90)
            {
            System.out.print(char(Integer.parseInt(z)));
        }
            else if(Integer.parseInt(z)>=97||Integer.parseInt(z)<=122)
            {
            System.out.print(char(Integer.parseInt(z)));
        }
            else if(Integer.parseInt(z)==32)
            System.out.print(" ");
            else continue;
        }
    }
}