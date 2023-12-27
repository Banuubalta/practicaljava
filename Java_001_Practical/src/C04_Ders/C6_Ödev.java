package C04_Ders;

import java.util.Scanner;

public class C6_Ödev {
    // soru-3 kullanıcıdan gün ismi isteyin
    // kullanıcı gün ismi girmezse "gün ismi girin" deyip tekrardan gün ismi isteyin
    // kullanıcı gün ismi girerse calismayi durdurun
    public static void main(String[] args) {



        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("bir gün ismi giriniz");
            String girilenGun = scn.nextLine();

            boolean sonuc = girilenGun.equalsIgnoreCase("pazartesi") ||
                    girilenGun.equalsIgnoreCase("salı") ||
                    girilenGun.equalsIgnoreCase("çarşamba") ||
                    girilenGun.equalsIgnoreCase("perşembe") ||
                    girilenGun.equalsIgnoreCase("cuma")||
                    girilenGun.equalsIgnoreCase("cumartesi")||
                    girilenGun.equalsIgnoreCase("pazar");

            if (sonuc){
                break;
            }

        }









    }
}
