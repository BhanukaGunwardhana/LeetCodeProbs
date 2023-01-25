package ThreeSum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.xml.sax.HandlerBase;



public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // Set<List<Integer>>set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int k=i;
            int kcount=0;
            while(kcount<nums.length-3){
                int sum=nums[i];
                List<Integer> arr=new ArrayList<>();
                arr.add(i);
                int j=k;
                int count=0;
                while(count<2){
                    sum=sum+nums[j];
                    //sb.append(String.valueOf(j));
                    arr.add(j);

                    if(j>=nums.length-1){
                        j=j%nums.length-1;
                    }
                    else{
                        j++;
                    }
                    
                    count++;
                }
                /*for (int j=k;j<k+2;j++){
                    
                    sum=sum+nums[j];
                    //sb.append(String.valueOf(j));
                    arr.add(j);
                }*/
                if(sum==0){
                    boolean bool=true;
                    for (List<Integer> lst: list){
                        for (int value: lst){
                            if(!arr.contains(value)){
                                bool=false;
                            }

                        }
                    }
                    if(bool){
                        list.add(arr);
                    }
                    
                }
                if(k>=nums.length){
                    k=k%nums.length-1;
                }
                else{
                    k=k+1;
                }
                kcount++;
                

            }
            
        }
        return list;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] arr={-1,0,1,2,-1,-4};
        System.out.println(sol.threeSum(arr));
    }
}
