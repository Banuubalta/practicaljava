package C01_Ders;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05 {
    public static void main(String[] args) {


        int[] sayilar = {0,1,0,1,0,1,0,1,0,0,0,0};

        // bu sayilar array'ini kullanarak
        // 1'leri ve sıfırları ayırıp bunları yeni bir arrayin içine atın
        // method olusturun yazdıran
        // output : [0,0,0,0]
        // output : [1,1,1,1]

        arrayiBol(sayilar);

    }

    public static void arrayiBol(int[] array){

        int sifirAdedi = 0;
        int birlerAdedi = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0){
                sifirAdedi++;
            }

            if (array[i]==1){
                birlerAdedi++;
            }
        }

        int[] sifirlar = new int[sifirAdedi];
        int[] birler = new int[birlerAdedi];

        int index1=0;
        int index2=0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0){
                sifirlar[index1] = array[i];
                index1++;
            }
            if (array[i] == 1){
                birler[index2] = array[i];
                index2++;
            }

        }

        System.out.println(Arrays.toString(sifirlar));
        System.out.println(Arrays.toString(birler));

    }




    }

