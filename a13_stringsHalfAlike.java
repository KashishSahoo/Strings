public class a13_stringsHalfAlike {
    public static void main(String[] args) {
        //contains same count of vowels on both halves;
      //   String str="book";
      //   boolean ans=halvesAreAlike(str);
      //   System.out.println(ans);
    }
      @SuppressWarnings({ })
      class Solution {
         public boolean halvesAreAlike(String str) {
             int n=str.length();
          int h=-1;
          if(n%2==0){
             h=n/2;
          }
          else{
             h=(n/2)+1;
          }
          String s1=str.substring(0,h);
          String s2=str.substring(h,n);
     
          int n1=s1.length();
          int n2=s2.length();
     
          int c1=0;
          int c2=0;
     
          for(int i=0;i<n1;i++){
             if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' ||s1.charAt(i)=='o' || s1.charAt(i)=='u' 
             || s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' ||s1.charAt(i)=='O' || s1.charAt(i)=='U'){
              c1=c1+1;
             }
          }
          for(int i=0;i<n2;i++){
             if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' ||s2.charAt(i)=='o' || s2.charAt(i)=='u' || s2.charAt(i)=='A' || s2.charAt(i)=='E' || s2.charAt(i)=='I' ||s2.charAt(i)=='O' || s2.charAt(i)=='U'){
              c2=c2+1;
             }
          }
     
          if(c1==c2){
             return true;
          }
          return false;
         }
     }

   
}  
class Solution {
   public boolean halvesAreAlike(String str) {
       int n=str.length();
       int mid=n/2;
       int i=0;
       int j=mid;
       int cLeft=0;
       int cRight=0;
        
        while(i<n/2 && j<n){
           if(isVowel(str.charAt(i))) cLeft++;

           if(isVowel(str.charAt(j))) cRight++;

           i++;
           j++;
        }
        return cLeft==cRight;
   }

   public static boolean isVowel(char ch){
       return(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' 
            || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U');
   }
}



