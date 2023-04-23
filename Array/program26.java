//WAP to find a palindrome number from an array and return its index.
//        Take size and elements from the user
//        Input: 10 25 252 36 564
//
//        Output: Palindrome no 252 found at index: 2
import java.io.*;
class Program26
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

        System.out.println("Finding palindrome number and returning the index");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(checkPalindrome(arr[i])==arr[i])
            {
                System.out.println("Palindrome Number "+arr[i]+" found at index : "+i);
            }
        }
    }
    static int checkPalindrome(int x)
    {
        int sum=0;
        for(int i=1 ; i<x ; i++)
        while(x!=0)
        {
            sum = (sum*10) + (x%10);
            x=x/10;
        }
        return sum;
    }
}