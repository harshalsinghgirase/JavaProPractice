class Program9
{
    public static void main(String[] args)
    {
        Program9 obj = new Program9();
        obj.fun(10);  //int to float possible bcz no loss
        obj.fun(10.5f); // float to float no issue
        obj.fun('A');   //char always goes internally as a int only so int to float again possible 
    }
    void fun(float x)
    {
        System.out.println("InFun");
        System.out.println(x);
    }
}