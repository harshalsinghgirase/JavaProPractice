//Given the temperature of a person in farenheit print whether the person has high  , normal or loqw temp

//>98.6   ==>high
//98.0<= & <=98.6  ==>Normal
//<98.0 ==>low
import  java.util.*;

class program4
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp>98.6)
            System.out.println("High");
            
    }
}