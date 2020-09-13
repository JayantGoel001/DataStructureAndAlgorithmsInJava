package String;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "abc";
        subsec("",str);
    }

    private static void subsec(String proc, String str) {
        if (str.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = str.charAt(0);
        subsec(proc,str.substring(1));
        subsec(proc+ch,str.substring(1));

    }
}
