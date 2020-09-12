package InheritanceAndAbstraction;

public class Vehicle {
    private int wheels;

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

    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
}
