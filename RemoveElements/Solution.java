package RemoveElements;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int a;
        int count=0;
        for (int i: nums){
            if(i==val){
                count++;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==val){
                
                for (int j=i+1;j<nums.length;j++){
                    if(nums[j]!=val){
                        a=nums[j];
                        nums[j]=val;
                        nums[i]=a;
                    }

                }
               
            }
        }
        return  nums.length-count;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] arr={3,2,2,3};
        int k=3;
        System.out.println(sol.removeElement(arr, k));
    }
}
