import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Not harfinizi girin: ");
        String notHarfi = scanner.nextLine();

        switch (notHarfi) {
            case "A":
            case "a":
                System.out.println("Geçtiniz");
                break;
            case "B":
            case "b":
                System.out.println("Geçtiniz");
                break;
            case "C":
            case "c":
                System.out.println("Geçtiniz");
                break;
            case "D":
            case "d":
                System.out.println("Geçtiniz");
                break;
            case "F":
            case "f":
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not harfi girdiniz");
        }
    }
}

// README

//* NotDurumu
//Bu program, kullanıcının girdiği not harfine göre "kaldınız" veya "geçtiniz" durumunu belirleyen basit bir Java programıdır. Switch-case yapısını kullanarak not harfine göre karar verilir.

//* Nasıl Çalışır?
//Program başlatıldığında, kullanıcıya konsol üzerinde bir not harfi girmesi istenir.
//Kullanıcı bir not harfi girer ve Enter tuşuna basar.
//Program, girilen not harfine göre karar verir ve sonucu ekrana yazdırır:
//Eğer girilen not harfi A, B, C veya D ise "Geçtiniz" mesajı görüntülenir.
//Eğer girilen not harfi F ise "Kaldınız" mesajı görüntülenir.
//Eğer geçerli bir not harfi girilmediyse "Geçersiz not harfi girdiniz" mesajı görüntülenir.

//* Kurulum
//Bu programı çalıştırmak için Java JDK (Java Development Kit) ve Java çalışma zamanı ortamının (JRE - Java Runtime Environment) yüklü olması gerekmektedir. Java'yı Oracle'nin resmi web sitesinden indirebilir ve kurabilirsiniz.
//Bir Java derleyicisi veya entegre geliştirme ortamı (IDE) kullanarak .java uzantılı kaynak kod dosyasını derleyin ve çalıştırın.
//Örnek komut satırı kullanımı: javac NotDurumu.java (derleme) ve java NotDurumu (çalıştırma)
//Örneğin, Eclipse veya IntelliJ IDEA gibi popüler bir Java IDE'sini kullanarak kaynak kodunu açabilir, derleyebilir ve çalıştırabilirsiniz.

//* Kaynaklar
//Bu programın geliştirilmesinde aşağıdaki kaynaklar kullanılmıştır:
//Java Dokümantasyonu: https://docs.oracle.com/en/java/

//Musa Gürgil 04.07.2023
