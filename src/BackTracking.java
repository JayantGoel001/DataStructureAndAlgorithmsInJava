public class BackTracking {
    public static void main(String[] args) {
        String word = "abc";
        StringBuilder proc = new StringBuilder("");
        StringBuilder unproc = new StringBuilder(word);
        subSequence(proc,unproc);
    }

    public static void subSequence(StringBuilder proc,StringBuilder unproc){
        if (unproc.toString().isEmpty()){
            System.out.println(proc);
        }
        else{
            char ch = unproc.charAt(0);
            unproc.delete(0,1);

            proc.append(ch);
            subSequence(proc,unproc);
            proc.delete(proc.length()-1,proc.length());

            subSequence(proc,unproc);
            unproc.insert(0,ch);
        }
    }
}
