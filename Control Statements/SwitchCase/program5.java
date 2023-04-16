//Trying string in switch case
//before 1.6 this was not supported but after 1.6 string was supported

class Program5
{
    public static void main(String[] args) {
        String str = "Mon";
        switch (str)
        {
            case "Mon":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Sunday");
                break;

        }
    }
}