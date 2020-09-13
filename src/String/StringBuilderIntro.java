package String;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append("-");
        }
        System.out.println(sb);

        String str = "Hello";
        substring(str);
        System.out.println(palindrome(str));

    }

    private static boolean palindrome(String str) {
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    private static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
