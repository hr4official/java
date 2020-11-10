import java.io.*;
class Perfect implements Runnable
{
    public void run()
    {
        int no;
        for(no=1;no<=1000;no++)
        {
            int sum=0;
            for(int i=1;i<=no/2;i++)
            {
                if(no%i==0)     
                    sum=sum+i;
            }
            if(no==sum)
                System.out.println(no+" Number is perfect");
        }
    }
}

class Prime implements Runnable
{
    public void run()
    {
        int no;
        for(no=2;no<=1000;no++)
        {
            int cnt=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0)
                System.out.println(no+" Number is prime");
        }
    }
}


class PerfectPrime
{
    public static void main(String args[])
    {
        try
        {
            Perfect p=new Perfect();
            Thread t1=new Thread(p);
            Prime p1=new Prime();
            Thread t2=new Thread(p1);
            t1.start();
            t2.start();
        }
        catch(Exception e1){}
    }
}