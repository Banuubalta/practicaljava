import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen şehir giriniz :");

        String sehir=scanner.nextLine();

        System.out.println("Otobus katınız varmı Evet : E  Hayır : H");
        char kart=scanner.next().charAt(0);


        if (kart=='E'){

            if (sehir.equalsIgnoreCase("İstanbul")){
                System.out.println("%15 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Adana")) {
                System.out.println("%20 indirim yapıldı");

            }else if (sehir.equalsIgnoreCase("Ankara")){
                System.out.println("%30 indirim yapıldı ");
            } else if (sehir.equalsIgnoreCase("Diyarbakır")) {
                System.out.println("%10 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Hatay")) {
                System.out.println("%50 indirim yapıldı");
            } else if (sehir.equalsIgnoreCase("Sivas")) {
                System.out.println("Sivasa gilirmi lan");
            }


        } else if (kart=='H') {

            if (sehir.equalsIgnoreCase("İstanbul")){
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Adana")) {
                System.out.println("Standart fiyat");

            }else if (sehir.equalsIgnoreCase("Ankara")){
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Diyarbakır")) {
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Hatay")) {
                System.out.println("Standart fiyat");
            } else if (sehir.equalsIgnoreCase("Sivas")) {
                System.out.println("Sivas a Gidilirmi Lan");
            }

        }else {
            System.out.println("Yanlış Giriş Yaptınız");
        }




    }
}
