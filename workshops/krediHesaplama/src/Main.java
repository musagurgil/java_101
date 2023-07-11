public class Main {
    public static void main(String[] args) {
        KonutKredisi konutKredisi = new KonutKredisi(150000, 120);
        konutKredisi.krediBilgileriniYazdir();

        System.out.println("----------------------");

        TasitKredisi tasitKredisi = new TasitKredisi(50000, "Volvo");
        tasitKredisi.krediBilgileriniYazdir();

        System.out.println("----------------------");

        IhtiyacKredisi ihtiyacKredisi = new IhtiyacKredisi(10000, "Tatil");
        ihtiyacKredisi.krediBilgileriniYazdir();

        System.out.println("----------------------");

        EgitimKredisi egitimKredisi = new EgitimKredisi(25000, "Musa Gurgil");
        egitimKredisi.krediBilgileriniYazdir();

        System.out.println("----------------------");

        IsletmeKredisi isletmeKredisi = new IsletmeKredisi(100000, "GRG Project");
        isletmeKredisi.krediBilgileriniYazdir();
    }
}