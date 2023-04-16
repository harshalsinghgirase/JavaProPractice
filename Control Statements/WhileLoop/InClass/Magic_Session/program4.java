//Write a program to count  the odd digits
//i/p = 942111243
//o/p = Count of odd digits = 5

import java.util.*;

class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            if(!((n%10)%2==0))
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("Count of odd digits = "+count);
    }
}