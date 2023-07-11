public class KonutKredisi extends Kredi {
    private final int vade;

    public KonutKredisi(double miktar, int vade) {
        super("Konut Kredisi", 0.10, miktar);
        this.vade = vade;
    }

    public void krediBilgileriniYazdir() {
        super.krediBilgileriniYazdir();
        System.out.println("Vade: " + vade + " ay");
    }
}
