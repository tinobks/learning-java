package bigdecimal;
//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max)
//definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String [] args) {
        //imposto 2 BigDecimal
        BigDecimal big1 = BigDecimal.valueOf(3.4);
        BigDecimal big2 = BigDecimal.valueOf(3.8);

        //uso il metodo printBigOperazione dove all'interno uso anche operazioneBig
        printerBigOperazione(big1, big2, Operazione.MAX);
        System.out.println("-----------------------------------");
        printerBigOperazione(big1, big2, Operazione.MOLTIPLICAZIONE);
        System.out.println("-----------------------------------");
        printerBigOperazione(BigDecimal.valueOf(12.6), BigDecimal.valueOf(1.33), Operazione.SOTTRAZIONE);

    }

    //metodo per calcolare operazione richiesta
    public static BigDecimal operazioneBig(BigDecimal big1, BigDecimal big2, Operazione sceltaOperazione) {
        return switch (sceltaOperazione) {
            case ADDIZIONE -> big1.add(big2);
            case SOTTRAZIONE -> big1.subtract(big2);
            case MOLTIPLICAZIONE -> big1.multiply(big2);
            case DIVISIONE -> big1.divide(big2, RoundingMode.HALF_EVEN);
            case MAX -> big1.max(big2);
            case MIN -> big1.min(big2);
        };
    }

    //metodo per stampare a schermo l operazione, i due input e risultato
    public static void printerBigOperazione(BigDecimal big1, BigDecimal big2, Operazione sceltaOperazione) {
        System.out.println("Input 1: " + big1);
        System.out.println("Input 2: " + big2);
        System.out.println("Operazione: " + sceltaOperazione);
        System.out.println("Risultato: " + operazioneBig(big1, big2, sceltaOperazione));
    }
}
