//Write a java program to check if a number is even or odd.
//        Input: var=10;
//        Output: 10 is an even no
//
//        Input: var=37;
//        Output: 37 is an odd no
//
//        Input : var=0
//        Output:???

import java.util.*;

class program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(num+"  is even no");
        else
            System.out.println(num+"  is odd no");
    }
}