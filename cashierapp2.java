import java.util.Scanner;

public class cashierapp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keyboardStock = 20;
        int mouseStock = 20;
        int monitorStock = 20;
        while (true) {
            System.out.println("ES Companies Portal - Cashier App 2");
            System.out.println("================================");
            System.out.println("1. Keyboard - $49.99");
            System.out.println("2. Mouse - $19.99");
            System.out.println("3. Monitor - $99.99");
            System.out.println("4. Exit");

            System.out.print("Choose : ");
            int product = scanner.nextInt();
            if (product == 4) {
                break;
            }
            int stock;
            String productName;
            double price;
            switch (product) {
                case 1:
                    stock = keyboardStock;
                    productName = "Keyboard";
                    price = 49.99;
                    break;
                case 2:
                    stock = mouseStock;
                    productName = "Mouse";
                    price = 19.99;
                    break;
                case 3:
                    stock = monitorStock;
                    productName = "Monitor";
                    price = 99.99;
                    break;
                default:
                    System.out.println("Invalid input!");
                    continue;
            }
            System.out.print("Input quantity [1..20] : ");
            int quantity = scanner.nextInt();
            if (quantity > stock) {
                System.out.println("\nOut of stock!");
                System.out.println("\nThanks for using this application :D");
                break;
            }
            double totalPrice = price * quantity;
            double roundedNumber = Math.round(totalPrice * 100.0) / 100.0;
            System.out.println("ES Companies Portal - Invoice");
            System.out.println("==========================");
            System.out.println("Item's name : " + productName);
            System.out.println("Price       : " + price);
            System.out.println("Quantity    : " + quantity);
            System.out.println("\nTotal     : " + roundedNumber);
            System.out.print("Input your money [min " + roundedNumber + "] : ");
            double payment = scanner.nextDouble();
            if (payment < totalPrice) {
                System.out.println("Not enough money!");
                System.out.println("\nThanks for using this application :D");
                break;
            }
            double change = payment - totalPrice;
            double roundedNumber2 = Math.round(change * 100.0) / 100.0;
            System.out.println("Thanks fot purchasing!");
            System.out.println("Your change: " + roundedNumber2);
            System.out.println("\nThanks for using this application :D");
            break;
        }
        scanner.close();
    }

    }
