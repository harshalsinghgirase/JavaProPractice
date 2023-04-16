import java.util.*;

class Program1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Platform Name : ");
        String platform = sc.next();
        switch(platform)
        {
            case "netflix":
            {
                System.out.println("Enter The Netflix Category : ");
                String nc = sc.next();
                switch(nc)
                {
                    case "Bollywood":
                        System.out.println("ChennaiExpress  PremRatan  Border");
                        break;
                    case "Hollywood":
                        System.out.println("Wakanda  JohnWick  Avengers");
                        break;
                }
                break;
            }
            case "primevideo":
            {
                System.out.println("Enter The Amazon Category : ");
                String amz = sc.next();
                switch(amz)
                {
                    case "Bollywood":
                        System.out.println("RRR  Krish  Pathaan");
                        break;
                    case "Hollywood":
                        System.out.println("Avatar  Joker  Inception");
                        break;
                }
                break;
            }
        }
    }
}