import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Task 1 - if statement:
//        System.out.println("Enter a number");
//        int choice1 = scanner.nextInt();
//        System.out.println("Enter another number");
//        int choice2 = scanner.nextInt();
//
//        if (choice1 > choice2) {
//            System.out.println(choice1);
//        } else if (choice2 > choice1) {
//            System.out.println(choice2);
//        } else {
//            System.out.println(" Both numbers are equal");
//        }
//        Odd or even
//        System.out.println("Enter a number to find odd or even:");
//        int choice3 = scanner.nextInt();
//        if (choice3 %2 == 0) {
//            System.out.println("The entered number is even");
//        } else{
//            System.out.println("The entered number is odd");
//        }
        //     Traffic rules
//        System.out.println("Enter the traffic color:");
//        String traffic_color =scanner.next();
//        if  (traffic_color.equals("green")){
//            System.out.println("Green means Go");
//        }else if (traffic_color.equals("red")) {
//            System.out.println("Red means Stop");
//        }else if (traffic_color.equals ("orange")) {
//            System.out.println("Orange means Wait");
//        }else {
//            System.out.println("Wrong Selection");
//        }
//Task 2 : switch statement Finding the season
        System.out.println("Enter a number between 1 and 12 to find the season:");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Summer");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Autumn");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Winter");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}




