public class a9_lastWordLength {
    public static void main(String[] args) {
        String str = "  fly me to     the   moon Happy      ";
        // String ans=reverseWords(str);
        // String answer[]=ans.split(" ");
        // int len=answer[0].length();
        // System.out.println(len);
        int ans = last(str);
        System.out.println(ans);
    }

    public static int last(String str) {
        int i = str.length()-1;
        int len = 0;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && str.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }

    public static int last2(String str) {
        int i = str.length()-1;
        int len = 0;
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                if (len == 0) {
                    i--;
                } else {
                    break;
                }
            } else {
                len++;
                i--;
            }

        }

        return len;
    }
}
