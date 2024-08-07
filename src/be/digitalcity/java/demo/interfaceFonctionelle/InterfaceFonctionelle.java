package be.digitalcity.java.demo.interfaceFonctionelle;

import be.digitalcity.java.exo.oo.Personne;

import java.util.List;
import java.util.function.Consumer;

public class InterfaceFonctionelle {
    public static void main(String[] args) {

        Action action = new ActionImpl();

        action.execute();

        Action action2 = new Action() {
            @Override
            public void execute() {
                System.out.println("Je suis la classe anonyme");
            }
        };

        action2.execute();

        Action action3 = () -> {
            System.out.println("Je suis la methode anonyme");
        };

        action3.execute();

        test(action3);

        test(()-> System.out.println("Je suis la methode anonyme passé en param"));

        test((a) -> System.out.println("Coucou " + a));
        ActionGen<Personne> actionGen2 = p -> System.out.println(p);


        List<Action> actions = List.of(
                action,
                action2,
                () -> System.out.println("I'good yeah i'm feeling alright"));

        System.out.println("_____________________________");
        test(actions);

        ClassePerdue classePerdue = new ClassePerdue();

        classePerdue.action(() -> truc());
    }

    public static void test(Action action){
        action.execute();
    }

//    public  static void test(ActionGen<String> actionGen){
//        actionGen.execute("toto");
//    }

    public static void test(Consumer<String> consumer){
        consumer.accept("toto");
    }

    public static void test(List<Action> actions){
        for(Action action : actions){
            action.execute();
        }
    }

    private static void truc(){
        System.out.println("Je suis privé je ne peux etre utilisé que dans cette classe");
    }
}
