//take a integer N as input
//print odd integerrs from 1 to N using loops
//
//input = 10
//output = 1 3 5 7 9
//----------------------------------------------------------------------------------------------------------------------
class program2
{
    public  static  void main(String ar[])
    {
        int i = 1;
        while(i<=10)
        {
            if(!(i%2==0))
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
