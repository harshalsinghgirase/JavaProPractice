//WAP to find a prime number from an array and return its index.
//        Take size and elements from the user
//        Input: 10 25 36 566 34 53 50 100
//        Output: prime no 53 found at index: 5

import java.io.*;
class Program24
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

        System.out.println("Finding prime number and returning the index");
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(countCheck(arr[i])==2)
            {
                System.out.println("Composite Number "+arr[i]+" found at index : "+i);
            }
        }
        
    }
    static int countCheck(int x)
    {
        int count=0;
        for(int i=1 ; i<=x ; i++)
        {
            if(x%i==0)
                count++;
            if(count>2)
                break;
        }
        return count;
    }
}