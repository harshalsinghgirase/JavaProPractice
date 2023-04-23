//Write a program, take 7 characters as an input , Print only vowels from the array
//        Input: a b c o d p e
//        Output : a o e
import java.io.*;
class Program9
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[]=new char[7];

        System.out.println("Enter char Elements one by one  ");
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i]= (br.readLine()).charAt(0);
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}