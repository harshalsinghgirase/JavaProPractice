//Enter player name , Jersey no , and enter average score

import  java.io.*;
class Program2
{
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Players Name ");
        String pname = br.readLine();

        System.out.println("Enter jersey number ");
        int jno = br.readLine();

        System.out.println("Enter average score ");
        float avg = br.readLine();
    }
}