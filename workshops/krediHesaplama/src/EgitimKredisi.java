public class EgitimKredisi extends Kredi {
    private final String ogrenciAdi;

    public EgitimKredisi(double miktar, String ogrenciAdi) {
        super("Eğitim Kredisi", 0.08, miktar);
        this.ogrenciAdi = ogrenciAdi;
    }

    public void krediBilgileriniYazdir() {
        super.krediBilgileriniYazdir();
        System.out.println("Öğrenci Adı: " + ogrenciAdi);
    }
}
