package C02_Ders;

import java.util.Scanner;

public class Ödev3 {
    public static void main(String[] args) {


        // soru-3 kullanıcıdan 5 adet şehir adı grimesini isteyin
        // girilen şehirlerden "S" harfi ile başlayan şehileri yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String girilenKelime = scn.nextLine();
        System.out.println("bir harf gir");
        char girilenHarf = scn.next().charAt(0);

        if (girilenKelime.contains(""+girilenHarf)){

            if (girilenHarf >= 'a' && girilenHarf <= 'z'){
                System.out.println("içeriyor : " +(""+girilenHarf).toUpperCase());
            }else {
                System.out.println("içeriyor : " +(""+girilenHarf).toLowerCase());
            }
        }



    }
}
