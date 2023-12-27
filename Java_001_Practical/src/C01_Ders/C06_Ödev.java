package C01_Ders;

import java.util.Scanner;

public class C06_Ödev {
    public static void main(String[] args) {

        // soru-1 kullanıcıdan bir sayi alin
        // sayinin negatif mi yoksa pozitif mi oldugunu yazdırın


        Scanner sc = new Scanner(System.in);   //obje
        System.out.println("Lütfen bir sayı girin ");
        int sayi = sc.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayı pozitif");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatif ");
        } else {
            System.out.println("Girilen sayı 0 'dır.");
        }

    }

    }

