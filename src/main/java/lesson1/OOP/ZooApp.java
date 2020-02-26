package lesson1.OOP;

import java.util.ArrayList;

public class ZooApp {
    public static void main(String[] args) {
        Animal an = new Animal("noname");
        Dog an1 = new Dog("Jim");
        Cat an2 = new Cat("Blue",5);

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(an);
        animals.add(an1);
        animals.add(an2);

        for (Animal a: animals) {
            System.out.println(a);
        }
    }
}
