//        1 2 3 4
//        2 3 4
//        3 4
//        4

class Program56
{
    public static void main(String[] args) {
        int row=4;
        for(int i=1 ; i<=row ; i++)
        {
            int temp=i;
            for(int j=row ; j>=i ; j--)
            {
                System.out.print(temp+ " ");
                temp++;
            }
            System.out.println();
        }
    }
}