import java.util.Scanner;

public class ArkadasSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        if (sayi1 <= 0 || sayi2 <= 0) {
            System.out.println("Geçersiz giriş! Lütfen pozitif sayılar girin.");
            return;
        }

        if (arkadasSayiMi(sayi1, sayi2)) {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılardır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılar değildir.");
        }
    }

    public static boolean arkadasSayiMi(int sayi1, int sayi2) {
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }

        return (toplam1 == sayi2 && toplam2 == sayi1);


    }
}