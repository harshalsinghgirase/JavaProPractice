//Write a program to print the second max element in the array
//        Input: Enter array elements: 2 255 2 1554 15 65
//        Output: 255

import java.io.*;
import java.util.*;
class Program29
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("Enter Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println("2nd Min Element ="+arr[arr.length-2 ]);
    }
}
