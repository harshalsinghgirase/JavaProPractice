//        1 2 3 4
//        4 5 6
//        6 7
//        7

class Program52
{
    public static void main(String[] args) {
        int x=1;
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=4 ; j>=i ; j--)
            {
                System.out.print(x++ + " ");
            }
            x--;
            System.out.println();
        }
    }
}