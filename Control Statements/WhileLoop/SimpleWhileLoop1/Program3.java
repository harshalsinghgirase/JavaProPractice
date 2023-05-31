//Program 3: Write a program to count the digits of the given number.
//        Input: 942111423
//        Output: count of digits = 9

class Program3{
    public static void main(String[] args) {
        int n = 942111423;
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Count of Digits = "+count);
    }
}