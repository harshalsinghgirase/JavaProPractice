//WAP to reverse each element in an array.
//        Take size and elements from the user
//        Input: 10 25 252 36 564
//        Output: 01 52 252 63 465
import java.io.*;
class Program22
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size");
        int size = Integer.parseInt(br.readLine());
        String arr[]    = new String[size];
        System.out.println("Enter elements of array");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=br.readLine();
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            revElement(arr[i]);
        }
    }

    static void revElement(String x)
    {
        for(int i=x.length()-1 ; i>=0 ; i--)
        {
            System.out.print(x.charAt(i));
        }
        System.out.print(" ");
    }
}