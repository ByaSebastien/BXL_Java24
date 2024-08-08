package be.digitalcity.java.exo.carwash;

public class CarwashMain {

    public static void main(String[] args) {

        Carwash carwash = new Carwash();
        Voiture voiture = new Voiture("123");

        carwash.traiter(voiture);
        carwash.traiter(voiture);
    }
}
