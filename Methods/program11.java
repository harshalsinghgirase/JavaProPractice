class Program11
{
    void fun(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        System.out.println("in main");
        Program11 obj = new Program11();
        obj.fun();
        System.out.println("end main");
    }
}
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Methods>javac program11.java
//        program11.java:11: error: method fun in class Program11 cannot be applied to given types;
//        obj.fun();
//                ^
//                required: int
//                found: no arguments
//                reason: actual and formal argument lists differ in length
//                1 error