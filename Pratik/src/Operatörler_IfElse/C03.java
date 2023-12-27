package Operatörler_IfElse;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        // kullanıcıdan bir kelime alın
        // kelime büyük harfle başlıyorsa konsola kelime büyük harfle başlıyor yazdırın
        // kelime küçük harfle başlıyorsa konsola kelime küçük harfle başlıyor yazdırın
        // Harf değilse

      /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin ");
        String girilenKelime = sc.nextLine();


        if (girilenKelime.charAt(0)>= 'a' && girilenKelime.charAt(0) <= 'z'){
            System.out.println("kelime kucuk harfle basliyor");
        }
        if(girilenKelime.charAt(0) >= 'A' && girilenKelime.charAt(0) <= 'Z'){

            System.out.println("kelime buyuk harfle basliyor");




        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String girilemHarf = sc.nextLine();

        if (girilemHarf.charAt(0) >= 'A' && girilemHarf.charAt(0) <= 'Z') {
            System.out.println("Büyük harf ile başlıyor");
        }

        if (girilemHarf.charAt(0) >= 'a' && girilemHarf.charAt(0) <= 'z') {
            System.out.println("Küçük harf ile başlıyor ");
        }

   */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz ");
        String girilenKelime =sc.next();


        if (girilenKelime.charAt(0) >= 'A' && girilenKelime.charAt(0) <= 'Z' ) {
            System.out.println("Büyük harf ile başlıyor");
        }

        if (girilenKelime.charAt(0) >= 'a' && girilenKelime.charAt(0) <= 'z') {
            System.out.println("Küçük harf ile başlıyor");
        }




        }

        }








