//write a program which takes the number from user if no is even print that no in reverse order
//input = 6
//output = 654321
//input = 7
//output = 7 5 3 1
import java.util.*;
class Program7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            if (n%2==0)
            {
                while(n!=0)
                {
                    System.out.print(n+" ");
                    n--;
                }


            }
            else {
                while (n>0)
                {
                    System.out.print(n+" ");
                    n=n-2;
                }
            }

        
    }
}