//WAP to find an ArmStong number from an array and return its index.
//        Take size and elements from the user
//        Input: 10 25 252 36 153 55 89
//        Output: Armstrong no 153 found at index: 4

import java.io.*;
class Program28
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
        int size = Integer.parseInt(br.readLine());
        int arr[]= new int[size];
        System.out.println("Enter Elements ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("checking for armstrong elements in the array");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(checkArmstrong(arr[i])==arr[i])
            {
                System.out.println("Armstrong Number "+arr[i]+" found at index : "+i);
            }
        }

    }
    static int checkArmstrong(int x)
    {
        int count = 0;
        int t1=x;
        while(x!=0)
        {
            x=x/10;
            count++;
        }
        int sum=0;
        while(t1!=0)
        {
            int mul=1;
            for(int i=1 ; i<=count ; i++)
            {
                mul = mul*(t1%10);
            }
            sum = sum +mul;
            t1=t1/10;
        }
        return sum;
    }
}