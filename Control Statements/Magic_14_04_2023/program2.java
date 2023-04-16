//        Q2
//        write a program to print the following pattern
//        # = = = =
//        = # = = =
//        = = # = =
//        = = = # =
//        = = = = #

import java.io.*;

class Program2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows : ");
        int row=Integer.parseInt(br.readLine());
        System.out.println();
        int temp = row;

        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i-1 ; j++)
            {
                System.out.print("= ");
            }
            System.out.print("# ");
            for(int k=1 ; k<=temp-1 ; k++)
            {
                System.out.print("= ");
            }
            temp--;
            System.out.println();
        }
    }
}