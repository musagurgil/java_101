import java.util.Random;
import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        Random random = new Random();
        int maxSayi = 100;
        int gizliSayi = random.nextInt(maxSayi) + 1;
        int tahmin;
        int tahminSayisi = 0;
        boolean bulundu = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile " + maxSayi + " arasında bir sayıyı tahmin edin.");

        while (!bulundu) {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin == gizliSayi) {
                bulundu = true;
                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");
                System.out.println("Tahmin sayısı: " + tahminSayisi);
            } else if (tahmin < gizliSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }
    }
}
