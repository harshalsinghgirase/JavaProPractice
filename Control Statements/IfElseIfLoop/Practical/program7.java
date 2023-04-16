//Calculate Profit and Loss Take i/p as sp and cp
//write a program that takes the cp and sp and calculates its profit and loss
//
//input1              output1 = profit of 200
//sp = 1200
//cp = 100
//
//input2              output2 = loss of 700
//sp = 300
//cp = 1000
//
//imput3              output3 = ???---> neither loss nor profit
//sp = 100
//cp = 100

import java.util.*;

class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price and selling proce respectively ");
        float sp = sc.nextFloat();
        float cp = sc.nextFloat();
        if(sp>cp)
            System.out.println("Profit of "+ (sp-cp));
        else if(cp>sp)
            System.out.println("Loss of "+ (cp-sp));
        else if(cp==sp)
            System.out.println("As cp and sp are equal therefore no profit or loss");
        else
        {
            
        }
    }
}
