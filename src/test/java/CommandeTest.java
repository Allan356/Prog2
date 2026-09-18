import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandeTest {
    private Vetement vetement1;
    private Vetement vetement2;
    private Vetement vetement3;
    private Vetement vetement4;

    private Commande commande1;
    private Commande commande2;

    private Client client1;
    private Client client2;
    @BeforeEach
    void setUp() {
        vetement1 = new Vetement("Nike",15.50);
        vetement2 = new Vetement("Addidas",20.50);
        vetement3 = new Vetement("Nike",25.50);
        vetement4 = new Vetement("Addidas", 55.25);

        commande1 = new Commande(client1,0,"Taille L , Coton , Haut et bas",4);
        commande2 = new Commande(client2,03, "Taille Xl , autre , Bas et haut",2);

        client1 = new Client("Jean", "Jack", 15,"Lion ","jack@gmail.com","0348459103");
        client2 = new Client("Marie", "Dave", 29, "Paris", "Dave@gmail.com",012345698);
    }

    @Test
    void coutTotal() {
        commande1.add(vetement1);
        commande1.add(vetement2);

        assertEquals(36,coutTotal().size());

    }
}