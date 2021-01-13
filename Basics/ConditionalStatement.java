package Basics;

// importing Scanner object for taking user input
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // creating new Sacnner object
        Scanner input = new Scanner(System.in);

        // calling staic methods
        sort3Num(input);
        isVowel(input);

        // closing Scanner
        input.close();

    }

    // Function to sorts 3 number using only if statement
    static void sort3Num(Scanner input) {
        System.out.println("input any 3 Number : ");

        // inputing 3 values from user of int type
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();

        int temp = 0;
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num3 < num1) {
            temp = num3;
            num3 = num1;
            num1 = temp;
        }

        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + "  " + num2 + "  " + num3);

    }

    // Function to find if the word is vowel or not using switch statement
    static void isVowel(Scanner input) {

        System.out.print("input letter : ");
        // inputing data fron user of String type
        String letter = input.next();

        // Storing the first char of input String
        char let = letter.charAt(0);

        if (!Character.isLetter(let)) {
            System.out.println("Input letter is inValid!!");
        } else {
            switch (let) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is Vowel");
                    break;
                default:
                    System.out.println(letter + " is not vowel");
            }
        }
    }

}
