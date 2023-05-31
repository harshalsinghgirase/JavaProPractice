//Program 9: Write a program to reverse the given number.

class Program9{
    public static void main(String[] args) {
        int n = 548;
        int temp = n;
        int sum = 0 ;
        while(n!=0){
            int rem = n%10;
            sum = ( sum*10 ) + rem;
            n=n/10;
        }

        System.out.println("Original Number = "+temp);
        System.out.println("Rversed Number = "+sum);
    }
}