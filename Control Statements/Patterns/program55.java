//        10
//        10 9
//        9 8 7
//        7 6 5 4

class Program55
{
    public static void main(String[] args) {
        int row=4;
        int n=((row+1)*row)/2;
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(n-- + " ");
            }
            n++;
            System.out.println();
        }
    }
}