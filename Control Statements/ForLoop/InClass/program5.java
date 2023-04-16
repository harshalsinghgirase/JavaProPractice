//Take N as input , Count all it's factors and print it
//
//input = 6
//output = 4
//
//input = 24
//output = 8

import java.util.*;

class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count  = 0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("Count of the factors is equal to "+count);
    }
}