import java.util.Arrays;

public class StringIntro {
    public static void main(String[] args) {
        String person1 = "Cormac";
        String person2 = "Cormac";
        System.out.println(person1==person2);
        System.out.println(person1.equals(person2));


        String person3 = new String("Cormac");
        String person4 = new String("Cormac");
        System.out.println(person3==person4);
        System.out.println(person3.equals(person4));

        char[] ar = person1.toCharArray();
        System.out.println(Arrays.toString(ar));

        ar[0]='x';
        System.out.println(Arrays.toString(ar));
        String name = String.valueOf(ar);
        System.out.println(name);
        System.out.println(person1);
        System.out.println(person1.substring(2));
        System.out.println(person1.substring(2,4));
        System.out.println(person1.length());
        System.out.println("".isEmpty());
        System.out.println("   ".isBlank());
        String names = "Code For Cause";
        String[] a = names.split(" ");

        System.out.println(Arrays.toString(a));

        String temp = "I code for cause";
        System.out.println(temp.startsWith("I"));
        System.out.println(temp.endsWith("use"));
        System.out.println(temp.indexOf('c'));
        String sent = "Hey, I am Smart";
        for (char word: sent.toCharArray()) {
            System.out.print(word);
        }
        System.out.println();
        sent = "     "+sent+"     ";
        System.out.println(sent);
        sent = sent.strip();
        System.out.println(sent);

        System.out.println(sent.toUpperCase());
        sent = sent.replace('a','w');
        System.out.println(sent);
    }
}
