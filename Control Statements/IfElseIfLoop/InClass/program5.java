//Take an integer input and print whther it is divisible by 4 or not

//Input : 5
//Output : Not Divisible
import java.util.*;

class program5
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%4==0)
        {
            System.out.println("Divisible ");
        }
        else
        {
            System.out.println("Not Divisible ");
        }
    }
}