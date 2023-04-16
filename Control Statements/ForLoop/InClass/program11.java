//Write a program to check for a strong number

// a strong number is that whose sum of digit's factorial is equal to that number

import java.util.*;
class Program11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dgt;
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            dgt=n%10;
            int fact=1;
            for(int i=1;i<=dgt;i++)
            {
                fact=fact*i ;
            }
            sum=sum+fact;
            n=n/10;
        }

        if(sum==temp)
            System.out.println(temp+" is a strong number");
        else
            System.out.println(temp+" is not a strong number");
    }
}