//        J
//        I H
//        G F E
//        D C B A

class Program50
{
    public static void main(String[] args) {
        int row=4;
        char x='J';
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(x-- + " ");
            }
            System.out.println();
        }
    }
}