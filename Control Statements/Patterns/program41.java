//1C3  4B2  9A1
//16C3  25B2  36A1
//49C3  64B2  81A1

class Program41
{
    public static void main(String[] args) {
        int x=1;

        for(int i=1 ; i<=3 ; i++)
        {
            char y='C';
            int b=3;
            for(int j=1 ; j<=3 ; j++)
            {
                System.out.print(x*x);
                System.out.print(y);
                System.out.print(b);
                System.out.print(" ");
                x++;
                b--;
                y--;
            }
            System.out.println();
        }
    }
}