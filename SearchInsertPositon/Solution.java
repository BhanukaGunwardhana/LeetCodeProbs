package SearchInsertPositon;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int dif=target-nums[0];
        int hold=0;
        int i;
        for (i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else{
                int localdif=target-nums[i];
                if(dif>=localdif && localdif>0){
                    dif=localdif;
                    hold=i;
                }
            }
        }
        return hold+dif;

    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] arr={1,3,5,6};
        int target=7;
        int v = sol.searchInsert(arr,target);
        System.out.println(v);
    }
}
