package C04_Ders;

public class C8_Ödev {

    //soru-5 String sehirler = {"sivas","Sakarya",istanbul,"adana","Samsun","diyarbakır,"sinop";
    // yukarıdaki sehirler array'inden "s" harfiyle başlayan şehirleri while loop kullanarak ekrana yazdırın
    // (mülakat sorudur)
    public static void main(String[] args) {




        String[] sehirler = {"sivas","Sakarya","istanbul","adana","Samsun","diyarbakır","sinop"};


        int i = 0;

        while ( i < sehirler.length) {

            if (sehirler[i].charAt(0) == 's' || sehirler[i].charAt(0) == 'S'){
                System.out.println(sehirler[i]);
            }
            i++;
        }













    }
}
