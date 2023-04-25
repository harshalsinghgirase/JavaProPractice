//WAP to take size of array from user and also take integer elements from user Print sum
//        of odd elements only
//        input : Enter size : 5
//        Enter array elements : 1 2 3 4 5
//        output : 9
////1 + 3 + 5

import java.io.*;
class Program6
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
        int oddSum = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2!=0)
            {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("Sum Of Odd Elements ="+oddSum);
    }
}