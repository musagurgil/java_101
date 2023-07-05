// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] turkeyRegions = {
                {"Marmara", "İstanbul", "Bursa", "Tekirdağ", "Edirne", "Kocaeli"},
                {"Ege", "İzmir", "Aydın", "Muğla", "Manisa", "Denizli"},
                {"İç Anadolu", "Ankara", "Konya", "Kayseri", "Eskişehir", "Aksaray"},
                {"Akdeniz", "Antalya", "Mersin", "Adana", "Hatay", "Osmaniye"},
                {"Karadeniz", "Trabzon", "Samsun", "Rize", "Ordu", "Giresun"},
                {"Doğu Anadolu", "Erzurum", "Van", "Ağrı", "Iğdır", "Kars"},
                {"Güneydoğu Anadolu", "Diyarbakır", "Gaziantep", "Şanlıurfa", "Mardin", "Batman"}
        };

        for (int i = 0; i < turkeyRegions.length; i++) {
            String region = turkeyRegions[i][0];
            System.out.println("Bölge: " + region);

            for (int j = 1; j < turkeyRegions[i].length; j++) {
                String city = turkeyRegions[i][j];
                System.out.println("- " + city);
            }

            System.out.println();
        }
    }
}