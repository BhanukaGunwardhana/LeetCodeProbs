package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solutaion {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new ArrayList<>();
       
        int i=0;
        int holder1;
        int holder2;
        while(i<nums.length){
            holder1=i;
            holder2=i;
            boolean bool=false;
            int j;
            for(j=i;j<nums.length-1;j++){
                if(nums[j+1]==nums[j]+1){
                    holder2=j+1;
                }
                else{
                    bool=true;
                    if(holder1==holder2){
                        String s=String.valueOf(nums[holder1]);
                        list.add(s);
                    }
                    else{
                        String s=String.valueOf(nums[holder1])+"->"+String.valueOf(nums[holder2]);
                        list.add(s);

                    }
                    i=j;
                    
                    break;
                }
                i=j;
            }
            if(bool==false){
                if(holder1==holder2){
                    String s=String.valueOf(nums[holder1]);
                    list.add(s);
                }
                else{
                    String s=String.valueOf(nums[holder1])+"->"+String.valueOf(nums[holder2]);
                    list.add(s);
                
                }
            }
            if(j==nums.length-1){
                break;
            }
            


            i++;
            
        }
        return list;

        

    }
    public static void main(String[] args) {
        Solutaion sol=new Solutaion();
        int [] arr={0,2,3,4,6,8,9};
        
        System.out.println(sol.summaryRanges(arr).toString());
    }
}
