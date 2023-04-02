import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number, factorial = 1;
    
    while (true) {
        System.out.print("Masukkan angka: ");
        number = input.nextInt();
    
        if (number == 0) {
            break;
        }
    
        System.out.print("Perkalian faktorial adalah: ");
        while (number > 0) {
            System.out.print(number);
            factorial *= number;
            number--;
    
            if (number > 0) {
            System.out.print(" x ");
            }
        }
    
        System.out.println("\nHasilnya adalah: " + factorial);
        factorial = 1;
    }
    
    }
}