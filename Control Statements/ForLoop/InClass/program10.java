//Write a number to check for automorphic number

// i/p=5
// o/p = 5 is automorphic

// i/p=25
// o/p=625

import java.util.*;

class Program10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sq=n*n;
        int rem1;
        int rem2;
        int sum1=0;
        int sum2=0;
        int temp1=n;
        while(n!=0)
        {
            count++;
            n=n/10;
        }

        for(int i=0 ; i<count ; i++)
        {
            rem1 = sq%10;
            sum1 = (sum1*10) + rem1;
            sq=sq/10;
        }

        while(sum1!=0)
        {
            rem2 = sum1%10;
            sum2 = (sum2*10) + rem2;
            sum1=sum1/10;
        }

        if(sum2==temp1)
            System.out.println(temp1+" is a automorphic number");
        else
            System.out.println(temp1+" is not a automorphic number");
    }
}