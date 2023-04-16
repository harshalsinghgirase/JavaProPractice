// Take the name of batsmen and bowler and print
//Use only bufferrred reader and input streamreader only

import java.io.*;

class Program1
{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Bowler's Name : ");
        String bl = br.readLine();

        System.out.println("Enter Batsmen's Name : ");
        String bt = br.readLine();

        System.out.println("batsmen = "+bt);
        System.out.println("bowler = "+ bl);
    }
}
