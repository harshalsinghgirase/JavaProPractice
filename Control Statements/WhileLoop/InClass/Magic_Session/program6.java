//write a program to print the sum of all even numbers and multiplication of odd numbers btw 1 to 10
//output = sum of even nos btw 1 to 10 = 30
//        = mul of odd nos btw 1 to 10 = 945

class Program6{
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int x=1;
        int y=10;
        while(x<=y){
            if(x%2==0)
            {
             sum = sum + (x);
            }
            else{
                    mul = mul*(x%10);
            }
            x++;
        }
        System.out.println("sum of even nos btw 1 to 10 = "+sum);
        System.out.println("mul of odd nos btw 1 to 10 = "+mul);
    }
}