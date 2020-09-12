package Abstraction;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void sound() {
                System.out.println("WEEE-WEEEE");
            }
        };
        a.sound();
        Dog dog = new Dog();
        dog.sound();

        Animal d = new Dog();
        d.sound();
    }
}
