package be.digitalcity.java.exo.oo.banque;

import java.util.ArrayList;
import java.util.List;

public class Banque {

    private List<Compte> comptes = new ArrayList<Compte>();

    private String nom;

    public Banque(String nom) {
        this.nom = nom;
    }

    public void addCompte(Compte compte) {
        comptes.add(compte);
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    private void passageEnNegatifAction(Compte compte) {
        System.out.println("Le compte numero " + compte.getNumero() +
                " de la banque " + nom + " viens de passer en negatif!!!");
    }
}
