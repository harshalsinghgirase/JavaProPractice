//        A b C d
//        E f G h
//        I j K l
//        M n O p

class Program40
{
    public static void main(String[] args) {
        char x='A';
        char y='b';
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=1 ; j<=4 ; j++)
            {
                if(j%2==0){
                    System.out.print((y++)+" ");
                    y++;
                }
                else
                {
                    System.out.print((x++)+" ");
                    x++;
                }
            }
            System.out.println();
        }
    }
}