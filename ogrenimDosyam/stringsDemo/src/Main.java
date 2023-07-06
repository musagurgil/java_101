// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bu bir deneme metnidir.";
        System.out.println(mesaj);
        System.out.println("-*-*-*-");

        System.out.println("Metindeki eleman sayısı : " + mesaj.length());
        System.out.println("4.elaman : " + mesaj.charAt(3));
        System.out.println("-*-*-*-");

        System.out.println(mesaj.concat(" Son ekleme başarılı bir şekilde yapılmıştır."));
        System.out.println(mesaj);
        System.out.println("-*-*-*-");

        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        System.out.println("-*-*-*-");

        char[] karakter = new char[6];
        mesaj.getChars(0, 6, karakter, 0);
        System.out.println(karakter);
        System.out.println("-*-*-*-");

        System.out.println(mesaj.lastIndexOf('d'));
        System.out.println(mesaj.indexOf('d'));
        System.out.println("-*-*-*-");

        String yeniMesaj = mesaj.replace('i', 'ı');
        System.out.println("Yeni değiştirilmiş mesajınız : " + yeniMesaj);
        System.out.println("-*-*-*-");

        System.out.println("3. indexten başlayan mesajınız: " + mesaj.substring(3));
        System.out.println("3. ve 6. index arasındaki mesajınız: " + mesaj.substring(3, 6));
        System.out.println("-*-*-*-");

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println("-*-*-*-");

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}