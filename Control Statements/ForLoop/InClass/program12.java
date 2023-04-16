//Print Fibonacci Series till 1-50
//  0 1 1 2 3 5 8 13 21 34

import java.util.*;
class Program12
{
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        int sum=0;
        while(sum<=50)
        {
            System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
        }

    }
}