//        1
//        2 3
//        4 5 6
//        7 8 9 10

class Program44
{
    public static void main(String[] args) {
        int row=4;
        int n=1;
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print((n++)+" ");
            }
            System.out.println();
        }
    }
}