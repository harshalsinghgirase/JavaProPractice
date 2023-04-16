//Making a static function and calling it through object

class Program3
{
    static void fun()
    {
        System.out.println("This function is static\nIt is called by using object of the class ");
    }

    public static void main(String[] args)
    {
        Program3 obj = new Program3();
        obj.fun();
    }
}