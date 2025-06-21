public class a2_allSubStrings {
    public static void main(String[] args) {
        printAllSubstr("abc");
    }
    public static void printAllSubstr(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
