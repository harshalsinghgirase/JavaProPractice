//        Q8
//        write a program to print the following pattern
//        Row =8
//
//        $
//        @ @
//        & & &
//        # # # #
//        $ $ $ $ $
//        @ @ @ @ @ @
//        & & & & & & &
//        # # # # # # # #

import java.io.*;

class Program8
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows ");
        int row = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------");

        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                if(i%4==1)
                {
                    System.out.print("$ ");
                }
                else if(i%4==2)
                {
                    System.out.print("@ ");
                }
                else if(i%4==3)
                {
                    System.out.print("& ");
                }
                else if(i%4==0)
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}