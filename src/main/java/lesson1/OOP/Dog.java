package lesson1.OOP;

public class Dog extends Animal {

    public Dog(String name){ super(name); }

    @Override
    public String toString() { return String.format("I`m animal, my name is %s", name); }
}
