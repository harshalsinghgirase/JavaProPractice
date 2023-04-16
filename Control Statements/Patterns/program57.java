//        A B C D
//        B C D
//        C D
//        D

class Program57
{
    public static void main(String[] args) {
        int row=4;
        char x='A';
        for(int i=1 ; i<=row ; i++)
        {
            char temp = x;
            for(int j=4 ; j>=i ;j--)
            {
                System.out.print(temp++ + " ");
            }
            System.out.println();
            x++;
        }
    }
}