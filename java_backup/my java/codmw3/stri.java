import java.util.*;
public class stri
{
    String s;
    stri(String a)
    {
        s=a;
    }
    stri add(stri m,stri n)
    {
        String q,w,g;
        int a,b;
        m.s+=" ";
        n.s+=" ";
        w=" ";
        q="";
        g="";
        for(a=0;a<m.s.length();a++)
        {
            if(m.s.charAt(a)==' ')
            {
            for(b=q.length()-1;b>=0;b--)
               {
                    g+=q.charAt(b);
               }
            if(g.equals(q))
            {
                w=q+w;
            }
            q="";
            g="";
        }
        else
        {
            q=q+m.s.charAt(a);
        }
        } 
         for(a=0;a<n.s.length();a++)
        {
            if(n.s.charAt(a)==' ')
            {
            for(b=q.length()-1;b>=0;b--)
               {
                   g+=q.charAt(b);
               }
            if(g.equals(q))
            {
                w=q+w;
            }
            q="";
            g="";
        }
        else
        {
            q=q+n.s.charAt(a);
        }
        m.s=w;
       }
        return m;
    }
   public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter Sentence");
        s1=sc.nextLine();
        System.out.println("Enter sentence");
        s2=sc.nextLine();
        stri ob=new stri(s1);
        stri ob2=new stri(s2);
        stri ob3=new stri("");
        ob3=ob3.add(ob,ob2);
        System.out.println(ob3.s);
        
    }
}