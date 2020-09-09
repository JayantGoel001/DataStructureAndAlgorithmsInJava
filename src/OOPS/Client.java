package OOPS;

public class Client {
    public static void main(String[] args) {
        Human ck = new Human();
        System.out.println(ck.hands);
        ck.name = "Cormac Krum";
        ck.eat();

        Hostler kriti =new Hostler();
        kriti.party();
        kriti.party();
        kriti.party();
        kriti.party();
        kriti.party();
        kriti.party();
        System.out.println(kriti.money);

    }
}
