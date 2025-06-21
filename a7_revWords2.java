class a7_revWords2 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String arr[] = s.split(" "); // Split the string by spaces
        int n = arr.length;
        StringBuilder ans = new StringBuilder(); // Use StringBuilder for efficiency

        for (int i = 0; i < n; i++) {
            String r = rev(arr[i]); // Reverse each word
            ans.append(r); // Append the reversed word
            if (i != n - 1) { // Add a space between words (but not after the last word)
                ans.append(" ");
            }
        }

        return ans.toString();

    }
    public static String reverseWords2(String s) {
        char arr[]=s.toCharArray();
        int n = arr.length;
        int start=0;
        for(int end=0;end<=n;end++){
            if(end==n || arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
       return new String(arr);
    }

    public static void reverse(char arr[],int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static String rev(String str) {
        int n = str.length();
        char ans[] = str.toCharArray(); // Convert string to char array
        for (int i = 0; i < n / 2; i++) { // Reverse the char array
            char temp = ans[i];
            ans[i] = ans[n - i - 1];
            ans[n - i - 1] = temp;
        }
        return new String(ans);
    }
}