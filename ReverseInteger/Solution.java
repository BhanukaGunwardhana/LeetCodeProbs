package ReverseInteger;

import java.util.Stack;

public class Solution {
    public int reverse(int x) {
        int mul=1;
        int i=0;
        if(x<0){
            mul=-1;
            i=1;
        }
        char [] carr=String.valueOf(x).toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int j=i;j<carr.length;j++){
            stack.push(carr[j]);
        }
        int size=stack.size();
        int hold;
        double sum=0;
        
        while(!stack.isEmpty()){
            hold=Integer.valueOf(String.valueOf(stack.pop())); 
            var check=hold*(Math.pow(10, size-1));
            if(check<-Math.pow(2, 31) || check>Math.pow(2, 31)-1){
                return 0;
            }
            sum= (sum+ check);
            if(sum<-Math.pow(2, 31) || sum>Math.pow(2, 31)-1){
                return 0;
            }
            //System.out.println(sum);
            size--;

            
        }
        
        int v=(int) sum;
        v=mul*v;
        if(v<-Math.pow(2, 31) || v>Math.pow(2, 31)-1){
            return 0;
        }
        else{
            return v;
        }

        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.reverse(1534236469));
    }
}
//1534236469