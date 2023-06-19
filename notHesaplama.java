import java.util.Scanner;

public class notHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        int vizeNotu = scanner.nextInt();

        System.out.print("Final notunu girin: ");
        int finalNotu = scanner.nextInt();

        double ortalama = hesaplaOrtalama(vizeNotu, finalNotu);
        String harfNotu = hesaplaHarfNotu(ortalama);

        System.out.println("Ortalama: " + ortalama);
        System.out.println("Harf Notu: " + harfNotu);
    }

    public static double hesaplaOrtalama(int vizeNotu, int finalNotu) {
        double vizeAgirligi = 0.4;
        double finalAgirligi = 0.6;

        return (vizeNotu * vizeAgirligi) + (finalNotu * finalAgirligi);
    }

    public static String hesaplaHarfNotu(double ortalama) {
        if (ortalama >= 90) {
            return "AA";
        } else if (ortalama >= 80) {
            return "BA";
        } else if (ortalama >= 70) {
            return "BB";
        } else if (ortalama >= 60) {
            return "CB";
        } else if (ortalama >= 50) {
            return "CC";
        } else if (ortalama >= 40) {
            return "DC";
        } else if (ortalama >= 30) {
            return "DD";
        } else {
            return "FF";
        }
    }
}
