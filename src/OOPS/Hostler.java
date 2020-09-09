package OOPS;

public class Hostler {
    int money = 10000;
    public void party(){
        if (money>=2000) {
            money -= 2000;
            System.out.println("Party Party");
        }
        else {
            System.out.println("No Party");
        }
    }

    public void getLoan(Hostler dost){
        if (dost.money>=500){
            dost.money -=500;
            this.money+=500;
        }
    }
}
