//Program 10: Write a program to check whether the number is a Palindrome
//        number or not. (2332)

class Program10{
    public static void main(String[] args) {
        int n = 545;
        int temp = n;
        int sum = 0 ;
        while(n!=0) {
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }

        if(temp==sum)
        {
            System.out.println("The No Is A palindrome");
        }
        else
        {
            System.out.println("The No is Not A Palindrome ");
        }
    }
}