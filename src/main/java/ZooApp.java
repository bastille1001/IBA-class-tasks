public class ZooApp {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Murzik");
        Animal dog1 = new Dog("Jack");
        Cat cat = new Cat("Mikky");
        Dog dog = new Dog("Rex");

        cat1.print();
        dog1.print();
        cat.print();
        dog.print();

    }
}
