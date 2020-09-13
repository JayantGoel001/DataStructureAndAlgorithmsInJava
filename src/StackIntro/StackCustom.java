package StackIntro;

public class StackCustom {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i*i*i);
        }
        System.out.println("\n"+stack.peek()+"\n");
        System.out.println(stack.empty()+"\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
        System.out.println("\n"+stack.empty());

    }
}
