
public class a5_reverseWords {
    public static void main(String[] args) {
        String str = "   hello  world   Chant";
        String ans=reverseWords(str);
        System.out.println(ans);
    }
    public static String reverseWords(String str){
        String ans[] = str.split(" ");
        String res="";
        for (int i = ans.length-1; i >= 0; i--) {
           if(ans[i].length()==0){
           continue;
           } 
           if(res.length()==0){
            //1st word
            res+=ans[i];
           }else{
            //single space between two words
            res+=" "+ans[i];
           }
        }
        return res;
    }
    public static String reverseWords2(String str){
        String ans[] = str.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i = ans.length-1; i >= 0; i--) {
           if(ans[i].length()==0){
           continue;
           } 
           if(res.length()==0){
            res.append(ans[i]);
           }else{
            res.append(" ");
            res.append(ans[i]);
           }
        }
        return res.toString();
    }
    public static String reverseWords3(String str){
      
        StringBuilder res=new StringBuilder();
        int startIdx=str.length()-1;
        while (startIdx>=0) {
            while (startIdx>=0 && str.charAt(startIdx)==' ') {
                startIdx--;
            }
            if (startIdx<0) {
                break;
            }
            int endIdx=startIdx;
            while (startIdx>=0 && str.charAt(startIdx)!=' ') {
                startIdx--;
            }
            if (res.length()==0) {
                res.append(str.substring(startIdx+1, endIdx+1));
            }
            else{
                res.append(" ");
                res.append(str.substring(startIdx+1, endIdx+1));
            }

        }
        return res.toString();
       
    }
      // System.out.print("ans = [");
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.print("\"" + ans[i] + "\"");
        //     if (i < ans.length - 1) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");
}

