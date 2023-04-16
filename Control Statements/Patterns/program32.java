//1 4 3 16
//5 36 7
//8 81
//10

class Program32
{
    public static void main(String[] args) {
        int x=1;
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=4 ; j>=i ; j--)
            {
                if(j%2==0)
                    System.out.print(x+" ");
                else
                    System.out.print((x*x)+" ");
                x++;
            }
            System.out.println();
        }
    }
}