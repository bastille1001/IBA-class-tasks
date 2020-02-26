package lesson1.OOP;

public class Animal {

    String name;

    public Animal(String name) { this.name = name; }

    @Override
    public String toString() { return String.format("I`m animal, my name is %s", name); }
}
