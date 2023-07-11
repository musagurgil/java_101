public class IhtiyacKredisi extends Kredi {
    private final String kullanımAlani;

    public IhtiyacKredisi(double miktar, String kullanımAlani) {
        super("İhtiyaç Kredisi", 0.12, miktar);
        this.kullanımAlani = kullanımAlani;
    }

    public void krediBilgileriniYazdir() {
        super.krediBilgileriniYazdir();
        System.out.println("Kullanım Alanı: " + kullanımAlani);
    }
}
