//        Q1
//        write a program to print the following pattern
//        D4 C3 B2 A1
//        A1 B2 C3 D4
//        D4 C3 B2 A1
//        A1 B2 C3 D4

import java.io.*;

class Program1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Rows ");
        int row = Integer.parseInt(br.readLine());
        System.out.println();

        for(int i=1 ; i<=row ; i++)
        {
            int n=row;
            for(int j=1 ; j<=row ; j++)
            {
                if(i%2!=0)
                {
                    int ch1=64+n;
                    System.out.print((char)ch1);
                    System.out.print(n+" ");
                    n--;
                }
                else
                {
                    int ch2=64+j;
                    System.out.print((char)ch2);
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}