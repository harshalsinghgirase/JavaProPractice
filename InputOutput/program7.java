//Take input 1-Society Name
//2-Wing (a , b ,c ,d)
//3-flat no

import java.io.*;
class Program7
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Society Name : ");
        String sname = br.readLine();

        System.out.println("Enter Wing : ");
        char  w = (br.readLine()).charAt(0);
        //br.readLine bcz if we take br.read it will return int
        //if we use br.read the error is
        //     ---int cannot be dereferenced
        //     ---String w = (br.read()).charAt(0);
        System.out.println("Enter The Flat No : ");
        int fno = Integer.parseInt(br.readLine());
    }
}