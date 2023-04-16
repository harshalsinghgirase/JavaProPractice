 // Take two int variables as the input and then do addition  subtraction multiplication and division by calling
 // a function from the main method

 //BY MAKING FUNCTION STATIC 
 import java.io.*;
class Program1
{
    static void add(int a , int b)
    {
        int c = a+b;
        System.out.println("Addition = "+c);
    }
    static void sub(int a , int b)
    {
        int c = a-b;
        System.out.println("Subtraction = "+c);
    }
    static void div(int a , int b)
    {
        int c = a/b;
        System.out.println("Division = "+c);
    }
    static void mul(int a , int b)
    {
        int c = a*b;
        System.out.println("Multiplication = "+c);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Two Numbers ");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        add(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);

    }
}