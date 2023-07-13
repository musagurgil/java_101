import matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Adınızı giriniz : ");

    String name = scanner.nextLine();
    System.out.println("Merhaba "+name);

        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(5,10));
        System.out.println(dortIslem.cikar(5,10));
        System.out.println(dortIslem.bol(5,10));
        System.out.println(dortIslem.carp(5,10));

        Logaritma logaritma=new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
    }
}