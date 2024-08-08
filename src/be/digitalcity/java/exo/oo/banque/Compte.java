package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Compte implements Banker {
    private String numero;
    private double solde;
    private Personne titulaire;
    private final List<PassageEnNegatifSubscriber> passageEnNegatifEvent;

    public Compte() {
        this.passageEnNegatifEvent = new ArrayList<>();
    }

    public Compte(String numero, Personne titulaire) {
        this();
        this.numero = numero;
        this.titulaire = titulaire;
    }

    // region GET/SET
    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        if (titulaire != null)
            this.titulaire = titulaire;
        else
            throw new RuntimeException();
    }
    // endregion

    // region METHODS

    @Override
    public void retrait(double montant) {
        retrait(montant, 0);
    }

    public void retrait(double montant, double limit) {
        if (montant <= 0) {
            throw new IllegalArgumentException("montant must be greater than 0");
        }
        if (montant > getSolde() + limit) {
            throw new SoldeInsufisantException();
        }
        boolean estPositif = this.solde >= 0;
        solde -= montant;
        if (estPositif && this.solde < 0) {
            raisePassageEnNegatifEvent();
        }
    }

    @Override
    public void depot(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("montant must be greater than 0");
        }
        solde += montant;
    }

    protected abstract double calculInteret();

    @Override
    public void appliquerInteret() {
        setSolde(getSolde() + calculInteret());
    }

    public void subscribePassageEnNegatifEvent(PassageEnNegatifSubscriber subscriber) {
        passageEnNegatifEvent.add(subscriber);
    }

    private void raisePassageEnNegatifEvent() {
        for (PassageEnNegatifSubscriber subscriber : passageEnNegatifEvent) {
            subscriber.execute(this);
        }
    }

    // endregion
}
