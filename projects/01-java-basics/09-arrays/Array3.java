/*Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi
duplicati in un array di interi. L'array ottenuto dovrà essere stampato a video.*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Array3 {
    public static Object[] noDuplicates(int[] myArray) {
        List<Integer> myList = new ArrayList<>();

        for (int num : myArray) {
            //se la lista che ho creato NON contiene il numero di myArray allora viene aggiunto nella lista.
            if (!myList.contains(num)) {
                myList.add(num);
            }
        }

        return myList.toArray();
    }

    public static void main(String[] args) {
        int[] ArrayDuplicate = {1,9,7,11,7,9,7,2,8,10,2};
        System.out.println(Arrays.toString(noDuplicates(ArrayDuplicate)));
    }
}
