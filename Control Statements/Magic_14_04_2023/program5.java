//        Q5
//        write a program to print the following pattern
//        Row =4
//        0
//        1 1
//        2 3 5
//        8 13 21 34

//        USE THIS FOR LOOP STRICTLY for the outer loop
//        Int row;
//        Take the number of rows from user
//        for(int i =1;i<=row;i++){
//        }

import java.io.*;
class Program5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number Of Rows ");
        int row = Integer.parseInt(br.readLine());
        int a=0;
        int b=1;
        int sum =0;
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(sum+" ");
                a=b;
                b=sum;
                sum=a+b;
            }
            System.out.println();
        }
    }
}