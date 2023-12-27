import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        // kullanıcıdan bir sayi alalım
        // sayini 3 ten büyük ve 8 den küçük oldugunu kontrol edip
        // ekrana çiktı olarak true yada false yazdıralım(sınırlar dahil)



        Scanner scanner = new Scanner(System.in);
        System.out.println("lÜTFEN BİR SAYI GİRİNİZ ");
        int sayi= scanner.nextInt();


        System.out.println(sayi >=3 && sayi <=8);


      Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1 = sc.nextInt();

        System.out.println(sayi >= 20 && sayi <= 40);
        System.out.println(sayi >=100 && sayi <=1000);









    }
}
