//Enter match_info || man_of_the_match || no_of_runs_scored
//Take input in one line and print them line by line

import java.io.*;
import java.util.*;

class Program5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter MatchInfo ,  Man_Of_The_Match , No_Of_Runs");
        String s1 = br.readLine();

        StringTokenizer st = new StringTokenizer(s1," ");
        String t1 = st.nextToken();
        String t2 = st.nextToken();
        String t3 = st.nextToken();

        System.out.println("Enter MatchInfo : "+t1);
        System.out.println("Man Of The Match : "+t2);
        System.out.println("No Of Runs : "+t3);
        
    }
}