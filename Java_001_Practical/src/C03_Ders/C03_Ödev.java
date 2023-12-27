package C03_Ders;

import java.util.Scanner;

public class C03_Ödev {
    public static void main(String[] args) {


// soru-1 kullanıcıdan bir kelime alın
        // aldığınız kelimeyi tersten yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String girilenKelime = scn.nextLine();


        String tersMetin = "";

        for (int i = girilenKelime.length()-1; i >=0 ; i--) {

            tersMetin += girilenKelime.charAt(i);

        }

        System.out.println(tersMetin);





    }
}



