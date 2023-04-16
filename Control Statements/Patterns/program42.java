//        F 5 D 3 B 1
//        F 5 D 3 B 1
//        F 5 D 3 B 1
//        F 5 D 3 B 1
//        F 5 D 3 B 1

class  Program42
{
    public static void main(String[] args) {

        for(int i=1 ; i<=6 ; i++)
        {
            int x=5;
            char y='F';
            for(int j=1 ; j<=6 ; j++)
            {
                if(j%2==0)
                {
                    System.out.print(x-- + " ");
                    x--;
                }

                else
                {
                    System.out.print(y-- + " ");
                    y--;
                }
            }
            System.out.println();
        }
    }
}