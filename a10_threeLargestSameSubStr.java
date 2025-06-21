import java.util.ArrayList;

public class a10_threeLargestSameSubStr {
    public static void main(String[] args) {
        String ans = threeLargest("677714443");
        System.out.println(ans);
    }

    public static String threeLargest(String str) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = str.length();
        
        // Loop through the string, extracting substrings of length 3
        for (int i = 0; i <= n - 3; i++) {
            String s = str.substring(i, i + 3);
            boolean flag = true;
            
            // Check if all characters in the substring are the same
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) != s.charAt(j + 1)) {
                    flag = false;
                    break;
                }
            }
            
            // If all characters are the same, add the first character as an integer
            if (flag) {
                arr.add(s.charAt(0) - '0');
            }
        }

        // Find the maximum number from the list of valid substrings
        int max = -1;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Return the result as a string, or an empty string if no valid substrings
        return max == -1 ? "" : String.valueOf(max * 111); // 111 = "111" from three identical digits
    }
}

