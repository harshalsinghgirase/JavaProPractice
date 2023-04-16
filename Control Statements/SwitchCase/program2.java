class Program2
{
    public static void main(String[] args) {
        int x=1;
        switch(x)
        {
            case 2:
                System.out.println("1");
                break;
            case 5:
                System.out.println("2");
                break;
            case 5:
                System.out.println("first 5");
                break;
            case 2:
                System.out.println("second 5");
                break;
            default:
                System.out.println("No Match");
                break;
        }
        System.out.println("After Switch");
    }
}

//ERROR
//  program2.java:13: error: duplicate case label
//            case 5:
//            ^
//  program2.java:16: error: duplicate case label
//            case 2:
//            ^
//  2 errors