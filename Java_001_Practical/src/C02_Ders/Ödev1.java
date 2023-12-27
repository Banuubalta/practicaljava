package C02_Ders;

import java.util.Scanner;

public class Ödev1 {
    public static void main(String[] args) {

        // soru-1 kullanıcıdan bir sayi alın
        // sayi çift mi yok sa tek mi diye kontrol edin
        // sayi çift ise 20'nin katı olup olmadıgını kontrol edin
        // sayi tek ise 3'ün katı olup olmadıgını kontrol edin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz ");
        int sayi =scanner.nextInt();

        if (sayi % 2 == 0 ){
            System.out.println("sayi çiftir");

        } if (sayi % 20 == 0 ) {
            System.out.println("Sayı 20 nin katı");

        }else if (sayi % 2==1 ) {
            System.out.println("sayı tektir");

        }if (sayi % 3 == 0){
            System.out.println("Sayı 3 ün katı ");

        }else{
            System.out.println("Yanlış giriş");
        }


    }
}
