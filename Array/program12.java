//WAP to find the number of even and odd integers in a given array of integers
//        Input: 1 2 5 4 6 7 8
//        Output:
//        Number of Even Elements: 4
//        Number of Odd Elements : 3
import java.io.*;
class Program12
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size Of Array");
        int size = Integer.parseInt(br.readLine());
        int arr[]=new int[size];

        System.out.println("Enter Array Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        int evenCount=0;
        int oddCount=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Number of Even Elements: "+evenCount);
        System.out.println("Number of Odd Elements: "+oddCount);

    }

}