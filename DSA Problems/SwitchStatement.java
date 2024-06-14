
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("enter a fruit:");
//        String fruits = sc.next();
        // ==> this is normal switch statement:

//        switch(fruits){
//            case "mango":
//                System.out.println("king of all fruits");
//                break;
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("orange in color");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }

        // ==> this is enhanced switch statement:

//        switch (fruits) {
//            case "mango" -> System.out.println("king of all fruits");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("orange in color");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }
        System.out.print("enter number:");
        int days = sc.nextInt();

        switch (days) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("weekdays");
                break;
            case 6:

            case 7:
                System.out.println("weekends");
                break;
            default:
                System.out.println("not valid number");
                break;
        }

        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
            default -> System.out.println("not valid number");
        }
    }
}



















