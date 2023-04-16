class Program20
{
    public static void main(String[] args) {
        int x = 1;
        char y = 'A';
        for(int i=1 ; i<=3 ; i++)
        {
            for(int j=1 ; j<=4 ; j++)
            {
                if(j%2==0)
                    System.out.print((x++)+"  ");
                else
                    System.out.print((y++)+"  ");
            }
            System.out.println();
        }
    }
}