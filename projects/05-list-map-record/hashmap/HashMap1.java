package hashmap;
//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
//non mi andava e non mi hanno fixato il video sulla piattaforma quindi mi sono cercato diversi metodi online

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMap1 {
    public static void main(String[] args) {
        //creo hashmap usando il Map.of()
        Map<String, String> mapJava9 = Map.of("Inghilterra","Londra", "Francia","Parigi", "Italia", "Roma");
        System.out.println("HashMap usando Map.of(): " + mapJava9);

        //creo hashmap usando il metodo classico
        HashMap<String, String> mapClassic = new HashMap<>();
        mapClassic.put("Nome", "Tino");
        mapClassic.put("Cognome", "Bokoshev");
        mapClassic.put("ID", "BKSTNR1234");
        System.out.println("HashMap usando il metodo classico: " + mapClassic);

        //creo hashmap usando Collectors.toMap()
        Map<String, String> collectorsMap = Stream.of(new String[][] {
            { "Paese", "Italia" },
            { "Regione", "Sardegna" },
            { "Citta", "Cagliari" },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println("HashMap usando il metodo Collectors.toMap(): " + collectorsMap);
    }
}
