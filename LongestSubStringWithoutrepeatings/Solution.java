package LongestSubStringWithoutrepeatings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution{
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<0 || s.length()>5*Math.pow(10, 4)){throw new IllegalStateException();}
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String ss= sb.toString();
        Stack<Character> stack=new Stack<>();
        for (char i:ss.toCharArray()){
            stack.add(i);
        }
        Set<String>set=new HashSet<>(); 
        Map<Integer,String> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        StringBuffer appendingstring=new StringBuffer();
        while(!stack.isEmpty()){
            String check=String.valueOf(stack.peek());
            boolean f=false;
            boolean t=true;
            if(set.contains(check)==false ){
                f=true;
                char c=stack.pop();
                String holder=String.valueOf(stack.pop());
                set.add(holder);
                appendingstring.append(holder);
                if(stack.isEmpty()){t=false;}
                


            }
            if(f==false || t==false){
                String finalstr=appendingstring.toString();
                appendingstring.delete(0, appendingstring.length());
                list.add(finalstr.length());
                map.put(finalstr.length(), finalstr);
                set=null;
                set=new HashSet<>();


            }
        }
        Collections.sort(list);
        if(!list.isEmpty()){
            int largest=list.get(list.size()-1);
            return largest;
        }
       
        return 0;
        
    }
    public int lengthOfLongestSubstring_(String s){
        char [] charr=s.toCharArray();
       
        Map<Integer,String> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        StringBuffer appendingstring=new StringBuffer();
        for (int i=0;i<s.length();i++){
            Set<Character>set=new HashSet<>(); 
            StringBuffer sb=new StringBuffer();
            for (int j=i;j<s.length();j++){
                char c=charr[j];
                boolean f=false;
                boolean t=true;
                if(!set.contains(c)){
                    f=true;
                    set.add(c);
                    sb.append(c);
                    

                }
                if(f==false || j==s.length()-1){
                    String finalstr=sb.toString();
                    //System.out.println(finalstr);
                    //sb.delete(0, appendingstring.length());
                    list.add(finalstr.length());
                    break;

                }
                
            }
        }
        Collections.sort(list);
        if(!list.isEmpty()){
            int largest=list.get(list.size()-1);
            return largest;
        }
       
        return 0;

    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int i= sol.lengthOfLongestSubstring_("pwwkew");
        System.out.println(i);
    }
}