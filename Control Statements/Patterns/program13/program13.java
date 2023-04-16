class Program13
{
    public static void main(String[] args) {
        char x = 'd';
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=1 ; j<=4 ; j++)
            {
                System.out.print(x+"  ");
            }
            System.out.println();
            x--;
        }
    }
}