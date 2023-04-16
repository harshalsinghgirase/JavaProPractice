class Program18
{
    public static void main(String[] args) {
        for(int i=1 ; i<=4 ;i++)
        {
            int x=1;
            char y='A';
            for(int j=1 ; j<=4 ; j++)
            {
                if(j%2!=0)
                    System.out.print((y++)+"  ");
                else
                    System.out.print((x++)+"  ");
            }
            System.out.println();
        }
    }
}