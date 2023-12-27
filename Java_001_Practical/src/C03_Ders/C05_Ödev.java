package C03_Ders;

import java.util.Scanner;

public class C05_Ödev {
    public static void main(String[] args) {




        // soru-5 kullanıcıdan uzunlugu farklı olan iki kelime alın
        // bu iki kelimede aynı olan harfleri ve harflerin adedini yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String girilenKelime1 = scn.nextLine();
        System.out.println("daha kısa bir kelime gir");
        String girilenKelime2 = scn.nextLine();

        int harfAdedi = 0;

        for (int i = 0; i <girilenKelime2.length() ; i++) {

            if (girilenKelime1.charAt(i) == girilenKelime2.charAt(i)){
                System.out.println(girilenKelime1.charAt(i));
                System.out.println(girilenKelime2.charAt(i));
                harfAdedi++;
            }

        }

        System.out.println("harf adedi : " +harfAdedi);
    }
}
