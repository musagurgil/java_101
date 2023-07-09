class Islemler {
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static double bol(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return 0;
        }
    }
}
