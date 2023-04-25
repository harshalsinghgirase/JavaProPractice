//WAP to take size of array from user and also take integer elements from user
//        find the minimum element from the array
//        input : Enter size : 5
//        Enter array elements: 1 2 5 0 4
//        output: min element = 0
import java.io.*;
class Program15
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array");
        int size = Integer.parseInt(br.readLine());

        int arr[]=new int[size];
        System.out.println("Enter ELements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int s=arr[1];

        System.out.println("Searching For Minimum Element ");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(s>arr[i])
            {
                s=arr[i];
            }
        }
        System.out.println("Minimum Value = "+s);


    }
}