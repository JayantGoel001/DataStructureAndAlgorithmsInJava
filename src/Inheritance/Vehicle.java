package Inheritance;

public class Vehicle {
    protected int wheels;

    public void start(){
        System.out.println("Start Like general vehicle.");
        System.out.println(this.wheels);
    }
    Vehicle(int wheels){
        this.wheels = wheels;
    }
    Vehicle(){
        this.wheels = 2;
    }
}
