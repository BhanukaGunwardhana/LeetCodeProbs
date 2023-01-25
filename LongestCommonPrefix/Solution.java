public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1 || strs.length>200){throw new IllegalStateException();}

        StringBuffer sb=new StringBuffer();
        var carr=strs[0].toCharArray();
        for (int i=0;i<carr.length;i++){
            sb=sb.append(carr[i]);
            int count=0;
            for (int j=1; j<strs.length;j++){
                if(strs[j].length()>200){throw new IllegalStateException();}
                if( (strs[j].length()-1)<i || !sb.toString().equals(strs[j].substring(0, i+1))  ){
                    
                    if(i==0){return "";}
                    return sb.delete(i, i+1).toString();
                   
                } ;
                count++;
            }

        }
        return sb.toString();


    } 
    public static void main(String[] args) {
        Solution sol=new Solution();
        String [] arr={"abcd","abc","ab"};
        System.out.println(sol.longestCommonPrefix(arr));
    }   
}
