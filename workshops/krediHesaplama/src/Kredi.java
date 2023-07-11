public class Kredi {
    protected String ad;
    protected double faizOrani;
    protected double miktar;

    public Kredi(String ad, double faizOrani, double miktar) {
        this.ad = ad;
        this.faizOrani = faizOrani;
        this.miktar = miktar;
    }

    public double hesaplaTaksit() {
        return (miktar * faizOrani) / 12;
    }

    public void krediBilgileriniYazdir() {
        System.out.println("Kredi Türü: " + ad);
        System.out.println("Faiz Oranı: %" + faizOrani);
        System.out.println("Kredi Miktarı: " + miktar + " TL");
        System.out.println("Aylık Taksit: " + hesaplaTaksit() + " TL");
    }
}
