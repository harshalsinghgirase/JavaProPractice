//Print the count of even and odd elements in an int array

import java.io.*;
class Program5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number Of Elements You Want In The Array");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        int evenCount=0;
        int oddCount=0;

        System.out.println("Enter Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even Count = "+evenCount);
        System.out.println("Odd Count = "+oddCount);
    }
}