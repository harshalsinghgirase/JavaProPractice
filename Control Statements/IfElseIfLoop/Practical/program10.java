//Write a java program for if else if ladder which is a real life example
import java.util.*;

class program10{
    public static void main(String[] args) {
        System.out.println("Enter The BMI");
        Scanner sc = new Scanner(System.in);
        int bmi = sc.nextInt();
        if(bmi<18.5){
            System.out.println("underweight range");
        }
        else if (bmi>18.5 && bmi<24.9) {
            System.out.println("Healthy Weight range");
        }
        else if (bmi>25.00 && bmi<29.9) {
            System.out.println("overweight range");
        }
        else if (bmi>30) {
            System.out.println("obese range");
        }
        else {
            
        }
    }
}