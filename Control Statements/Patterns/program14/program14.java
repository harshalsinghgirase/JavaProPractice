class Program14
{
    public static void main(String[] args) {
        for(int i=1 ; i<=3 ; i++)
        {
            char x = 'C';
            for(int j=1 ; j<=3 ; j++)
            {
                System.out.print((x--)+"  ");
            }
            System.out.println();
        }
    }
}