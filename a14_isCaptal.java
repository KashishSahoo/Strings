public class a14_isCaptal {
    public static void main(String[] args) {
        
    }

}
class Solution {
    public boolean detectCapitalUse(String str) {
        if (str.equals(str.toUpperCase())) {
            return true;
        }

        // Case 2: All letters are lowercase
        if (str.equals(str.toLowerCase())) {
            return true;
        }

        // Case 3: Only the first letter is uppercase
        if (Character.isUpperCase(str.charAt(0)) && str.substring(1).equals(str.substring(1).toLowerCase())) {
            return true;
        }

        // If none of the conditions are met, return false
        return false;
    }
}class Solutions {
    public boolean detectCapitalUse(String word) {
        if(check(word,'A','Z') || check(word,'a','z') || check(word.substring(1),'a','z')){
            return true;
        }
        return false;
    }
    public static boolean check(String word,char start,char end) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch < start || ch > end) {
                return false;
            }
        }
        return true;
    }
    class Solution {
        public boolean detectCapitalUse(String word) {
            int countCapitals=0;
    
             for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    countCapitals++;
                }
            }
            if(countCapitals==0) return true;
            if(countCapitals==word.length()) return true;
            if(countCapitals==1 && Character.isUpperCase(word.charAt(0)) ) return true;
    
            return false;
        }
    
    }

}