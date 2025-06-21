import java.util.*;

class Solution {
    public boolean checkIfPangram(String str) {
        int n=str.length();
        if(n<26){
            return false;
        }
        HashSet<Character> chSet=new HashSet<>();
        for(int i=0;i<n;i++){
            chSet.add(str.charAt(i));
        }
        if(chSet.size()==26){
            return true;
        }
        return false;


    }
    class Solution2 {
        public boolean checkIfPangram(String str) {
              int[] arr = new int[26];
              int n=str.length();
              if(n<26){
                return false;
              }
            for (char ch : str.toCharArray()) {
                arr[ch - 'a']++;
            }
            for(int i=0;i<26;i++){
                if(arr[i]==0){
                    return false;
                }
            }
            return true;
        }
    }
    class Solution3 {
        public boolean checkIfPangram(String str) {
              int[] arr = new int[26];
              int count=0;
              int n=str.length();
              if(n<26){
                return false;
              }
             for (char ch : str.toCharArray()) {
                int idx=ch - 'a';
                if(arr[idx]==0){
                    arr[idx]++;
                    count++;
                }
            }
            if(count==26){
                return true;
            }
            return false;
           
        }
    }
}