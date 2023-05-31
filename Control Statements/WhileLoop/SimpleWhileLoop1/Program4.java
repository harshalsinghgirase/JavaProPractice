//Program 4: Write a program to count the Odd digits of the given number.
//        Input: 942111423
//        Output: count of odd digits = 5

class Program4{
    public static void main(String[] args) {
        int oddCount=0;
        int n = 942111423;
        while(n!=0){
            if((n%10)%2!=0){
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println("Count Of Odd Digits = "+oddCount);
    }
}