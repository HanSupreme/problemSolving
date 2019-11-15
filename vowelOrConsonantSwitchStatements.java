import java.util.Scanner;

public class vowelOrConsonantSwitchStatements {

    public static void main(String[] args) {

        //Write a JAVA method print total number of days in a month using switch case.

        Scanner sc = new Scanner(System.in);

        char userInput;

        do {

            System.out.println("Enter a letter and I'll tell you if it is a Vowel or Consonant");

            userInput = sc.next().charAt(0);

            String stringInput = sc.nextLine();

            switch (userInput) {
                case 'a': case 'A': case 'e': case 'E': case 'i': case 'I':
                case 'o': case 'O': case 'u': case 'U':
                    System.out.println(userInput + " is a vowel");
                    break;
                case 'b': case 'B': case 'c': case 'C': case 'd': case 'D': case 'f': case 'F':
                case 'g': case 'G': case 'h': case 'H': case 'j': case 'J': case 'k': case 'K':
                case 'l': case 'L': case 'm': case 'M': case 'n': case 'N': case 'p': case 'P':
                case 'q': case 'Q': case 'r': case 'R': case 's': case 'S': case 't': case 'T':
                case 'v': case 'V': case 'w': case 'W': case 'x': case 'X': case 'y': case 'Y':
                case 'z': case 'Z':
                    System.out.println(userInput + " is a consonant");
                    break;
                default:
                    if (userInput >= 0) {
                        System.out.println("That's a number!");
                    } else if (stringInput.length() > 1) {
                        System.out.println("Hmm, " + stringInput + " looks like a string!");
                    }
                    System.out.println(userInput + " is neither a Vowel or Consonant! Enter a single letter");
                    break;
            }

        } while (true);

    }

    }

/*

NOT 100% SOLVED, 

IT WON'T READ STRINGS! IT WILL ONLY READ THE FIRST LETTER THAT IS PRINTED IN THE STRING 
AND PRINT WHETHER IT IS A VOWEL OR CONSONANT

*/
