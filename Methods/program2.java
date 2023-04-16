// Take two int variables as the input and then do addition  subtraction multiplication and division by calling
// a function from the main method

//BY USE OF OBJECT CALL THE FUNCTIONS

//Functions can be calleb by using a object even if we have made them static

import java.io.*;
class Program1
{
    void add(int a , int b)
    {
        int c = a+b;
        System.out.println("Addition = "+c);
    }
    void sub(int a , int b)
    {
        int c = a-b;
        System.out.println("Subtraction = "+c);
    }
    void div(int a , int b)
    {
        int c = a/b;
        System.out.println("Division = "+c);
    }
    void mul(int a , int b)
    {
        int c = a*b;
        System.out.println("Multiplication = "+c);
    }

    //Main Method 
    public static void main(String[] args) throws IOException
    {
        Program1 obj = new Program1();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //taking input
        System.out.println("Enter The Two Numbers ");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        //Calling function by using obj
        obj.add(x,y);
        obj.sub(x,y);
        obj.mul(x,y);
        obj.div(x,y);

    }
}