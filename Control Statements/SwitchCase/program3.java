//  Most Asked

class Program3
{
    public static void main(String[] args) {
        int ch=65;
        switch (ch)
        {
            case 'A':
                System.out.println("char-A");
                break;
            case 65:
                System.out.println("num-65");
                break;
            case 'B':
                System.out.println("char-B");
                break;
            case 66:
                System.out.println("num-66");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}


//ERROR
// program3.java:12: error: duplicate case label
//            case 65:
//            ^
//program3.java:18: error: duplicate case label
//            case 66:
//            ^
//2 errors