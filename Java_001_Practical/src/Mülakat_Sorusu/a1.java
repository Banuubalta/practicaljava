package Mülakat_Sorusu;

import java.util.*;

public class a1 {
    public static void main(String[] args) {

            int[] arr = {5,4,3,0,0,1,1,2,12,15,0,0,0,0,0};

            // yukarıdaki arrayi dogal düzene göre sıralayan bir method oluşturun

        System.out.println(Arrays.toString(dogalDuzen(arr)));

        }

        public static int[] dogalDuzen(int[] arr){

            Set<Integer> trSet = new TreeSet<>();

            for (int i = 0; i < arr.length; i++) {
                trSet.add(arr[i]);
            }

            List<Integer> list1 = new ArrayList<>();

            Iterator<Integer> it1 = trSet.iterator();

            while (it1.hasNext()){
                list1.add(it1.next());
            }

            int[] arr1 = new int[arr.length];

            int index=0;

            for (int i = 0; i < list1.size(); i++) {

                for (int j = 0; j < arr.length; j++) {

                    if (list1.get(i) == arr[j]){
                        arr1[index] = arr[j];
                        index++;
                    }
                }

            }

            return arr1;
        }









    }
