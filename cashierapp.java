import java.util.Scanner;

public class cashierapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ES Companies Portal - Cashier App");
        System.out.println("==============================");
        System.out.print("Input item's name: ");
        String itemName = input.nextLine();
        System.out.print("Input item's price [use decimal numbers]: $ ");
        double itemPrice = input.nextDouble();
        System.out.print("Input item's quantity [1..20]: ");
        int itemQuantity = input.nextInt();
        System.out.print("Input item's discount [0..50]: ");
        int itemDiscount = input.nextInt();

        double totalPrice = itemPrice * itemQuantity * (100 - itemDiscount) / 100;
        double roundedNumber = Math.round(totalPrice * 100.0) / 100.0;
        
        System.out.println("\nES Companies Portal - Invoice");
        System.out.println("==============================");
        System.out.println("Item's name     : " + itemName);
        System.out.println("Item's price    : " + itemPrice);
        System.out.println("Item's quantity : " + itemQuantity);
        System.out.println("Item's discount : " + itemDiscount + "%");
        System.out.println("\nYou have to pay $" + roundedNumber);

        System.out.print("\nInput your money [use decimal numbers]: $");
        double paymentAmount = input.nextDouble();

        System.out.println("\nThanks for purchasing!");
        double change = paymentAmount - totalPrice;
        double roundedNumber2 = Math.round(change * 100.0) / 100.0;
        System.out.println("Your change: $" + roundedNumber2);

        input.close();
    }
}
