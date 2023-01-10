package Java_Advanced.LeetCode.Happynumber;

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
        if(n<0 || n>Math.pow(2, 31)-1){throw new IllegalStateException();}
        
        
            String s="";
            s="0"+String.valueOf(n);
            
            
            
            int sum=0;
            for (char i: s.toCharArray()){
                String a=String.valueOf(i);
                int j=Integer.valueOf(a);

                sum=(j*j)+sum;
            }   if(this.set.contains(sum)){return false;}
                this.set.add(sum);
                
                if(sum==1){
                    return true;
                }
                
                
                else{

                    return isHappy(sum);
                }
            
            
            
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.isHappy(19)); 
    }
}