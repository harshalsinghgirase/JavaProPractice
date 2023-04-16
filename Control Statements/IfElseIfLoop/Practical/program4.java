//Write a java program that checks a number from 0 to 5 and prints its spelling, if the number is greater than 5 print the number is greater than 5
//Input1 : var= 4
//Output: four
//Input2 : var = 6
//Output: number is greater than 5
//Input3 : var = -6
//Output: ???

import java.util.*;

class program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>5)
            System.out.println("number is greater than 5");
        else if (num==0)
            System.out.println("Zero");
        else if (num==1)
            System.out.println("One");
        else if (num==2)
            System.out.println("Two");
        else if (num==3)
            System.out.println("Three");
        else if (num==4)
            System.out.println("Four");
        else if (num==5)
            System.out.println("Five");
        else if(num<0)
            System.out.println("number is less than zero");
    }
}