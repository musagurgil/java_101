import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("Ankara");


        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));

        //Seçili indexi yeni değer ile değiştirir
        sayilar.set(2,"İstanbul");
        System.out.println("Ankara değeri : '"+sayilar.get(2)+" 'ile değiştirilmiştir.");

        //Seçili indexteki veriyi kaldırır
        sayilar.remove(0);
        System.out.println(sayilar.get(0));

        //Tüm listedeki elemanları gösterir.
        for (Object i:sayilar){
            System.out.println(i);
        }

        //Tüm listeyi temizler.
        sayilar.clear();
        System.out.println("Tüm liste temizlendikten sonra eleman sayısı : "+sayilar.size());
    }
}