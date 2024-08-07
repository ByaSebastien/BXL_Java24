package be.digitalcity.java.demo.filter;

import be.digitalcity.java.demo.filter.interfaces.Predict;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = List.of("Pierre","Pol","Jacques");

        List<Integer> result = filter(integers,nb -> nb == 2 || nb == 3);

        result.forEach(System.out::println);

        List<String> resultString = filter(strings,(s) -> s.equals("Pierre"));

        resultString.forEach(System.out::println);


//        integers.stream()
//                .filter(i -> i % 2 == 0)
//                .toList()
//                .forEach(System.out::println);
    }

    public static List<Integer> filterEvenNumber(List<Integer> list) {

        List<Integer> filteredList = new ArrayList<>();
        for (int nb : list){
            if(nb % 2 == 0){
                filteredList.add(nb);
            }
        }
        return filteredList;
    }

    public static List<Integer> filterMoreThanFive(List<Integer> list) {

        List<Integer> filteredList = new ArrayList<>();
        for (int nb : list){
            if(nb > 5){
                filteredList.add(nb);
            }
        }
        return filteredList;
    }

    public static List<Integer> filterMoreLessFive(List<Integer> list) {

        List<Integer> filteredList = new ArrayList<>();
        for (int nb : list){
            if(nb < 5){
                filteredList.add(nb);
            }
        }
        return filteredList;
    }

    public static <T> List<T> filter(List<T> list,Predict<T> predict) {
        List<T> filteredList = new ArrayList<>();
        for (T value : list){
            if(predict.execute(value)){
                filteredList.add(value);
            }
        }
        return filteredList;
    }
}
