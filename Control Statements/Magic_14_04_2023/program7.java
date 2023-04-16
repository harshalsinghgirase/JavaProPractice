//        Q7
//        write a program to print the following pattern
//
//        Row =5;
//        O
//        14 13
//        L K J
//        9 8 7 6
//        E D C B A
//
//        Row = 4
//        10
//        I H
//        7 6 5
//        D C B A

import java.io.*;
class Program7
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows ");
        int row = Integer.parseInt(br.readLine());
        int no = (row*(row+1))/2;
        int temp=no;
        int ch1=64+no;
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                if(row%2==0)
                {
                    if(i%2!=0)
                    {
                        System.out.print(temp+" ");
                    }
                    else
                    {
                        System.out.print((char)ch1+" ");
                    }
                    temp--;
                    ch1--;
                }
                else
                {
                    if(i%2==0)
                    {
                        System.out.print(temp+" ");
                    }
                    else
                    {
                        System.out.print((char)ch1+" ");
                    }
                    temp--;
                    ch1--;
                }
            }
            System.out.println();
        }
    }
}