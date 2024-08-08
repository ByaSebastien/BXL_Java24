package be.digitalcity.java.exo.carwash;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Carwash {

    //   private final List<Consumer<Voiture>> myEvent = new ArrayList<>();
    private final List<ActionVoiture<Voiture>> myEvent = List.of(
            (v) -> System.out.println("Prepare la voiture " + v.getPlaque()),
            (v) -> System.out.println("Lave la voiture " + v.getPlaque()),
            (v) -> System.out.println("Seche la voiture " + v.getPlaque()),
            (v) -> System.out.println("Finalise la voiture " + v.getPlaque())
    );

    public void traiter(Voiture v) {

        myEvent.forEach((e) -> e.execute(v));

//        for(ActionVoiture<Voiture> a : myEvent){
//            a.execute(v);
//        }
    }
}
