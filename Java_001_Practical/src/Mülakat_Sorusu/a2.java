package Mülakat_Sorusu;

public class a2 {
    public static void main(String[] args) {

        // == false dönerken equals methodu neden true döndü

        String str1 = "java";
        String str2 = "java";

        String str3 = new String("java");

        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str1); // false

        System.out.println("--------------------------------");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals(str1)); // true

        /*
        == hem kelimeyi hem de referansı kontrol ettiği için ve bunlardan biri bile farklıysa false döner
        .equals() methodu sadece kelimeyi kontrol eder, referansa bakmaz, o yüzden iki kelime de aynıysa
        true döner. iki kelimenin nasıl oluştuğunu yani referanslarını önemsemez
         */







    }
}
