package StackIntro;

public class StackCustom {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>(15);
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        System.out.println("\n"+stack.peek()+"\n");
        System.out.println(stack.empty()+"\n");
        for (int i = 0; i < 15; i++) {
            System.out.println(stack.pop());
        }
        System.out.println("\n"+stack.empty());

        System.out.println("\nDynamic\n");
        DynamicStack<Integer> stack2 =new DynamicStack<Integer>();
        for (int i = 0; i < 20; i++) {
            stack2.push(i);
        }
        System.out.println("\n"+stack2.peek()+"\n");
        System.out.println(stack2.empty()+"\n");
        for (int i = 0; i < 20; i++) {
            System.out.println(stack2.pop());
        }
        System.out.println("\n"+stack2.empty());

    }
}
