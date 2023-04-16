//check whether given number is palindrome or not
import java.util.*;
class Program10{
    public static void main(String[] args) {
        int n = 2332;
        int temp = n;
        int rem ;
        int sum = 0;
        while(n!=0){
            rem = (n%10);
            sum = sum*10 + rem;
            n = n/10;
        }
        if(sum==temp){
            System.out.println("palindrome");
        }
    }
}