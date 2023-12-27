package C01_Ders;

import java.util.Scanner;

public class C07_Ödev {
    public static void main(String[] args) {


       // soru-2 kullanıcıdan yaşını isteyin
        // yaşı 18 den küçükse ehliyet alamazsınız yazdırın
        // yaşı 18 den büyükse ehliyet alablirsiniz yazdırın


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı  girin ");
        int yas = sc.nextInt();

        if (yas <18 ){
            System.out.println("Ehliyet Alamazsınız ");
        }else {
            System.out.println("Ehliyet Alabilirsiniz");
        }












    }
}
