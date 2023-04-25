//WAP to find a Perfect number from an array and return its index.
//        Take size and elements from the user
//        Input: 10 25 252 496 564
//        Output: Perfect no 496 found at index: 3

import java.io.*;
class Program25
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size");
        int size = Integer.parseInt(br.readLine());
        int arr[]  =  new int[size];

        System.out.println("Enter Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Finding perfect number and returning the index");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(checkPerfect(arr[i])==arr[i])
            {
                System.out.println("Perfect Number "+arr[i]+" found at index : "+i);
            }
        }
    }
    static int checkPerfect(int x)
    {
        int sum=0;
        for(int i=1 ; i<x ; i++)
        {
            if(x%i==0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
}