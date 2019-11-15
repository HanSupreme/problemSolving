import java.util.Scanner;

public class upload {

    public static void main(String[] args) {

        //Write a JAVA method print total number of days in a month using switch case.

        Scanner sc = new Scanner(System.in);

        String monthSelection;

        do {

            System.out.println("Tell me a Month and I'll tell you the amount of Days it has!");

            monthSelection = sc.nextLine();

            switch (monthSelection) {
                case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                    System.out.println(monthSelection + " has 31 days!");
                    break;
                case "February": case "february":
                    System.out.println(monthSelection + " has 28 days, 29 in leap year!");
                    break;
                case "April": case "June": case "September": case "November":
                case "april": case "june": case "september": case "november":
                    System.out.println(monthSelection + " has 30 days!");
                    break;
                default:
                    System.out.println(monthSelection + " isn't a month!");
            }

        } while (true);

    }

    }