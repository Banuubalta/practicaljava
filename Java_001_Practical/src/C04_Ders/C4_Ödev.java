package C04_Ders;

import java.util.Scanner;

public class C4_Ödev {
    // soru-1 kullanıcıdan bir sayi isteyin
    // girilen sayi 3'ün ve 5'in katı olamadıgı sürece kullanıcıdan sayi isteyin


    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int girilenSayi =10;

            while (!(girilenSayi % 3==0 && girilenSayi % 5==0 )) {
                System.out.print("Bir sayı girin: ");
                girilenSayi = scanner.nextInt();

            }

        }


















    }






