//take the range 1-40
//if the no is divisible by 3 nd 5 break loop
//else print i

class Program2
{
    public static void main(String[] args) {
        int N = 40;
        for(int i=1;i<=N;i++)
        {
            if(i%3==0&&i%5==0)
            {
                break;
            }
            System.out.println(i);
        }
    }
}