package C03_Ders;

import java.util.Scanner;

public class C06_Ödev {
    public static void main(String[] args) {



        // soru-4 kullanıcıdan uzunluğu aynı olan iki kelime alın
        // bu iki kelimede de aynı olan harfleri yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String girilenKelime1 = scn.nextLine();
        System.out.println("bir kelime gir");
        String girilenKelime2 = scn.nextLine();

        for (int i = 0; i < girilenKelime1.length(); i++) {

            if (girilenKelime1.charAt(i) == girilenKelime2.charAt(i)){
                System.out.println(girilenKelime1.charAt(i));
                System.out.println(girilenKelime2.charAt(i));
            }

        }












        }}








