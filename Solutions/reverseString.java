package InterviewProblems;

import java.util.Scanner;

public class reverseString {

//    private static Scanner sc;
    public static void main(String[] args) {
//        sc = new Scanner(System.in);

        solutionTwo();

    }

    public static void solutionOne() {
        System.out.println("Hello" + "\n" +
                "What would you like for me to reverse?");
//        String input = sc.nextLine();
        String input = "hello world";
        char[] tempArray = input.toCharArray();

        int left, right = 0;
        right = tempArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = tempArray[left];

            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c : tempArray) {
            System.out.print(c); //will print from left to right
//            System.out.println(c + "\n"); will print from top to bottom in reverse order
        }
    }

    public static void solutionTwo() {
        String input = "hello world";
        String reversed = reverseThisString(input);
        System.out.print(reversed);
    }

    public static String reverseThisString(String input) {
        if (input.isEmpty()) {
            return input;
        }

        return reverseThisString(input.substring(1) + input.charAt(0));
    }
}
