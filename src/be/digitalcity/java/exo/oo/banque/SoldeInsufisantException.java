package be.digitalcity.java.exo.oo.banque;

public class SoldeInsufisantException extends RuntimeException{

    public int statusCode = 404;

    public SoldeInsufisantException() {
        super("Solde insufisant");
    }

    public SoldeInsufisantException(String message) {
        super(message);
    }
}
