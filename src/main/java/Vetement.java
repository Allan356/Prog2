public class Vetement {
 private String nom;
 private double prix;
 private enum taille {
     XS,S,M,L,XL,XXL
 }
 private enum materiel{
     COTON, NYLON, AUTRE
 }
 private enum type {
     HAUT, BAS
 }

    public Vetement(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }



}
