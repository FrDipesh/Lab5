import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Please enter your birth month ranging from 1-12: ");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
        }
        else {
            System.out.println("You entered an invalid birth month. Please enter a month from 1-12: ");
            System.exit(0);
        }
        System.out.println("Your birth month is: " + birthMonth);

        if () {
        }

    }
}
