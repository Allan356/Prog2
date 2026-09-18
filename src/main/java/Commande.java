import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Commande {
    private Client client;
    private LocalDate date;
    private String description;
    private ArrayList<Vetement> vetementCommande;
    private int quantiter;

    public Commande(Client client, LocalDate date, String description, int quantiter) {
        this.client = client;
        this.date = date;
        this.description = description;
        this.quantiter = quantiter;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList getVetementCommande() {
        return vetementCommande;
    }

    public double getQuantiter() {
        return quantiter;
    }

    public double coutTotal() {
        int coutTotal = 0;
        for  (Vetement vetement : vetementCommande) {
            coutTotal += vetement.getPrix();
        }
        return coutTotal;
    }
}
