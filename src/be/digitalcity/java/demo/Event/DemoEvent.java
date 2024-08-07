package be.digitalcity.java.demo.Event;

import be.digitalcity.java.demo.interfaceFonctionelle.Action;

public class DemoEvent {
    public static void main(String[] args) {
        LootBox lootBox = new LootBox();

        String dante = "Dante";
        int lvl = 20;

        if(lvl == 20){
            lootBox.subscribeAction(() -> System.out.println("100000 piece d'or"));
        }
        for(int i = 0 ; i < 3; i++){
            lootBox.open();
        }

    }
}
