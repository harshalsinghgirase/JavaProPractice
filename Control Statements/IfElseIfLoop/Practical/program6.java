//Write a program to find a maximum between three numbers
//
//input 1
//a = 1
//b = 2
//c = 3
//Output : 3 is max btw 1 , 2 , 3
//
//input 2
//a = 1
//b = 4
//c = 3
//Output : 4 is the max btw 1 , 4 , 3
//
//input 3
//a = 42
//b = 32
//c = 42
//Output : ??  a and c are equal

import java.util.*;

class program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
            System.out.println(a+" is max btw "+a+"  "+b+"  "+c+"  ");
        else if(b>a && b>c)
            System.out.println(b+" is max btw "+a+"  "+b+"  "+c+"  ");
        else if(c>a && c>b)
            System.out.println(c+" is max btw "+a+"  "+b+"  "+c+"  ");
        else if(a==b && b==c & c==a)
            System.out.println("All Numbers Are Equal");
        else if(a==b)
            System.out.println("a and b are equal");
        else if(b==c)
            System.out.println("b and c are equal ");
        else if (c==a)
            System.out.println(" c and a are equal ");
    }
}