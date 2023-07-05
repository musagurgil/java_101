
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Musa";
        String ogrenci2 = "Gürgil";
        String ogrenci3 = "Ceren";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("Bitti");




        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Musa";
        ogrenciler[1] = "Gürgil";
        ogrenciler[2] = "Ceren";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("For döngüsü ile sayım bitti");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
        System.out.println("Program tamamlandı.");
    }

}
