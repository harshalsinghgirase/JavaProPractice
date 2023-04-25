//WAP to find a composite number from an array and return its index.
//        Take size and elements from the user
//        Input: 1 2 3 5 6 7
//        Output: composite 6 found at index: 4

import java.io.*;
class Program23
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

        System.out.println("Finding composite number and returning the index");
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(countCheck(arr[i])>2)
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
        }
        return count;
    }
}