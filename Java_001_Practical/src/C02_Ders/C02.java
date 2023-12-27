package C02_Ders;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

       // Soru:// kulanıcıdan bir sayi alın
        //        // sayi pozitif ise sayinin pozitf oldugunu yazdırın
        //        // sayi pozitifse tek mi yoksa çiftmi oldugunu yazdırın
        //        // sayi negatifse tekmi yoksa çift mi oldugunu yazdırın
        //        // sayi hem negatif hem de çift ise 10'un katı olup olmadınıgını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

       if (sayi >0) {
           System.out.println("Sayı pozitif");
           if (sayi %2 ==0 ){
               System.out.println("Sayı çifttir");
           }else {
               System.out.println("Sayı tektir");
           }
       }else {
           System.out.println("Sayı negatiftir");
           if (sayi % 2 ==0 ) {
               System.out.println("Sayı çiftir");
               if (sayi % 10 ==0 ){
                   System.out.println("Sayı 10 'nun katıdır.");
               }else {
                   System.out.println("Sayı 10 'nun katıdır.v ");
               }
           }else {
               System.out.println("Sayı tektir");
           }
       }




    }
}
