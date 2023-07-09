public class Main {
    public static void main(String[] args) {
        String mesaj = "Bu bir test mesajıdır.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(10, 11);
        System.out.println(sayi);
        int toplam = topla2(2,5,4,8,7,6,7,10,54);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Ekleme işlemi tamamlandı");
    }

    public static void güncelle() {
        System.out.println("Güncelleme işlemi tamamlandı.");
    }

    public static void sil() {
        System.out.println("Silme işlemi tamamlandı.");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer() {
        return "Ankara";
    }

}