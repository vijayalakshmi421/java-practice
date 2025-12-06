import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int secret = 7;
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 10: ");
        int guess = sc.nextInt();

        if (guess == secret) {
            System.out.println(" Correct Guess!");
        } else {
            System.out.println(" Wrong! The number was " + secret);
        }
    }
}
