package bigdecimal;
//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max)
//definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperazioneBD {
    public static BigDecimal operazioneBD(BigDecimal big1, BigDecimal big2, OperazioneEnum operazione) {
        return switch (operazione) {
            case ADDIZIONE -> addizione(big1, big2);
            case SOTTRAZIONE -> sottrazione(big1, big2);
            case MOLTIPLICAZIONE -> moltiplicazione(big1, big2);
            case DIVISIONE -> divisione(big1, big2);
            case MAX -> max(big1, big2);
            case MIN -> min(big1, big2);
        };
    }

    public static BigDecimal addizione(BigDecimal big1, BigDecimal big2) {
        return big1.add(big2);
    }

    public static BigDecimal sottrazione(BigDecimal big1, BigDecimal big2) {
        return big1.subtract(big2);
    }

    public static BigDecimal moltiplicazione(BigDecimal big1, BigDecimal big2) {
        return big1.multiply(big2);
    }

    public static BigDecimal divisione(BigDecimal big1, BigDecimal big2) {
        return big1.divide(big2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal max(BigDecimal big1, BigDecimal big2) {
        return big1.max(big2);
    }

    public static BigDecimal min(BigDecimal big1, BigDecimal big2) {
        return big1.min(big2);
    }
}
