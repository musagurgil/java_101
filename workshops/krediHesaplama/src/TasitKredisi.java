public class TasitKredisi extends Kredi {
    private final String aracMarkasi;

    public TasitKredisi(double miktar, String aracMarkasi) {
        super("Taşıt Kredisi", 0.15, miktar);
        this.aracMarkasi = aracMarkasi;
    }

    public void krediBilgileriniYazdir() {
        super.krediBilgileriniYazdir();
        System.out.println("Araç Markası: " + aracMarkasi);
    }
}
