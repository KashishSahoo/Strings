import java.util.*;
class a15_isophorphic {
    public boolean isIsomorphic(String s1, String s2) {
         if (s1.length() != s2.length()) {
            return false; // Strings of different lengths cannot be isomorphic
        } 

        // Hash maps to track mappings from s1 to s2 and s2 to s1
        HashMap<Character, Character> mapS1ToS2 = new HashMap<>();
        HashMap<Character, Character> mapS2ToS1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check if ch1 is already mapped  
            if (mapS1ToS2.containsKey(ch1)) {
                // If mapped, ensure it maps to the same character in s2
                if (mapS1ToS2.get(ch1) != ch2) {
                    return false;
                }
            } else {
                // Map ch1 to ch2
                mapS1ToS2.put(ch1, ch2);
            }

            // Check if ch2 is already mapped
            if (mapS2ToS1.containsKey(ch2)) {
                // If mapped, ensure it maps to the same character in s1
                if (mapS2ToS1.get(ch2) != ch1) {
                    return false;
                }
            } else {
                // Map ch2 to ch1
                mapS2ToS1.put(ch2, ch1);
            }
        }

        return true; 
    }
}
