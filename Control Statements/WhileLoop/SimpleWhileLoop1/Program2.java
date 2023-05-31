//Program 2: Write a program to calculate the factorial of the given
//        number.
//        Input: 6
//        Output: factorial 6 is 720

class Program2{
    public static void main(String[] args) {
        int n=6;
        int mul = 1;
        while(n!=0){
            mul = mul * n;
            n--;
        }
        System.out.println("Factorial = "+mul);
    }
}