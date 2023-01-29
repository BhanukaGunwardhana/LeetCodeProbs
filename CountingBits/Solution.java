package CountingBits;

import java.util.Arrays;

public class Solution {
    public int[] countBits(int n) {
        int [] arr=new int [n+1];
        for (int i=0;i<=n;i++){
            int count=0;
            int j=i;
            while (j>=1){
                int rem = j%2;
                if(rem==1){
                    count++;
                }
                j=j/2;
            }
            arr[i]=count;
        }  
        return arr;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(Arrays.toString(sol.countBits(5)));
    }
}
