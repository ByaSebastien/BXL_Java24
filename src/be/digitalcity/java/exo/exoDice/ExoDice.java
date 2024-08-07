package be.digitalcity.java.exo.exoDice;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExoDice {

    public static void main(String[] args) {
//        List<String> possibleValue = List.of("D4","D6","D10","D20","D100");
//        System.out.println("Quel type de dé voulez-vous lancer?");
//        StringBuilder sb = new StringBuilder();
//        for(String s : possibleValue) {
//            sb.append(s).append(" | ");
//        }
//
//        String diceInput;
//        do {
//            System.out.println(sb);
//            diceInput = new Scanner(System.in).next();
//            if(!possibleValue.contains(diceInput.toUpperCase())){
//                System.out.println("Rentrez une valeur valide");
//            }
//        } while (!possibleValue.contains(diceInput.toUpperCase()));
//
//        Dice dice = Enum.valueOf(Dice.class, diceInput.toUpperCase());
//
//        int result = dice.roll();
//
//        System.out.println("Vous avez fait " + result);

        Dice.D6.roll(5,3);
    }

    public static int roll(Dice dice) {
        Random rand = new Random();
        return rand.nextInt(dice.getNbFaces()) + 1;
    }
}
