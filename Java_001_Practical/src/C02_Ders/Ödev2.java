package C02_Ders;

import java.util.Scanner;

public class Ödev2 {
    public static void main(String[] args) {

         // soru-2 kullanıcıdan bir sayi alın
        // sayi 3'ün katı mı diye kontrol edin
        // sayi 3'ün katıysa 5'in katı mı diye de kontrol edin
        // sayi 5'in katıysa 10'un katı mı diye de kontrol edin


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz ");
        int sayi =scanner.nextInt();

        if (sayi % 3 == 0 ) {
            System.out.println("Sayı 3 'ün katı ");

        }






    }
}
