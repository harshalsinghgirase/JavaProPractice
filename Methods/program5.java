class Program5
{
    int x = 10;
    static int y=15;
    void fun()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        Program5 obj = new Program5();
        obj.fun();
    }
}

//Here we see that a no static function can access or call both static and nonstatic variable and method respectively


