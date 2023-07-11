public class IsletmeKredisi extends Kredi {
    private final String sirketAdi;

    public IsletmeKredisi(double miktar, String sirketAdi) {
        super("İşletme Kredisi", 0.18, miktar);
        this.sirketAdi = sirketAdi;
    }

    public void krediBilgileriniYazdir() {
        super.krediBilgileriniYazdir();
        System.out.println("Şirket Adı: " + sirketAdi);
    }
}
