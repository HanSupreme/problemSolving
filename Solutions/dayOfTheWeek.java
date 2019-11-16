import java.util.Scanner;

public class dayOfTheWeek {

    public static void main(String[] args) {

        //Write a JAVA method to print day of week name using switch case.

        Scanner sc = new Scanner(System.in); //creating Scanner Object so that we can get input from user

        int dayOfTheWeek; //creating Primitive integer (int), declaring int with the name dayOfTheWeek

        do { //creating a Do-While Loop so that we can continue to get input after input

            System.out.println("Which day out of the week are you looking for? (Enter a number 0-6)");
            dayOfTheWeek = sc.nextInt(); //assigning the declared int variable to Scanner object

            switch (dayOfTheWeek) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("There's only 7 days out of the week!");
            }

        } while (true);

    }

    }
