//Program 8: Write a program to print the countdown of days to submit the
//        assignment
class Program8{
    public static void main(String[] args) {
        int day = 5;
        if(day==0){
            System.out.println(day+" days Assignment is Overdue");
        }
        else{
            while (day>=1){
                System.out.println(day + " days remaining");
                day--;
            }
        }
    }
}