//        F
//        E F
//        D E F
//        C D E F
//        B C D E F
//        A B C D E F

class Program49
{
    public static void main(String[] args) {
        char x='F';
        for(int i=1 ; i<=6 ; i++)
        {
            char temp=x;
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(temp++ + " ");

            }
            System.out.println();
            x--;
        }
    }
}