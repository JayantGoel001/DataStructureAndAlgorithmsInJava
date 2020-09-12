package Polymorphism;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog dog = new Dog();
        dog.sound();

        Animal d = new Dog();
        d.sound();
    }
}
