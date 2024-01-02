import java.time.OffsetDateTime;

////La classe Task dovrebbe rappresentare un singolo compito.
////Ogni compito ha una descrizione una scadenza e uno stato che indica se è stato completato o meno.
////La classe dovrebbe avere i seguenti attributi privati:
////description: la descrizione del compito.
////completed: uno stato che indica se il compito è stato completato o meno.
////expiration: rappresenta la scadenza prefissata per quel compito.
////La classe dovrebbe avere un costruttore che accetta la descrizione del compito, la scadenza e il valore di completato.
////Deve fornire metodi pubblici (getter e setter) per tutti i parametri definiti.
public class Task {
    private String description;
    private boolean completed;
    private OffsetDateTime expiration;

    public Task(String description, boolean completed, OffsetDateTime expiration) {
        this.description = description;
        this.completed = completed;
        this.expiration = expiration;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public boolean setCompleted(boolean completed) {
        this.completed = completed;
        return completed;
    }

    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                ", expiration=" + expiration +
                '}';
    }
}
