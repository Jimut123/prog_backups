public class output1
{
    public static void main(int a,int b,int c)
    {
        a=10;
        b=4;
        c=5;
        System.out.println(+a++ +b+c++);
        System.out.println(++a+ --b+c);
        System.out.println(+a+b+ --c);
        System.out.println(--a+b+c);
    }
}