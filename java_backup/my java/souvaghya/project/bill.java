package project;

import java.io.*;
class bill
{   
    public  void main()throws IOException
    {
        
    int p;
    double c;
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Unit:");
        p=Integer.parseInt(br.readLine());
        System.out.println("No.of calls:"+p);
        c=0;
        if(p<=75)
        c=0;
        else
        if(p<=150)
        c=(p-75)*0.50;
        else
        if(p<=225)
        c=75*.50+(p-150)*1.00;
        else
        if(p<=300)
        c=75*.50+75*1*(p-225)*2.50;
        else
        if(p>300)
        c=75*.50+75*1+75*2.50+(p-300)*3.00;
        System.out.println("Charge:"+c);
    }
}
        