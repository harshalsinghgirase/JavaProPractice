//Write a program to print the second max element in the array
//        Input: Enter array elements: 2 255 2 1554 15 65
//        Output: 255

import java.io.*;
class Program29
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("Enter Elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max=arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            if(max<=arr[i])
                max=arr[i];
        }
        System.out.println(" 1st Max Element = "+max);
        int secondMax = arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            if(secondMax<=arr[i]&&arr[i]!=max)
                secondMax = arr[i];
        }

        System.out.println("2nd Max element = "+secondMax);
    }
}
