//We will try to make a function non static and call static and non static variable or methods

class Program4
{
    int x=5;
    static int y=10;

    void function2()
    {
        System.out.println("This function2 body(non static function) ");
    }
    static void function3()
    {
        System.out.println("This is function3 body(static function)");
    }
    void function1()
    {
        Program4 obj = new Program4();
        System.out.println("Value Of x is "+obj.x);
        System.out.println("Value Of x is "+obj.y);

        obj.function3();
        obj.function2();

    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        Program4 objm = new Program4();
        objm.function1();
    }
}

//We cannot call non static function from a static function
//we can call static function only from a static function
//If we use the object to call the function(Static or Non Static ) from a static function it works

//We can calll nonstatic or static method  or var from a NON STATIC Method