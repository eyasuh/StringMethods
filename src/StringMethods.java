import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: " );
        String word = input.nextLine();
        System.out.println("Enter a number as an index: ");
        int number = input.nextInt();

        System.out.println("The length of " + word + " is: " + word.length());

        System.out.println("The substring from 0 to " + number + " is: " + word.substring(0,number));

    }
}
