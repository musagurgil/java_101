import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Girdiğiniz sayı asal değildir.");
            return;
        }

        boolean asal = true;

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }

        if (asal) {
            System.out.println("Girdiğiniz sayı asal bir sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı asal değildir.");
        }
    }
}