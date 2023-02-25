package week3;

import java.util.Scanner;

public class SwitchCase {
    /**
     * switch - case statement supports
     * byte, short, char, and int from primitive data types.
     *
     * Non-primitive: String
     */
        /*
        switch (something){
            case value :
                //statement
            case value2 :
                //statement
            default:
                //statement
        }
        */

    // User will enter a name and then check the name and write in the console.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String name = scanner.nextLine();

        switch (name) {
            case "Vitaly":
                System.out.println("You have entered Vitaly.");
                break;
            case "Mustafa":
                System.out.println("You have entered Mustafa.");
                break;
            case "Ramazan":
                System.out.println("You have entered Ramazan.");
                break;
            case "Katrina":
                System.out.println("You have entered Katrina.");
                break;
            default:
                System.out.println("Please enter the valid name.");
                break;
        }

        System.out.print("Please enter the current day : ");
        String currentDay = scanner.nextLine();

        switch (currentDay) {
            case "Monday":
                System.out.println("Today is Monday.");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
            case "Friday":
                System.out.println("Today is Friday.");
                break;
            case "Saturday":
                System.out.println("Today is Saturday.");
                break;
            case "Sunday":
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Please enter valid day name.");
                break;
        }


    }
}
