//write a program to check day number(1-7) and print the corresponding day of week
//Input1--->1
//Output1-->Monday
//
//Input2--->6
//Output2-->Saturday
//
//Input3--->8
//Output3-->??? --->Invalid Day Number The Days Range From 1-7

import java.util.*;

class program8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day Number");
        int d = sc.nextInt();
        if(d<=0 || d>=8)
            System.out.println("Invalid Day Number Entered");
        else if(d==1)
            System.out.println("Monday");
        else if (d==2)
            System.out.println("Tuesday");
        else if (d==3)
            System.out.println("Wednesday");
        else if (d==4)
            System.out.println("Thursday");
        else if (d==5)
            System.out.println("Friday");
        else if (d==6)
            System.out.println("Saturday");
        else if (d == 7)
            System.out.println("Sunday");
        else
        {

        }
    }
}