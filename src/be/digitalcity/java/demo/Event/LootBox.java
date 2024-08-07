package be.digitalcity.java.demo.Event;

import be.digitalcity.java.demo.interfaceFonctionelle.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LootBox {

    private final List<Action> actions = new ArrayList<>();

    public LootBox() {
        actions.add(() -> System.out.println("1 piece d'or"));
        actions.add(() -> System.out.println("10 piece d'or"));
        actions.add(() -> System.out.println("100 piece d'or"));
        actions.add(() -> System.out.println("1000 piece d'or"));
        actions.add(() -> System.out.println("10000 piece d'or"));
    }

    public void open(){

        Random rand = new Random();
        actions.get(rand.nextInt(actions.size())).execute();
    }

    public void subscribeAction(Action action){
        actions.add(action);
    }
}
