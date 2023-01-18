package LongestPalindromeSubString;

public class Solution {
    public String longestPalindrome(String s) {
        if(s.length()>1000 || s.length()<1){return null;}
        StringBuffer sbt=new StringBuffer(s);
        if(s.equals(sbt.toString())){return s;}
        char [] carr=s.toCharArray();
        int count=0;
        StringBuffer ls=new StringBuffer();
        for (int i=0;i<carr.length;i++){
            StringBuffer sb=new StringBuffer();
            for (int j=i;j<carr.length;j++){
                //if(carr[j]!=carr[i]){continue;}
                sb.append(carr[j]);
                if(carr[j]!=carr[i]){continue;}
                Boolean bool=true;
                for(char c:sb.toString().toCharArray()){
                    if(j==carr.length-1){bool=false;break;}
                    if(c!=carr[j] || carr[j]!=carr[j+1]){
                        bool=false;
                        break;
                    }
                }
                if(bool){continue;}
                StringBuffer rs=new StringBuffer(sb.reverse());
              
                
                sb.reverse();
               
                if(sb.toString().equals(rs.toString()) && rs.length()>count){
                    ls=new StringBuffer(sb);
                    count=sb.length();
                    

                }
            }
        }
        return ls.toString();
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    
}
