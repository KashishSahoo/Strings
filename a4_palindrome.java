public class a4_palindrome {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name="naMan";
        boolean ans=isPalindrome(name);
        System.out.println(ans);
    }
    static boolean isPalindrome(String string){
        String str=string.toLowerCase();
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
