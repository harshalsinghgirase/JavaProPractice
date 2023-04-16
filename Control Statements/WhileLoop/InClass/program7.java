//multiplication of digits
import java.util.*;

class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul=1;
        int n = sc.nextInt();
        while(n!=0){
            mul = mul*(n%10);
            n=n/10;
        }
        System.out.println(mul);
    }
}