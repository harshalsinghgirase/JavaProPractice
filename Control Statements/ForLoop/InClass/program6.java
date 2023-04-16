//take N as input and print whether it is prime or not
//as per the old definition that i have learnt "prime number is a number that is divisible by the number itself and 1 "
//but the correct definition is that the number which has exactly 2 factors

import java.util.*;

class Program6
{
    public static void main(String ar[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
                count++;
        }

        if(count==2)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}