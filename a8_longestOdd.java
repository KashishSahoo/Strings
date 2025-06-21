class a8_longestOdd{
    public static void main(String[] args) {
        String num="3597876";
        String ans=longestOdd(num);
        System.out.println(ans);
    }
    public static String longestOdd(String num){
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}