//Program 5: Write a program to print the square of even digits of the
//        given number.
//        Input: 942111423
//        Output: 4 16 4 16

class Program5{
    public static void main(String[] args) {
        int oddCount=0;
        int n = 942111423;
        while(n!=0){
            if((n%10)%2==0){
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println("Count Of Odd Digits = "+oddCount);
    }
}