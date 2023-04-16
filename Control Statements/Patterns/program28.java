//1
//4 9
//6 25 36
//49 64 81 100

class Program28
{
    public static void main(String[] args) {
        int x=1;
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print((x*x)+" ");
                x++;
            }
            System.out.println();
        }
    }
}