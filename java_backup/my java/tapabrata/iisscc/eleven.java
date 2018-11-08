package iisscc;
import java.io.*;
public class eleven extends stack
{int arr[];
    int front,rear;
    int arr2[];
    public  eleven(int l)
    {int len;
        len=l;
        arr=int eleven[l];
        arr2=int eleven[l];
        front=rear=-1;
        top=-1;
    }
    public void insert(eleven b)
    {
        if(front==-1)
        {    front=rear=0;    
            arr2[rear]=new Book(b);
        }
        else if(rear==len-1)
            System.out.println("queue overflow");
        else
            arr2[++rear]=new Book(b);
    }
    public void delete()
    {
        if(rear==-1)
            System.out.println("queue underflow");
        else if(front==rear)
                 front=rear=-1;
        else
            ++front;           
    }
    public void display2()
    {
        if(front==-1)
            System.out.println("queue is empty");
        else
            for(int i=front;i<=rear;i++)
                arr2[i].display();
    }
    public  void main(int n)throws IOException
    {
            eleven ob=new eleven(n);
            int ans=1;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(ans==1)
            {
                System.out.println("1. push");
                System.out.println("2. pop");
                System.out.println("3. display from stack");
                System.out.println("4. delete from queue");
                System.out.println("5. display from queue");
                System.out.print("enter your choice :");
                int ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1: if(ob.top==ob.len-1)
                                System.out.println("stack over flow");
                            else
                            {
                                System.out.print("enter book id :");
                                String s=br.readLine();
                                System.out.print("price:");
                                double n2=Double.parseDouble(br.readLine());
                                ob.push(s,n2);
                            }
                            break;
                    case 2: if(ob.top==-1)
                               System.out.println("stack is empty");
                            else
                                ob.insert(ob.pop());
                            break;
                    case 3: ob.display1();
                            break;
                    case 4: ob.delete();
                            break;
                    case 5: ob.display2();
                            break;
                    default:System.out.println("wrong input");
                            break;
                }
                System.out.println("more(1/0)");
                ans=Integer.parseInt(br.readLine());
            }
    }   
}