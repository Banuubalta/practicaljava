package C05_Ders;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {

        // kullanıcıdan iki kelime alıp bunları ekrana büyüterek yazdıran bir  method oluşturun

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String girilenKelkime1 = scn.nextLine();
        System.out.println("bir kelime girin");
        String girilenKelkime2 = scn.nextLine();

        String a = ikiKelimeyiBuyut(girilenKelkime1,girilenKelkime2);

        System.out.println(a);

    }

    public static String ikiKelimeyiBuyut(String kelime1, String kelime2){
        String buyuk1 = kelime1.toUpperCase();
        String buyuk2 = kelime2.toUpperCase();

        String sonuc = buyuk1 + " " + buyuk2;



        return sonuc;

    }

    }


