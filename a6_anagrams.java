import java.util.Arrays;

public class a6_anagrams {
    public static void main(String[] args) {
        boolean ans = Anagrams("silent", "listen");
        System.out.println(ans);
    }

    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        int len = arr1.length;
        while (i < len && j < len) {
            if (arr1[i] != arr2[j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;

    }

    public static boolean Anagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        int freq[] = new int[26];
        int i = 0;
        int j = 0;
        int len = s1.length();
        while (i < len && j < len) {
            char ch1 = s1.charAt(i);
            int f1 = ch1 - 97;
            freq[f1] += 1;
            char ch2 = s2.charAt(i);
            int f2 = ch2 - 97;
            freq[f2] -= 1;

            i++;
            j++;
        }
        for (int k = 0; k < 26; k++) {
            if (freq[k] != 0) {
                return false;
            }

        }
        return true;
    }

}
