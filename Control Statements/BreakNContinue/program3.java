//Optimized code with less repetetions using break loop method

import java.util.*;
class Program3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            {
                count++;
            }
            if(count>2)
                break;
        }
        if(count>2)
            System.out.println("Not A Prime Number");
        else if(count==2)
            System.out.println("Prime Number");
    }
}