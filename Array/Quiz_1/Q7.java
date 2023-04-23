class Q7
{
    public static void main(String[] args)
    {
        int [] var1 = new int[];
        var1[0] = 0;
        var1[1] = 1;

        System.out.println(var1[0] + " " + var1[1] + " " + var1.length);
    }
}

//COMPILE TIME ERROR

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>javac Q7.java
//Q7.java:5: error: array dimension missing
//        int [] var1 = new int[];
//                               ^
//1 error