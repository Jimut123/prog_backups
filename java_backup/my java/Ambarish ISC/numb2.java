import java.util.*;
class numb2
{
int num;
numb2(int n)
{
num=n;
}
void cal()
{
    int a=0,s=0;
    while(num>0)
    {
        a=num%10;
        s=(s*10)+a;
        num=num/10;
    }
    while(s>0)
    {
        a=s%10;
        if(a==1)
        {
        System.out.println("         *           ");   
        System.out.println("        **           ");
        System.out.println("       * *           ");
        System.out.println("      *  *           ");
        System.out.println("         *           ");
        System.out.println("         *           ");
        System.out.println("         *           ");
        System.out.println("   *************     ");
    }
    else if(a==2)
    {
        System.out.println("  ************       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("  ************       ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  ************       ");
    }
    else if(a==3)
    {
        System.out.println("  ************       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("  ************       ");
        System.out.println("  ************       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("  ************       ");
    }
    else if(a==4)
    {
       System.out.println("  *                  ");
       System.out.println("  *                  ");
       System.out.println("  *        *         ");
       System.out.println("  *        *         "); 
       System.out.println("  ************       ");
       System.out.println("           *         ");
       System.out.println("           *         ");
       System.out.println("           *         ");
    }
    else if(a==5)
    {
        System.out.println("  ************       ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  ************       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("  ************       ");
    }
    else if(a==6)
    {
       System.out.println("   ***********       ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  *                  ");
        System.out.println("  ************       ");
        System.out.println("  *          *       ");
        System.out.println("  *          *       ");
        System.out.println("  ************       ");
    } 
    else if(a==7)
    {
        System.out.println("  ************       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("      ***********    ");
        System.out.println("             *       ");
        System.out.println("             *       ");
        System.out.println("             *       ");
    }
    else if(a==8)
    {
        System.out.println("  ************       ");
        System.out.println("  *          *       ");
        System.out.println("  *          *       ");
        System.out.println("  ************       ");
        System.out.println("  ************       ");
        System.out.println("  *          *       ");
        System.out.println("  *          *       ");
        System.out.println("  ************       ");
    }
    else if(a==9)
    {
       System.out.println("  ************       ");
       System.out.println("  *          *       ");
       System.out.println("  *          *       ");
       System.out.println("  ************       ");
       System.out.println("             *       ");
       System.out.println("             *       ");
       System.out.println("             *       ");
       System.out.println("  ************       ");
    } 
     else
     {
      System.out.println("  ************       ");
      System.out.println("  *          *       ");
      System.out.println("  *          *       ");
      System.out.println("  *          *       ");
      System.out.println("  *          *       ");
      System.out.println("  *          *       ");
      System.out.println("  *          *       ");
      System.out.println("  ************       ");
    } 
    s=s/10;
}
}
}  
       