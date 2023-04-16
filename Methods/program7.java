class Program7
{
    int fun(int x)
    {
        int y=x+10;
        return y;
    }
    public static void main(String[] args)
    {
        Program7 obj = new Program7();
        int a = obj.fun(10);
        System.out.println(a);
    }
}