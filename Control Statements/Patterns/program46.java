//        3C 3C 3C 3C
//        3C 3C 3C
//        3C 3C
//        3C

class Program46
{
    public static void main(String[] args) {
        int n=3;
        char x='C';
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=4 ; j>=i ; j--)
            {
                System.out.print(n);
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}