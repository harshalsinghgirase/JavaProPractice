//print the digits of the number 
import java.util.*;

class program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            System.out.println(n%10);
            n=n/10;
        }
    }
}