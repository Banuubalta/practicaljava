package C01_Ders;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {

        // soru-6 kullanıcıdan bir şifre girmesini isteyin
        // şifrenin ilk harfi küçükse şifre küçük harfle başlamaz yazdırın
        // şifrenin son karakteri rakam değilse son karakter rakam olmalı diyin

        Scanner sc = new Scanner(System.in);
        System.out.println("Şifre gir ");
        String girilenSifre = sc.nextLine();

        if (girilenSifre.charAt(0) >= 'a' && girilenSifre.charAt(0) <= 'z');
        System.out.println("şifre küçük harfle başlamaz");
        if (girilenSifre.charAt(girilenSifre.length()-1) >= '0' && girilenSifre.charAt(girilenSifre.length()-1 ) <= '9'){

        }else {
            System.out.println("Son karakter rakam olmalı ");
        }




    }
}
