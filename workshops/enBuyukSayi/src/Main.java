import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }

        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
//README

//** EnBuyukSayi
//Bu program, kullanıcının girdiği üç sayı arasından en büyüğünü bulan basit bir Java programıdır.

//** Nasıl Çalışır?
//1- Program başlatıldığında, kullanıcıya konsol üzerinde sırasıyla üç sayı girmesi istenir.
//2- Kullanıcı birinci sayıyı girer ve Enter tuşuna basar.
//3- Kullanıcı ikinci sayıyı girer ve Enter tuşuna basar.
//4- Kullanıcı üçüncü sayıyı girer ve Enter tuşuna basar.
//5- Program girilen üç sayı arasından en büyüğünü bulur.
//6- Program, en büyük sayıyı ekrana yazdırır.

//** Kurulum
//Bu programı çalıştırabilmek için Java JDK (Java Development Kit) ve Java çalışma zamanı ortamının (JRE - Java Runtime Environment) yüklü olması gerekmektedir. Java'yı Oracle'nin resmi web sitesinden indirebilir ve kurabilirsiniz.
//Bir Java derleyicisi veya entegre geliştirme ortamı (IDE) kullanarak ".java" uzantılı kaynak kod dosyasını derleyin ve çalıştırın.
//Örnek komut satırı kullanımı: "javac EnBuyukSayi.java" (derleme) ve "java EnBuyukSayi" (çalıştırma)
//Örneğin, Eclipse veya IntelliJ IDEA gibi popüler bir Java IDE'sini kullanarak kaynak kodunu açabilir, derleyebilir ve çalıştırabilirsiniz.

//** Kaynaklar
//Bu programın geliştirilmesinde aşağıdaki kaynaklar kullanılmıştır:
//Java Dokümantasyonu: https://docs.oracle.com/en/java/

//Musa Gürgil 4.07.2023
