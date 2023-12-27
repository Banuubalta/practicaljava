package C04_Ders;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {

        // kullanıcıdan bir sayi alın
        // kullanıcının girdiği sayi 22 olmadığı sürece kullanıcıdan tekrardan sayı isteyin


        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.print("Bir sayı girin: ");
            int  girilenSayi = scanner.nextInt();
            if (girilenSayi == 22){
                break;
            }

        }

          while (true){
              System.out.println("Bir sayı girin ");
              int girilenSayı1 =scanner.nextInt();
              if (girilenSayı1 == 40 ){
                  break;
              }
          }






            }
}








