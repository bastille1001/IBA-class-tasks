package lesson1.OOP;

public class Cat extends Animal {
    int age;

    public Cat(String name,int age){
        super(name);
        this.age = age;
    }

    @Override
    public String toString() { return String.format("I`m animal, my name is %s, my age is %d", name, age); }
}
