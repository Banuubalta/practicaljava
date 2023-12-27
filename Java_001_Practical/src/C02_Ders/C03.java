package C02_Ders;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        // kullanıcıdan bir şehir ismi isteyin ( istanbul, adana, ankara, diyarbakır, hatay, sivas)
        // girilen şekir istanbul ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %15 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir adana ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %20 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir ankara ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %30 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir diyarbakır ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %10 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir hatay ise kullanıcıya otobüs kartınız var mı diye sorun
        // eğer otobüs kartı varsa %50 indirim yapın, yoksa yapmayın direkt fiyatı yazdırın
        // girilen şekir sivas ise kullanıcıya "sivasa gidilirmi lan" yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("bir shir ismi gir");
        String girilenSehir = scn.nextLine();
        int biletFiyati = 500;

        if(girilenSehir.equalsIgnoreCase("istanbul")){
            System.out.println("otabüs kartınız var mı? varsa evet yoksa yok yazın");
            String kart = scn.nextLine();

            if (kart.equalsIgnoreCase("evet")){
                System.out.println("indirimli fiyat : " + ((biletFiyati)-(biletFiyati*15)/100));
            }else {
                System.out.println("indirimsiz fiyat : " + biletFiyati);
            }

        } else if (girilenSehir.equalsIgnoreCase("adana")) {
            System.out.println("otabüs kartınız var mı? varsa evet yoksa yok yazın");
            String kart = scn.nextLine();

            if (kart.equalsIgnoreCase("evet")){
                System.out.println("indirimli fiyat : " + ((biletFiyati)-(biletFiyati*20)/100));
            }else {
                System.out.println("indirimsiz fiyat : " + biletFiyati);
            }

        } else if (girilenSehir.equalsIgnoreCase("ankara")) {

            System.out.println("otabüs kartınız var mı? varsa evet yoksa yok yazın");
            String kart = scn.nextLine();

            if (kart.equalsIgnoreCase("evet")){
                System.out.println("indirimli fiyat : " + ((biletFiyati)-(biletFiyati*30)/100));
            }else {
                System.out.println("indirimsiz fiyat : " + biletFiyati);
            }

        } else if (girilenSehir.equalsIgnoreCase("diyarbakır")) {

            System.out.println("otabüs kartınız var mı? varsa evet yoksa yok yazın");
            String kart = scn.nextLine();

            if (kart.equalsIgnoreCase("evet")){
                System.out.println("indirimli fiyat : " + ((biletFiyati)-(biletFiyati*10)/100));
            }else {
                System.out.println("indirimsiz fiyat : " + biletFiyati);
            }

        } else if (girilenSehir.equalsIgnoreCase("hatay")) {

            System.out.println("otabüs kartınız var mı? varsa evet yoksa yok yazın");
            String kart = scn.nextLine();

            if (kart.equalsIgnoreCase("evet")){
                System.out.println("indirimli fiyat : " + ((biletFiyati)-(biletFiyati*50)/100));
            }else {
                System.out.println("indirimsiz fiyat : " + biletFiyati);
            }

        } else if (girilenSehir.equalsIgnoreCase("sivas")) {

            System.out.println("sivasa gidilir mi");

        }











    }
}
