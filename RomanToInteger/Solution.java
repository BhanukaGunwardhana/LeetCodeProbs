package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        char [] carr=s.toCharArray();
        //boolean check=true;
        Map<String,Integer> map=new HashMap<>();
        map.put("I",1 );
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100 );
        map.put("D",500);
        map.put("M",1000 );
        int count=0;

        for (int i=s.length()-1;i>=0;i--){
            if(i==s.length()-1){
                count=count+map.get((String.valueOf(carr[i])));
                continue;
            }
            if(map.get(String.valueOf(carr[i]))<map.get(String.valueOf(carr[i+1]))){
                //check=false;
                count=count-map.get(String.valueOf(carr[i]));
            }
            else{
                count=count+map.get(String.valueOf(carr[i]));
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.romanToInt("MCMXCIV"));
    }
}
