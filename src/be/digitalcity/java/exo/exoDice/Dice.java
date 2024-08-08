package be.digitalcity.java.exo.exoDice;

import java.util.*;
import java.util.stream.Stream;

public enum Dice {
    D4(4),
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int nbFaces;

    private Dice(int value) {
        this.nbFaces = value;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int roll(){
        Random rand = new Random();
        return rand.nextInt(this.getNbFaces()) + 1;
    }

    public int roll(int nbLance){
        int sum = 0;
        for (int i = 0; i < nbLance; i++) {
            sum += roll();
        }
        return sum;
    }

    public int roll(int nbLance, int nbToKeep){
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < nbLance; i++) {
            rolls.add(roll());
        }

//        rolls.sort(Collections.reverseOrder());
//
//        int sum = 0;
//        for (int i = 0; i < nbToKeep; i++) {
//            sum += rolls.get(i);
//        }
//
//        return sum;

        return rolls.stream()
                .sorted(Comparator.reverseOrder())
                .limit(nbToKeep)
                .mapToInt(it -> it)
                .sum();
    }
}
