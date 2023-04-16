//Given an integer valus as input
//----print fizz if divisible by 3
//----print buzz if divisible by 5
//----print fizz-buzz if divisible by both
//----if not then print "Not divisible by both"
import java.util.*;

class program7
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%3==0 && no%5==0)
        {
            System.out.println("fizz-buzz");
        }
        else if(no%3==0)
        {
            System.out.println("fizz");
        }
        else if(no%5==0)
        {
            System.out.println("buzz");
        }
        else
        {
            System.out.println("Not divisible by both ");
        }
    }
}