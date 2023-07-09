public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6};
        int aranacak = 2;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }

            String mesaj="";
            if (varMi) {
                mesaj = "Sayı mevcuttur:"+ aranacak;
                mesajVer(mesaj);
            } else {
                mesajVer("Sayı mevcuttur:"+ aranacak);
            }
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
