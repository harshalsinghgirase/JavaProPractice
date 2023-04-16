class Program10
{
    public static void main(String[] args)
    {
        Program10 obj = new Program10();
        obj.fun(10);
        obj.fun(10.5f);
    }
    void fun(int x)
    {
        System.out.println("In Fun");
        System.out.println(x);
    }
}
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Methods>javac program10.java
//        program10.java:7: error: incompatible types: possible lossy conversion from float to int
//        obj.fun(10.5f);
//        ^
//        Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//        1 error