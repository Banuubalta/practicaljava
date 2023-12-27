package C01_Ders;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {


         // soru-5 kullanıcıdan 3 sayi alın
        // girilen üç sayıdan en büyüğünü yazdırın


        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz ");
        System.out.println("İkinci sayıyı giriniz");
        System.out.println("Üçüncü sayıyı giriniz ");
        int sayi1 =sc.nextInt();
        int sayi2 = sc.nextInt();
        int sayi3 = sc.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk)
        {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk)
        {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);




    }
}
