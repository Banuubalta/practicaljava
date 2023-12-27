package C01_Ders;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        // soru-4 kullanıcıdan vize notunu girmesini isteyin
        // kullanıcıdan final notunu girmesini isteyin
        // vize ve final notlarının ortalaması ((vize+final)/2) 50 den büyükse geçtin
        // 50 den küçükse kaldın deyin


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu  girin ");
        double vizeNotu = sc.nextInt();
        double finalNotu = sc.nextInt();
        System.out.println("Final notunuzu  girin ");

        double ortalama = ((vizeNotu + finalNotu) / 2 );
        if (ortalama >=50 ) {
            System.out.println("Geçtiniz");
        }else {
            System.out.println("Kaldınız");
        }











    }
}
