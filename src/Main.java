import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemPrice = 0;
        double shippingRate = 0.02;
        int FREE_SHIPPING;
        double shippingCost;
        double totalCost;

        System.out.println("Please enter the price of your item: ");
        if(scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
        }
        else{
            System.out.println("Please enter a valid price: ");
            System.exit(0);
        }

        if(itemPrice >= 100) {
            System.out.println("You spent $100! You get FREE SHIPPING!");
        }
        else{
            shippingCost = itemPrice * shippingRate;
            totalCost = shippingCost + itemPrice;
            System.out.println("Your shipping cost is: " + );
        }
    }
}