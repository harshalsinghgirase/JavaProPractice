//WAP to print the elements whose addition of digits is even.
//        Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
//        Input :
//        Enter array : 1 2 3 5 15 16 14 28 17 29 123
//        Output: 2 15 28 17 123
import java.io.*;
class Program20
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter size ");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("Enter Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            if(sumDigits(arr[i])%2==0)
            {
                System.out.print(arr[i]+"  ");
            }
        }

    }
    static int sumDigits(int x)
    {
        int sum = 0;
        while(x!=0)
        {
            sum = sum + (x%10);
            x=x/10;
        }
        return sum;
    }
}