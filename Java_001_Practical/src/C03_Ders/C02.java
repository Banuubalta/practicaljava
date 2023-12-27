package C03_Ders;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {


        // kullanıcıdan iki adet uzunlugu aynı kelime alın
        // iki adet kelimeyi ilk harften başlayarak son harfe kadar karşılaştırın
        // eger tüm harfler eşitse ekrana true yazdırın, değilse false yazdırın

        /*
            1- kullanıcıdan iki kelime al
            2- birinci kelimenin harflerini tek tek al
            3- ikinci kelimenin harflerini tek tek al
            4- yulkarıdaki iki adımı aynı anda yap
            5- bu iki adım gerçekleşirken aynı zamanda bir karşılaştırma yap
            6- boolean bir variable olustur
            7- karşılaştırmadan elde edilen sonu boolean variable ata
            8- bu variable'i yazdır

         */

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime1 = scn.nextLine();
        System.out.println("bir kelime gir");
        String kelime2 = scn.nextLine();


        boolean sonuc = false;

        int sonucKonrol = 0;

        for (int i = 0; i <kelime1.length(); i++) {

            if (kelime1.charAt(i) == kelime2.charAt(i)){
                sonucKonrol++;
            }else {
                sonuc = false;
            }

        }

        if (sonucKonrol == kelime1.length()){
            sonuc = true;
        }


        System.out.println(sonuc);



    }

            }

