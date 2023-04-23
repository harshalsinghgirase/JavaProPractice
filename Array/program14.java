//WAP to search a specific element from an array and return its index.
//        Input: 1 2 4 5 6
//        Enter element to search: 4
//        Output: element found at index: 2

import java.io.*;
class Program14
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
        int size = Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("Enter Elements Of Array");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Enter The ELement to search ");
        int s =Integer.parseInt(br.readLine());
        System.out.println("The Element is at index no :"+searchElement(arr ,s));
    }
    static int searchElement(int arr[] ,int s)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==s)
            {
                return i;
            }
        }
        return -1;
    }
}