package hashmap;
//Creare un hashmap prendere tutti i valori, ordinarli e stamparli

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap2 {
    public static void main(String[] args) {
        //creo hashmap e aggiungo key, value
        HashMap<String, String> myHashmap = new HashMap<>();
        myHashmap.put("Sardegna", "Cagliari");
        myHashmap.put("Sicilia", "Palermo");
        myHashmap.put("Campania", "Napoli");
        myHashmap.put("Puglia", "Bari");
        System.out.println("Map prima di fare l'ordine:");
        printMap(myHashmap);

        System.out.println("-----------------------------");
        //creo TreeMap che mi permette di ordinare
        Map<String, String> myTreemap = new TreeMap<>(myHashmap);
        System.out.println("Map dopo aver fatto l'ordine:");
        printMap(myTreemap);
    }

    //metodo per stampare map
    public static void printMap(Map<String, String> myMap) {
        for (Map.Entry<String, String> keyvalue : myMap.entrySet()) {
            System.out.println(keyvalue);
        }
    }
}
