//take the range 1 to 50
//if the number is divisible by 3 and 5 or divisible by 4 then simply skip that number and print the next numbers

class Program1
{
    public static void main(String[] args) {
        int N = 50;
        for(int  i=1 ; i<=N ; i++)
        {
            if((i%3==0&&i%5==0)||(i%4==0))
            {
                continue;
            }
            System.out.println(i);
        }
    }
}