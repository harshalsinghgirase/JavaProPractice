class Program8
{
    void fun(int x)
    {
        int y = x+10;
    }
    public static void main(String[] args)
    {
        Program8 obj = new Program8();
        System.out.println(obj.fun(10));
    }
}

//EROOR ENCOUNTERED
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Methods>javac program8.java
//        program8.java:10: error: 'void' type not allowed here
//        System.out.println(obj.fun(10));
//        ^
//        1 error