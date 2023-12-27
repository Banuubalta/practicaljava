package C05_Ders;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
/*
        String[] ismler = {"aziz","banu","kübra","rabia"};

        for (int i = 0; i < ismler.length; i++) {
            System.out.println(ismler[i]);
        }

        int index = 0;

        while (index<ismler.length){
            System.out.println(ismler[index]);
            index++;
        }

        for(String isim : ismler){
            System.out.println(isim);
        }


 */
        // boolean bir sonuc dönderen bir method oluşturun
        // method String class'ındaki equals methodu gibi olsun
/*
            String str1 = "BANU";
            String str2 = "banu";

            boolean sonuç = customEquals(str1, str2);

            if (sonuç) {
                System.out.println("İki string eşittir.");
            } else {
                System.out.println("İki string eşit değildir.");
            }
        }

        public static boolean customEquals(String str1, String str2) {
            if (str1 == null || str2 == null) {
                return false;
            }

            return str1.equals(str2);


 */

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String girilenKelime1 = scn.nextLine();
        System.out.println("bir kelime gir");
        String girilenKelime2 = scn.nextLine();

        if (esitlik(girilenKelime1,girilenKelime2)){
            System.out.println("kelimeler aynı");
        }else {
            System.out.println("kelimeler farklı");
        }


    }

    public static boolean esitlik(String value1, String value2){
        int sonucKontrol = 0;
        if (value1.length() != value2.length()){

            return false;

        }else {
            for (int i = 0; i < value2.length(); i++) {

                if (value1.charAt(i) == value2.charAt(i)){
                    sonucKontrol++;
                }
            }

            if (sonucKontrol == value1.length()){
                return true;
            }else {
                return false;
            }
        }

    }




        }






