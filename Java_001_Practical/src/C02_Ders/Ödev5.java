package C02_Ders;

import java.util.Scanner;

public class Ödev5 {
    public static void main(String[] args) {

        // soru-5 kullanıcıdan bir şifre girmesini isteyin
        // kullanıcının girdigi şifre büyük harle başlamıyorsa "şifre büyük harfle başlar" yazdırın
        // kullanıcının girdiği şifre boşluk içeriyorsa "şifre boşluk içermemeli" yazdırın
        // kullanıcının girdiği şifre "." içermiyorsa "şifre nokta içermeli" yazdırın
        // kullanıcının girdiği şifrenin son karakteri rakam değilse "şifrenin son karakteri rakam olmalı" yazdırın
        // kullanıcın girdiği şifre bütün koşulları sağlıyorsa "şifreniz başarılı bir şekilde oluşturuldu" yazdırın


        Scanner scn = new Scanner(System.in);
        System.out.println("şifre gir");
        String girilenSifre = scn.nextLine();

        int sonucKontrol = 0;

        if (!(girilenSifre.charAt(0) >= 'A' && girilenSifre.charAt(0)<='Z')){

            System.out.println("şifre büyük harfle başlamalı");
        }else {
            sonucKontrol++;
        }

        if (girilenSifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
        }else {
            sonucKontrol++;
        }

        if (!girilenSifre.contains(".")){
            System.out.println("şifre nokta içermeli");
        }else {
            sonucKontrol++;
        }

        if (!(girilenSifre.charAt(girilenSifre.length()-1) >='0' && girilenSifre.charAt(girilenSifre.length()-1) <='9')){
            System.out.println("şifrenin son karakteri rakam olmalı");
        }else {
            sonucKontrol++;
        }

        if (sonucKontrol == 4){
            System.out.println("şifre başarılı bir şekilde kaydedildi");
        }else {
            System.out.println("şifre kaydedilemedi");
        }












    }
}
