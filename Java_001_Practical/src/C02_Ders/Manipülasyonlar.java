package C02_Ders;

import java.util.Scanner;

public class Manipülasyonlar {
    public static void main(String[] args) {

        String isim = "aziz" ;

        System.out.println(isim.equals("aziz")); // karşılatırma yapar String ait bir metotdur
        System.out.println(isim.equalsIgnoreCase(" AZİZ"));
        // büyük küçük fark etmez sadece anlamları aynı mıdeğilmi
        // kontrol eder true yada flse döner

        System.out.println(isim.contains("az")); // küçük se true döner  AMA büyükse  folse olarak döner.

        // kullanıcıdan gün ismi isteyin
        // gün hafta sonu ise "tatil yapabilirsin yazdırın"
        // gün hafta içi isi "calisman lazım" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi girin: ");
        String gunIsmi = scanner.nextLine().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
            System.out.println("Tatil yapabilirsiniz!");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("çarşamba")
                || gunIsmi.equals("perşembe") || gunIsmi.equals("cuma")) {
            System.out.println("Çalışmanız lazım!");
        } else {
            System.out.println("Geçerli bir gün ismi girmediniz.");
        }




    }

}
