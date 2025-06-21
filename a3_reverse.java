public class a3_reverse {
    public static void main(String[] args) {
       rev2("abcd");
    }
    public static void rev(String str){
        int n=str.length();
        String ans="";
        for(int i=0;i<n;i++){
           ans=str.charAt(i)+ans;
        }
        System.out.println(ans);
    }
    public static void rev2(String str){
        int n=str.length();
        StringBuilder ans=new StringBuilder(str);
        for (int i = 0; i < n/2; i++) {
            char f=ans.charAt(i);
            char l=ans.charAt(n-i-1);
            ans.setCharAt(i, l);
            ans.setCharAt(n-i-1, f);
        }
        System.out.println(ans.toString());
    }
    public static void rev3(String str){
        int n=str.length();
        char ans[]=str.toCharArray();
        for (int i = 0; i < n/2; i++) {
            char f=ans[i];
            char l=ans[n-i-1];
            ans[i]=l;
            ans[n-i-1]=f;
        }
        System.out.println(ans.toString());
    }
}


