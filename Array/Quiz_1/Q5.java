class Q5
{
    public static void main(String[] args) {
        int [] var1 = new int[3];
        var1[1] = 1;
        var1[2] = 2;
        var1[3] = 3;
        System.out.println(var1[1] + " " + var1[2] + " " + var1[3]);
    }
}

//RUNTIME ERROR

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>javac Q5.java
//
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>java Q5
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//        at Q5.main(Q5.java:7)