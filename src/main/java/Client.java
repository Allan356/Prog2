import java.util.Date;

public class Client {
    private String nom;
    private String prenom;
    private Date date;
    private String adresse;
    private String adresseMail;
    private String telephone;

    public Client(String nom, String prenom, Date date, String adresse, String adresseMail, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adresse = adresse;
        this.adresseMail = adresseMail;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate() {
        return date;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String getTelephone() {
        return telephone;
    }
}
