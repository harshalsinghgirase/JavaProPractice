//        Q6
//        Write a program, and take two characters if these characters are equal then print them as it is but if
//        they are unequal then print their difference.
//        {Note: Consider Positional Difference Not ASCIIs}
//
//        Input: a p
//        Output: The difference between a and p is 15

import java.io.*;
class Program6
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st character :");
        char c1 = (br.readLine()).charAt(0);
        System.out.println("Enter 2nd character : ");
        char c2 = (br.readLine()).charAt(0);
        if (c1 == c2)
        {
            System.out.println(c1 + " and " + c2 + " are equal");
        }
        else
        {
            System.out.println("The difference between " + c1 + " and " + c2 + " is " + (c2 - c1));
        }
    }
}