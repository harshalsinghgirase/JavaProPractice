//write a java program in which according to month no print the no of days in that month
//
//input1--->month=7
//output1-->July has 31 days
//
//input2---->month = 13
//output2---->Invalid Month
//
//Input3---->month = -6
//output3--->?? Invalid Month

import java.util.*;

class program5{
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter The Month Number ");
        int month = sc.nextInt();
        if(month>12 || month<=0)
            System.out.println("invalid Month");
        else if(month==1)
            System.out.println("Jan has 31 days");
        else if(month==2)
            System.out.println("Feb has 28/29 Days");
        else if (month==3)
            System.out.println("March has 30 days ");
        else if (month == 4)
            System.out.println("April has 30 Days ");
        else if(month==5)
            System.out.println("may has 31 days ");
        else if(month==6)
            System.out.println("june has 30days ");
        else if (month==7)
            System.out.println("july has 31 days ");
        else if(month==8)
            System.out.println("aug has 31 days ");
        else if (month == 9)
            System.out.println("sept has 30 days ");
        else if(month==10)
            System.out.println("oct has 31 days ");
        else if (month==11)
            System.out.println("nov has 30 days ");
        else if (month == 12)
            System.out.println("dec has 31 days ");
        else {
            
        }
    }
}