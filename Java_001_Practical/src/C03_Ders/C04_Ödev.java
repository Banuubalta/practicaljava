package C03_Ders;

import java.util.Scanner;

public class C04_Ödev {
    public static void main(String[] args) {


        // soru-2 kullanıcıdan bir baslangıc ve bitis degeri alın
        // baslangic ve bitis degeri arasında olan sayılardan
        // 3'e ve 5'e bölünemeyen sayıları, bu sayıların toplamını ve bu sayıların adedini yazdırın

        Scanner scn = new Scanner(System.in);
        System.out.println("baslangic degeri gir");
        int baslangicDegeri = scn.nextInt();
        System.out.println("bitis degeri gir");
        int bitisDegeri = scn.nextInt();

        int sayilarinToplami = 0;
        int sayac = 0;

        for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {

            if (i%3==0 && i%5==0){

            }else {
                System.out.println(i);
                sayilarinToplami += i;
                sayac++;
            }
        }

        System.out.println("SAyilarin toplami : " + sayilarinToplami);
        System.out.println("sayiların adedi : " + sayac);









        }}

