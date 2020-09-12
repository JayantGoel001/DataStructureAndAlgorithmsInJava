package InheritanceAndAbstraction;

public class TeachersAssistance implements Student,Teacher{
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }

    @Override
    public void teach() {
        System.out.println("Teaching");
    }
}
