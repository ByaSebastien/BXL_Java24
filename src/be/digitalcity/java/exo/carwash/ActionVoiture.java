package be.digitalcity.java.exo.carwash;

@FunctionalInterface
public interface ActionVoiture<T> {

    void execute(T t);
}
