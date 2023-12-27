package C01_Ders;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {


        // bu sayilar arrayyini kullanarak
        // birleri ve sıfırları ayırıp bunları yeni bir arrey in içine atın
        // method oluşturun yazdırın
        // output : [0,0,0,0]
        // output . [1,1,1,1]


        int [] sayilar = {0,1,0,1,0,1,0,1};

        int[] sifirlar = ayirVeYazdir(sayilar, 0);
        int[] birler = ayirVeYazdir(sayilar, 1);

        System.out.println("Output 0: " +   Arrays.toString(sifirlar));
        System.out.println("Output 1: " + Arrays.toString(birler));
    }

    static int[] ayirVeYazdir(int[] dizi, int hedefSayi) {
        int[] yeniDizi = new int[dizi.length];
        int index = 0;

        for (int sayi : dizi) {
            if (sayi == hedefSayi) {
                yeniDizi[index++] = sayi;
            }
        }

        return Arrays.copyOfRange(yeniDizi, 0, index);
    }
}



