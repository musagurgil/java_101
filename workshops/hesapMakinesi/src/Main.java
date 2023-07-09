import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // Toplama işlemi
        int toplam = Islemler.topla(sayi1, sayi2);
        System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);

        // Çıkarma işlemi
        int fark = Islemler.cikar(sayi1, sayi2);
        System.out.println(sayi1 + " - " + sayi2 + " = " + fark);

        // Çarpma işlemi
        int carpim = Islemler.carp(sayi1, sayi2);
        System.out.println(sayi1 + " * " + sayi2 + " = " + carpim);

        // Bölme işlemi
        double bolum = Islemler.bol(sayi1, sayi2);
        System.out.println(sayi1 + " / " + sayi2 + " = " + bolum);

        scanner.close();
    }
}