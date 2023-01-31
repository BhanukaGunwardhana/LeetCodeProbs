package RemoveDuplicatesFromSortedArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
       
       
        int index=0;
        for (int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[index]=nums[i];
                index++;
            }
        }
       
        System.out.println(Arrays.toString(nums));
        return set.size();
    
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(nums));
        
    }
}
