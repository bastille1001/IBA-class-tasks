package tasks;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Task9Compare {

    static class Tuple{
        final Character ch;
        final List<Integer> list;

        Tuple(Character ch, List<Integer> list) {
            this.ch = ch;
            this.list = list;
        }
    }

    public static void main(String[] args) {
        String origin = "Hello world";
        HashMap<Character, List<Integer>> data = new HashMap<>();

        IntStream.range(0,origin.length()).forEach(i -> {
            char c = origin.charAt(i);
            List<Integer> positions = data.getOrDefault(c,new ArrayList<>());
            positions.add(i);
            data.put(c,positions);
        });

        ArrayList<Tuple> data2 = new ArrayList<>();

        data.forEach(new BiConsumer<Character, List<Integer>>() {
            @Override
            public void accept(Character c, List<Integer> list) {
                data2.add(new Tuple(c,list));
            }
        });

        Comparator<Tuple> comp1 = new Comparator<Tuple>() {
            @Override
            public int compare(Tuple tuple1, Tuple tuple2) {
                return tuple1.ch - tuple2.ch;
            }
        };

        Comparator<Tuple> comp2 = new Comparator<Tuple>() {
            @Override
            public int compare(Tuple tuple1, Tuple tuple2) {
                return tuple1.list.size() - tuple2.list.size();
            }
        };

        Comparator<Tuple> comp3 = new Comparator<Tuple>() {
            @Override
            public int compare(Tuple tuple1, Tuple tuple2) {
                return tuple1.list.get(0) - tuple2.list.get(0);
            }
        };

        Consumer<Tuple> printer = new Consumer<Tuple>() {
            @Override
            public void accept(Tuple t) {
                System.out.printf("Letter:%s, count:%d, pos:%s",
                        t.ch, t.list.size(), t.list);
            }
        };

        data2.sort(comp1);
        data2.forEach(printer);
        System.out.println("-----");

        data2.sort(comp2);
        data2.forEach(printer);
        System.out.println("-----");

        data2.sort(comp3);
        data2.forEach(printer);
        System.out.println("-----");
    }
}
