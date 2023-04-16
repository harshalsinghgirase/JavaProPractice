//Given an Integer input  print whether it is odd or even


import java.util.*;

class program6
{
    public static  void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%2==0)
        {
            System.out.println(no +"is even");
        }
        else
        {
            System.out.println(no +"is odd");
        }
    }
}