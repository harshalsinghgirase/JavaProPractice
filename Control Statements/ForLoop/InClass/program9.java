//Write a program to chewck for composite numbers and print message accordingly
//A number is said to be composite if it has more than 2 factors

import java.util.*;

class Program9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
                count++;
        }

        if(count>2)
            System.out.println(n+" is a composite number ");
        else
            System.out.println(n+" is not a composite number");
    }
}