package MajorityElement2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int counter=nums.length/3;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        } 
       
        for (int i: set){
            int numcount=0;
            for (int j: nums){
                if(i==j){
                    numcount++;
                }
            }
            if(numcount>counter){
                list.add(i);
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] nums={3,2};
        System.out.println (sol.majorityElement(nums).toString());
    }
    
}
