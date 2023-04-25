//Write a Java program to find the sum of even and odd numbers in an array.
//        Display the sum value.
//        Input: 11 12 13 14 15
//        Output
//        Odd numbers sum = 39
//        Even numbers sum = 26

import java.io.*;
class Program13
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

        int evenSum=0;
        int oddSum=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
                evenSum=evenSum+arr[i];
            else
                oddSum = oddSum+arr[i];
        }
        System.out.println("Even Elements Sum: "+evenSum);
        System.out.println("Odd Elements Sum: "+oddSum);

    }
}