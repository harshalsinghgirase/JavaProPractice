//A B C D
//A B C
//A B
//A

class Program27
{
    public static void main(String[] args) {
        for(int i=1 ; i<=4 ; i++)
        {
            char x = 'A';
            for(int j=4 ; j>=i ; j--)
            {
                System.out.print((x++)+" ");
            }
            System.out.println();
        }
    }
}