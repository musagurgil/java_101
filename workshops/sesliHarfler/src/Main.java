import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir harf girin: ");
        String harf = scanner.nextLine().toLowerCase();

        if (harf.length() != 1 || !Character.isLetter(harf.charAt(0))) {
            System.out.println("Geçersiz giriş! Lütfen sadece bir harf girin.");
        } else {
            switch (harf) {
                case "a":
                case "ı":
                case "o":
                case "u":
                    System.out.println("Girdiğiniz harf kalın sesli harftir.");
                    break;
                case "e":
                case "i":
                case "ö":
                case "ü":
                    System.out.println("Girdiğiniz harf ince sesli harftir.");
                    break;
                default:
                    System.out.println("Girdiğiniz harf bir sesli harf değildir.");
            }
        }
    }
}