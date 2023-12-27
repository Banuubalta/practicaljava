package Operatörler_IfElse;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        // Kullanıcıdan kelimeyi almak için bir Scanner oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelimeyi alın
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        // Kelimenin ilk harfini kontrol edin
        char ilkHarf = kelime.charAt(0);

        // Büyük harfle başlıyorsa
        if (Character.isUpperCase(ilkHarf)) {
            System.out.println("Kelime büyük harfle başlıyor.");
        }
        // Küçük harfle başlıyorsa
        else if (Character.isLowerCase(ilkHarf)) {
            System.out.println("Kelime küçük harfle başlıyor.");
        }
        // Harf değilse
        else {
            System.out.println("Geçersiz giriş. Lütfen bir harfle başlayan bir kelime girin.");
        }

        // Scanner'ı kapatın
        scanner.close();
    }
}
