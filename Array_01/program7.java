//WAP to take size of array from user and also take integer elements from user Print
//        product of even elements only
//        input : Enter size : 9
//        Enter array elements : 1 2 3 2 5 10 55 77 99
//        output : 40
//// 2 * 2 * 10
import java.io.*;
class Program7
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
        int size = Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("Enter Elements one by one  ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]= Integer.parseInt(br.readLine());
        }
        int mulEven = 1;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2==0)
                mulEven=mulEven*arr[i];
        }
        System.out.println("Multiplication Of Even Elements= " +mulEven);
    }
}