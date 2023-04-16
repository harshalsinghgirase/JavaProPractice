//Take N as input print its factorial
//
//input = 5
//output = factorial of 5 is 120

import java.util.*;

class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int mul = 1;
        for(int i = 1;i<=n ; i++){
            mul=mul*i;

        }
        System.out.println("factorial of "+n+" ="+mul);
    }
}