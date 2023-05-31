//Program 6: Write a program to print the sum of all even numbers and the
//        multiplication of odd numbers between 1 to 10.

class Program6{
    public static void main(String[] args) {
        int n=1;
        int oddMul=1;
        int evenSum=0;
        while(n<11){
            if(n%2==0){
                evenSum = evenSum +  n;
            }
            else {
                oddMul = oddMul *c n;
            }
            n++;
        }
        System.out.println("sum of all even numbers between 1 to 10 = "+evenSum);
        System.out.println("multiplication of odd numbers between 1 to 10 = "+oddMul);
    }
}