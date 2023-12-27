package C02_Ders;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        // kullanıcıdan gün ismi isteyin
        // gün hafta sonu ise "tatil yapabilirsin yazdırın"
        // gün hafta içi isi "calisman lazım" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi girin: ");
        String gunIsmi = scanner.nextLine().toLowerCase();


        switch (gunIsmi) {
            case "pazartesi":
                break;
            case "sali":
                break;
            case "carsamba":
                break;
            case "persembe":
                break;
            case "cuma":
                System.out.println("Çalışman lazım ");
                break;
            case "cumartesi":
                break;
            case "pazar":
                System.out.println("Tatil yapabilirsin");
                break;
            default:
                System.out.println("Lütfen geçerli gün giriniz");
        }




    }
}
