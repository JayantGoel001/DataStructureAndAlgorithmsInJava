package Inheritance;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4);
        System.out.println(v1.getWheels());
        Vehicle v2 = new Vehicle();
        System.out.println(v2.getWheels());
        Vehicle v3 = new Vehicle();
        v3.setWheels(10);
        System.out.println(v3.getWheels());
    }
}
