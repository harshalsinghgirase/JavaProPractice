//Test and trial on methods in java
//1

class Program6
{
    void  fun(int x)
    {
        int y = x+10;
    }
    public static void main(String[] args)
    {
        Program6 obj = new Program6();
        int a = obj.fun(20);
        System.out.println(a);
    }
}

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Methods>javac program6.java
//        program6.java:13: error: incompatible types: void cannot be converted to int
//        int a = obj.fun(20);
//        ^
//        1 error