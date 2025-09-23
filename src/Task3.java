import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String D;
        String R;
        String I;

        System.out.println("Enter your party, D for Democrat, R for Republican, I for Independent: ");
        if (scan.hasNextLine()) {
            I = scan.nextLine();
        }
        System.out.println("Enter your party, D for Democrat, R for Republican, I for Independent: ");
        if (scan.hasNextLine()) {
            R = scan.nextLine();
        }
        System.out.println("Enter your party, D for Democrat, R for Republican, I for Independent: ");
        if (scan.hasNextLine()) {
            I = scan.nextLine();
        }
        else {
            System.out.println("You entered an invalid party. Please enter D, R, or I: ");
            System.exit(0);
        }
    }
}
