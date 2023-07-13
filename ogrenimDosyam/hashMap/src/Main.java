import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("Apple", "Elma");
        sozluk.put("Pencil", "Kalem");
        sozluk.put("Sun", "Güneş");
        System.out.println(sozluk);
        System.out.println("Eleman sayısı : " + sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman : " + item +" / "+ "Değer : " + sozluk.get(item));
        }


        sozluk.remove("Apple");
        System.out.println(sozluk.get("Apple"));

    }
}