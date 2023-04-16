class Program4
{

    public static void main(String[] args) {
        int x=3;
        int a=1;
        int b=2;

        switch(x) {
            case a:
                System.out.println("1");
                break;
            case b:
                System.out.println("2");
                break;
            default:
                System.out.println("Not Matching");
                break;
        }
    }
}

//ERROR
//program4.java:10: error: constant expression required
//            case a:
//                 ^
//program4.java:13: error: constant expression required
//            case b:
//                 ^
//2 errors

//Switch statment does not allow variable expression in label and constant value or expression is required