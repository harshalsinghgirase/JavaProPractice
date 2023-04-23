//Take 5 elements from user print their addition

//Solution 1
 import java.io.*;
class Program2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        System.out.println("Enter Elements Of Array One By One");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0 ;

        for(int i=0 ; i<arr.length ; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Sum Of Elements Of Array = "+sum);
    }
}