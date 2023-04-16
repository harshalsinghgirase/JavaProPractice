//A 1 B 2
//C 3 D
//E 4
//F

class Program31
{
    public static void main(String[] args) {
        int x=1 ;
        char y = 'A';
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=4 ; j>=i ; j--)
            {
                if(j%2==0)
                    System.out.print((y++)+" ");
                else
                    System.out.print((x++)+" ");
            }
            System.out.println();
        }
    }
}