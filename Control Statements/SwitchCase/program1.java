class Program1
{
    public static void main(String[] args) {
        int x=3;
        switch (x)
        {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");

            case 5:
                System.out.println("Five");

            default:
                System.out.println("No Match");
                
        }
        System.out.println("After Switch");
    }
}

//Once the condition is true and there is no break after each statement then all cases are ignored and their body get's
// executed 