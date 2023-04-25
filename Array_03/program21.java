//Write a program to print count of digits in elements of array.
//        Input: Enter array elements : 02 255 2 1554
//        Output: 2 3 1 4

import java.io.*;
class Program21
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array ");
        int size = Integer.parseInt(br.readLine());
        String arr[] = new String[size];

        System.out.println("enter elements");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=br.readLine();
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(sumDigit(arr[i])+" ");
        }
    }

    static int sumDigit(String x)
    {
        int count = x.length();
        return count;
    }
}