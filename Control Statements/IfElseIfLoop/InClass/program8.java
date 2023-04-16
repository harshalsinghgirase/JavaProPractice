//Electricity Bill Problem
//Given an Integer input a which represents units of electricity consumed in ur house
//calculate the total bill if units<=100 price per unit is rs 1 and if unit >100 price per unit is rs 2

//Input:50
//Output:50

//Input:200
//Output:300

import java.util.*;

class program8{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

                float unit    = sc.nextFloat();
                if(unit<=100)
                {
                    System.out.println("The Total Bill Is "+ (unit*1));
                }
                else
                {
                    System.out.println("The Total Bill Is "+((unit-100)*2 + 100));
                }
    }
}