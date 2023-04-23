//Count all even elements in an array

import java.io.*;
class Program4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number Of Elements You Want In The Array");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter Elements Of Array One By One ");
        int arr[]=new int[size];

        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Total Even Elements In Array = "+count);
        
    }
}