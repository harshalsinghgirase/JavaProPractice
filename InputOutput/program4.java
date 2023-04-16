//Take a real life example
//Take related string , char , int , float as an input
//Take input in one line
//Convert token to respective datatype

import java.util.*;
import java.io.*;

class Program4
{
    public static void main(String[] args) throws IOException , NoSuchElementException
            
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter employee name category(A B C) DeptId Salary : ");
        String s1 = br.readLine();

        StringTokenizer st = new StringTokenizer(s1," ");
        String t1 = st.nextToken();
        char t2 = (st.nextToken().charAt(0));
        int t3 = Integer.parseInt(st.nextToken());
        float t4 = Float.parseFloat(st.nextToken());

        System.out.println("Employee Name : "+t1);
        System.out.println("Category : "+t2);
        System.out.println("Department ID : "+t3);
        System.out.println("Salary : "+t4);
    }
}