package C02_Ders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         // kullanıcıdan yaşını isteyin
        // kullanıcının yaşı 65 ten büyükse emekli olabilirsin yazdırın
        // kullanıcın yaşı 65 ten küçükse emekli olmana şu kadar yıl kaldı yazdırın


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz ");
        int yas = sc.nextInt();

        if (yas >=65 ){
            System.out.println("Emekli oalbilirsiniz");
        }else {
            int kalanYil =65-yas;
            System.out.println("Emekli olmanıza " + kalanYil+ " Yıl kaldı") ;
        }











    }
}