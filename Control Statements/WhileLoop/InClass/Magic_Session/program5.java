//print squares of even numbers
//i/p = 942111243
//o/p = 4  16  4  16

import java.util.*;

class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0)
        {
            if((n%10)%2==0)
            {
                System.out.println((n%10)*(n%10)+"  ");
            }
            n = n/10; 
        }
    }
}