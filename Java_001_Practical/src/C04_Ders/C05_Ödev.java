package C04_Ders;

import java.util.Scanner;

public class C05_Ödev {

    // soru-2 kullancıdan bir kelime alın
    // kullanıcıdan bir harf alın
    // kullanıcıdan aldığınız kelime kullanıcıdan aldığınız harfi içermiyorsa tekrardan harf isteyin
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("litfen bir kelime girin");
        String girilenKelime = scn.nextLine();
        char girilenHarf= '*';

        while (true){
            System.out.println("harf girin");
            girilenHarf = scn.next().charAt(0);

            if (girilenKelime.contains(""+girilenHarf)){
                break;
            }
        }



    }
}
