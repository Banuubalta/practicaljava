package C01_Ders;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        // kullanıcıdan bir kelime alın
        // kelime büyük harfle başlıyorsa konsola kelime büyük harfle başlıyor yazdırın
        // kelime küçük harfle başlıyorsa konsola kelime küçük harfle başlıyor yazdırın


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin ");
        String girilenKelime = sc.nextLine();


        if (girilenKelime.charAt(0)>= 'a' && girilenKelime.charAt(0) <= 'z'){
            System.out.println("kelime kucuk harfle basliyor");
        }
        if(girilenKelime.charAt(0) >= 'A' && girilenKelime.charAt(0) <= 'Z'){

            System.out.println("kelime buyuk harfle basliyor");
        }

        }






    }

