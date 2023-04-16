//Enter The Society Name , Wing , RoomNo
//Take input in one line
//and print the society name then wing then roomno

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the society name , wing then room no");
        String Fname = br.readLine();

        StringTokenizer st = new StringTokenizer(Fname," ");

        String t1 = st.nextToken();
        String t2 = st.nextToken();
        String t3 = st.nextToken();

        System.out.println("Society Name : "+t1);
        System.out.println("Wing : "+t2);
        System.out.println("RoomNo : "+t3);
        
    }
}