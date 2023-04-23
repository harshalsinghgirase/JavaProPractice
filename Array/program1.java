//Accessing Elements From An Array

import  java.io.*;

class Program1
{
    public static void main(String[] args)  throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Taking Elements From the array ");
        int arr[] = new int[5];
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println("Enter Element "+(i+1)+" = ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Printing Array ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println("Element "+(i+1) +"= "+arr[i]);
        }
    }
}