//Take N as input print all its factors
//
//input = 6
//output  = 1  2  3  6
//
//input = 24
//output = 1  2  3  4  6  8  12  24

import java.util.*;

class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}