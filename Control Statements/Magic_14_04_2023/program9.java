//        Q9
//        Write a program to take a number as input and print the Addition of Factorials of each
//        digit from that number.
//        Input: 1234
//        Output: Addition of factorials of each digit from 1234 = 33

import  java.io.*;
class Program9
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number ");
        int x = Integer.parseInt(br.readLine());
        int temp = x;
        int sum = 0;
        while(x!=0)
        {
            int rem = x%10;
            x=x/10;
            int mul=1;
            for(int i=1 ; i<=rem ; i++)
            {
                mul = mul*i;
            }
            sum = sum + mul;
        }
        System.out.println("Addition of factorials of each digit from  "+temp+" ="+sum);

    }
}