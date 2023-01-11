package IsomorphicStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        String map1=isom(s);
        String map2=isom(t);
        
        
        System.out.println(map1);
        System.out.println(map2);

        if(map1.equals(map2)){return true;}
        else{return false;}


        
        
        


        
    }
    public String isom(String s){
        
        
        //char [] a=s.toCharArray();
        Map<String,String> map=new HashMap<>();
       
        
        Set<Character> set=new HashSet<>();
        for (char i: s.toCharArray()){
            set.add(i);
        }
        char [] arr=s.toCharArray();
        String r="";
        for (int i=0;i<s.length();i++){
            String sd ="";
            if(set.contains(arr[i])){
                for(int j=0;j<s.length();j++){
                    if(arr[i]==arr[j]){
                        sd=sd+String.valueOf(j);
                    }
                }
                map.put(String.valueOf(i), sd);
                r=r+","+sd;
                set.remove(arr[i]);
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        boolean bool =sol.isIsomorphic("foo", "brr");
        System.out.println(bool);
       
    }
}