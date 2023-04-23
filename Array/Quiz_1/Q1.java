class Q1
{
    public static void main(String[] args)
    {
        int[] arr;
        arr = {1,2,3,4};

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}

//COMPILE TIME ERROR  //NOTA STATEMENT  //ILLEGAL START OF TYPE
//AN ARRAY CAN NOT BE INITIALIZED AS SHOWN BCZ THE COMPILER WILL RAISE ERROR
//WE CAN USE THIS ABOVE SYNTAX BY BOTH DECLARATION AND ASSIGNMENT SHOULD BE DONE ON THE SAME LINE 
//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\Array\Quiz_1>javac Q1.java
//        Q1.java:6: error: illegal start of expression
//        arr = {1,2,3,4};
//        ^
//        Q1.java:6: error: not a statement
//        arr = {1,2,3,4};
//        ^
//        Q1.java:6: error: ';' expected
//        arr = {1,2,3,4};
//        ^
//        Q1.java:8: error: illegal start of type
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: ')' expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: illegal start of type
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: <identifier> expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: ';' expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: > expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: '(' expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: <identifier> expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: illegal start of type
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:8: error: <identifier> expected
//        for(int i=0 ; i<arr.length ; i++)
//        ^
//        Q1.java:9: error: ';' expected
//        {
//        ^
//        Q1.java:10: error: illegal start of type
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: ';' expected
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: invalid method declaration; return type required
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: ']' expected
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: ')' expected
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: illegal start of type
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: <identifier> expected
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:10: error: ';' expected
//        System.out.print(arr[i] +" ");
//        ^
//        Q1.java:12: error: class, interface, or enum expected
//    }
//            ^
//            23 errors