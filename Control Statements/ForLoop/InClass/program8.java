//Take n as input and print whether n is a armstrong number
//
//input = 23
//output = Not an armstrong number
//bcz 2^2 + 3^2 != 23
//
//input = 153
//output = Armstrong Number
//bcz 1^3 + 5^3 + 3^3

import java.util.*;
class Program8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp1=n;
        int temp2=n;
        int sum=0;
        int rem;

        // 1 Stage Calculating The Digits
        while(n!=0)
        {
            count++;
            n=n/10;
        }

        //2 Stage Calcultation Part
        while(temp1!=0)
        {
            int mul=1;
            rem = temp1%10;
            for(int i=0;i<count;i++)
            {
                mul=mul*rem;
            }
            sum=sum+mul;
            temp1=temp1/10;
        }
        if(sum==temp2)
        {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a armstrong number");
        }

    }
}


