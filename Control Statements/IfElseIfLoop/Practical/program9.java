//Write a program in java to accept three numbers and check whether they are pythagorean triplet or not
//Example
//   a = 3 ---  b = 4 ---  c = 5
//   if
//   a*a + b*b = c*c
//   then it is a pythagorean triplet
//   else
//       not a pythagorean triplet
//input 1
// a=3 b=4 c=5
// output : it is a pythagorean triplet
//
//input 2
// a=1 b=6 c=9
// output : it is not a pythagorean triplet
//
//input 3
// a=2 b=2 c=2
// output : ????  it is not a pythagorean triplet

import java.util.*;

class program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers one by one ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a*a + b*b == c*c)
        {
            System.out.println("The Numbers "+a+","+b+","+c+","+" form a pythagorean triplet");
        }
        else if (b*b + c*c == a*a)
        {
            System.out.println("The Numbers "+a+","+b+","+c+","+" form a pythagorean triplet");
        }
        else if (c*c + a*a == b*b)
        {
            System.out.println("The Numbers "+a+","+b+","+c+","+" form a pythagorean triplet");
        }
        else
        {
            System.out.println("The Numbers "+a+","+b+","+c+","+" do not form a pythagorean triplet");
        }
    }
}