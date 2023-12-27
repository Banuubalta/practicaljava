package C04_Ders;

import java.util.Scanner;

public class C7_Ödev {

     // soru-4 kullanıcıdan bir ay ismi isteyin
    // kullanıcı yaz aylarından birini girmedigi sürece ekrana "tatil yapmak istiyorum" yazdırın
    // kullanıcı yaz aylarından birini girerse "tatil yapabilirim" yazdırıp programı sonlandırın
     public static void main(String[] args) {


          Scanner scn = new Scanner(System.in);

          while (true){
               System.out.println("bir ay giriniz");
               String girileAy = scn.nextLine();

               boolean sonuc = girileAy.equalsIgnoreCase("haziran") ||
                       girileAy.equalsIgnoreCase("temmuz") ||
                       girileAy.equalsIgnoreCase("ağustos");

               if (sonuc){

                    System.out.println("tatil yapabilirsin");
                    break;

               }else {
                    System.out.println("tatil yapmak istiyorum");
               }

          }








     }

}
