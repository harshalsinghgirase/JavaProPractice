class Q4
{
    public static void main(String[] args) {
        int[] var1 = new int[2];
        var1[0] = 0;
        var1[1] = 1;

        System.out.println(var1[0] + " " + var1[1] + " " + var1.length + var1[2]);
    }
}

//RUNTIME ERROR
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>javac Q4.java
//

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>java Q4
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
//        at Q4.main(Q4.java:8)