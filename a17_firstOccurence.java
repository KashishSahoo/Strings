public class a17_firstOccurence {
    public static void main(String[] args) {
        String str="blissjoyssandjoy";
        String sub="joy";
        int idx=first(str,sub);
        System.out.println(idx);
    }
    public static int first(String str,String sub){
        int n=str.length();
        int len=sub.length();
        for(int i=0;i<=n-len;i++){
            String ans=str.substring(i, i+len);
            System.out.println(ans);
            if(ans.equals(sub)){
                return i;
            }
        }
        return -1;
    }

}
