package C04_Ders;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
         // kullanıcıdan bir şifre alın
        // girilen şifre küçük harfle başlamalı
        // girilen şifre boşluk içermemeli
        // girilen şifre nokta içermeli
        // girilen şifrenin son karakteri rakam olmalı
        // eğer bütün şartlar sağlanırsa şifre başarıyla kaydedildi yazdırın
        // eğer şartlardan biri bile sağlanmazsa tekrardan şifre isteyin

        Scanner scn = new Scanner(System.in);
        int sonucKontrol = 0;

        while (true){
            System.out.println("Lütfen şifre giriniz");
            String girilenSifre = scn.nextLine();
            if (girilenSifre.charAt(0) >= 'a' && girilenSifre.charAt(0) <='z'){
                sonucKontrol++;
            }
            if (!(girilenSifre.contains(" "))){
                sonucKontrol++;
            }
            if (girilenSifre.contains(".")){
                sonucKontrol++;
            }
            if (girilenSifre.charAt(girilenSifre.length()-1)>= '0' && girilenSifre.charAt(girilenSifre.length()-1) <='9'){
                sonucKontrol++;
            }
            if (sonucKontrol == 4){
                System.out.println("şifre başarıyla kaydedildi");
                break;
            }
            sonucKontrol = 0;
        }







    }
}
