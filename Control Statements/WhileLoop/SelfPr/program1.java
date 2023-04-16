//Write a program to keep asking for a number until you enter a negative number. At the end, print the sum of all
// entered numbers.

import java.util.*;

class program1
{
    public static void main(String ar[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i>=0)
        {
            sum = sum + i;
            i=sc.nextInt();

        }

        System.out.println(sum);
    }
}



