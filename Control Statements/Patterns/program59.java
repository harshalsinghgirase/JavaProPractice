//        F
//        E 1
//        D 2 E
//        C 3 D 4
//        B 5 C 6 D
//        A 7 B 8 C 9

class Program59
{
    public static void main(String[] args) {
        int row=6;
        char x='F';
        int y=1;
        for(int i=1 ; i<=row ; i++)
        {
            
            for(int j=1 ; j<=i ; j++)
            {

                if(j%2==0)
                {
                    System.out.print(y++ + " ");
                }
                else
                {
                    System.out.print(x+" ");
                    x--;
                }

            }
            
            System.out.println();
        }
    }
}