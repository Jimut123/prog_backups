import java.util.*;
public class pattern2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int d,b,c;
        
        System.out.println("Enter name");
        a=sc.nextLine();
        System.out.println(a);
        d=a.length()-2;
        for(b=0;b<a.length()-2;b=b+1)
        {
            System.out.print(a.charAt(b+1));
            for(c=0;c<a.length()-2;c=c+1)
            {
                System.out.print(" ");
            }
            System.out.println(a.charAt(d));
            d=d-1;
        }
        for(b=a.length()-1;b>=0;b=b-1)
        {
            System.out.print(a.charAt(b));
        }
    }
}
        
        