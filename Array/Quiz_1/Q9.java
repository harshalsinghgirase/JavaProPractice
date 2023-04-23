class Q9
{

    public static void main(String[] args)
    {
        int [] var1 = new int[5];
        var1[2] = 1;
        var1[3] = 2;
        var1[4] = 3;

        for(int var2 = 0; var2 < var1.length; var2++)
            System.out.println(var1[var2]);
    }
}

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>javac Q9.java
//
//        C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>java Q9
//        0
//        0
//        1
//        2
//        3

