import java.time.OffsetDateTime;
import java.util.ArrayList;

////La classe TodoList dovrebbe gestire una lista di compiti. Deve fornire le seguenti funzionalità:
////Aggiungere un nuovo compito alla lista.
////Rimuovere un compito dalla lista.
////Visualizzare l'elenco completo dei compiti.
////Contrassegnare un compito specifico della lista come completato.
public class ToDoList {
    private ArrayList<Task> compiti;

    public ToDoList(ArrayList<Task> compiti) {
        this.compiti = compiti;
    }

    public ArrayList<Task> getCompiti() {
        return compiti;
    }

    public void setCompiti(ArrayList<Task> compiti) {
        this.compiti = compiti;
    }

    public void aggiungiCompito(Task compito) {
        if (!compiti.contains(compito)) {
            compiti.add(compito);
        }
    }

    public void rimuoviCompito(Task compito) {
        compiti.remove(compito);
    }

    public boolean contrassegno(Task compito) {
        for (Task compitoSingolo : compiti) {
            if (compitoSingolo.equals(compito)) {
                return compitoSingolo.setCompleted(true);
            }
        }
        return false;
    }

    public void visualizza() {
        for (Task compito : compiti) {
            System.out.println(compito);
        }
    }

    ////Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico.
    public ArrayList<Task> ricerca(boolean value) {
        ArrayList<Task> taskFiltrati = new ArrayList<>();
        for (Task compito : compiti) {
            if (compito.isCompleted() == value) {
                taskFiltrati.add(compito);
            }
        }
        return taskFiltrati;
    }

    //Visualizzare i compiti che rientrano in un range di 2 giorni a partire dalla data odierna formattando la data in un formato leggibile per l’utente.
    public ArrayList<Task> visualizzaCompiti(OffsetDateTime start, OffsetDateTime end) {
        ArrayList<Task> taskFiltrati = new ArrayList<>();
        for (Task compito : compiti) {
             if (compito.getExpiration().isAfter(start) && compito.getExpiration().isBefore(end)) {
                 taskFiltrati.add(compito);
            }
        }
        return taskFiltrati;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "compiti=" + compiti +
                '}';
    }
}
