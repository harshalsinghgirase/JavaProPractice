//Program 7: Write a program that takes a number, if the number is even print that
//        number in reverse order, or if the number is odd print that number in reverse
//        order by difference two.

class Program7{
    public static void main(String[] args) {
        int n = 6;
        if(n%2==0){
            while(n>=1)
                System.out.println(n-- +" ");
        }
        else {
            while(n>=1) {
                System.out.print(n + " ");
                n = n-2;
            }
        }
    }
}