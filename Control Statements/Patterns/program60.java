//        10
//        I H
//        7 6 5
//        D C B A

class Program60
{
    public static void main(String[] args) {
        int row=4;
        int n= ((row+1)*row)/2;
        char x=(char)(64+n);
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                if(i%2==0)
                {
                    System.out.print(x-- + " ");
                    n--;
                }
                else
                {
                    System.out.print(n-- + " ");
                    x--;
                }
            }
            System.out.println();
        }
    }
}