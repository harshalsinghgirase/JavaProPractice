//Write a java program, take a number, and print whether it is positive or negative.
//        Input: num = 5
//        Output: 5 is a positive number
//
//        Input: num = -9
//        Output: -9 is a negative number
//
//        Input: num = 0
//        Output:??????? The Number Is Zero(neither positive nor negative)

import java.util.*;

class program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0)
            System.out.println("zero is neither positive nor newgative");
        else if(num>0)
            System.out.println(num+" is a positive number ");
        else if(num<0)
            System.out.println(num+" is negative number ");
    }
}