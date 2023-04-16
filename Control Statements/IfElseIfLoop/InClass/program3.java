//take two integerrs as input and print the max of two
//
//input 1
// x = 5   y = 7
//
//imput 2
//x=8   y = 8
//----------------------------------------------------------------------------------------------------------------------
import java.util.*;
class program3
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        if(no1==no2)
        {
            System.out.println("both the numbers are equal ");
        }
        else
        {
            System.out.print((no1>no2)?no1:no2);
            System.out.println(" is greater ");
        }
    }
}