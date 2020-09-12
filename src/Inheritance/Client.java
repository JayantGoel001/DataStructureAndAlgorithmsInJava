package Inheritance;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4);
        System.out.println(v1.wheels);
        Vehicle v2 = new Vehicle();
        System.out.println(v2.wheels);
    }
}
