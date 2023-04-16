//Write a java program, take a number, and print whether it is less than 10 or greater than 10.
//        Input1: var=5
//        Output: 5 Is Less than 10.
//        Input2: var=16
//        Output: 16 Is greater than 10.
//        Input3 : var=10
//        Output:??

import java.util.*;

class program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<10)
            System.out.println(num+" is less than 10");
        else if(num>10)
            System.out.println(num+" is greater than 10");
        else if(num==10)
            System.out.println(num+" is equal to 10");
    }
}