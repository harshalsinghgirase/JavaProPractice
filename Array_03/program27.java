//WAP to find a Strong number from an array and return its index.
//        Take size and elements from the user
//        Input: 10 25 252 36 564 145
//        Output: Strong no 145 found at index: 5

import java.io.*;
class Program27
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter Elements ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Finding Strong number and returning the index");
        for (int i = 0; i < arr.length; i++)
        {
            if (checkStrong(arr[i]) == arr[i])
            {
                System.out.println("Strong Number " + arr[i] + " found at index : " + i);
            }
        }
    }
    static int checkStrong(int x)
    {
        int sum =0;
        while(x!=0)
        {
            int mul=1;
            int rem=x%10;
            for(int i=1 ; i<=rem ; i++)
            {
                mul = mul*i;
            }
            sum = sum + mul;
            x=x/10;
        }
        return sum;
    }

}