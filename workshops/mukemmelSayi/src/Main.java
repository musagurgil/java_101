import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 0) {
            System.out.println("Geçersiz giriş! Lütfen pozitif bir sayı girin.");
            return;
        }

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println("Girdiğiniz sayı mükemmel bir sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı mükemmel bir sayı değildir.");
        }
    }
}