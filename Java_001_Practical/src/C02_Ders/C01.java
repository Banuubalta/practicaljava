package C02_Ders;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
         //kulanıcıdan bir sayi alın
        // sayi pozitif ise sayinin pozitf oldugunu yazdırın
        // sayi pozitifse tek mi yoksa çiftmi oldugunu yazdırın
         //sayi negatifse tekmi yoksa çift mi oldugunu yazdırın
        // sayi hem negatif hem de çift ise 10'un katı olup olmadınıgını yazdırın

        // not : Birbirine kayıtlı koşul var ise if else kullanıcam


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı pozitif.");   // pozitif olduğunu yazdırdım

            if (sayi % 2 == 0) {
                System.out.println("Sayı çift."); // sayı tek mi ? çift mi ?
            } else {
                System.out.println("Sayı tek.");
            }
        } else if (sayi < 0) {
            System.out.println("Sayı negatif.");

            if (sayi % 2 == 0) {
                System.out.println("Sayı çift.");

                if (sayi % 10 == 0) {
                    System.out.println("Sayı 10'un katı.");
                } else {
                    System.out.println("Sayı 10'un katı değil.");
                }
            } else {
                System.out.println("Sayı tek.");
            }
        } else {
            System.out.println("Sayı sıfır.");
        }






    }
}
