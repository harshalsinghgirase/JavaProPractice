//Writer a program to calculate the total digits of a program
// i/p = 942111243
//o/p = Count of digits = 9

import java.util.*;

class Program3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;

        }
        System.out.println("Count Of Digits ="+count);
    }
}