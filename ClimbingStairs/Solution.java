package ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        int mod=n%2;
        int div=n/2;
        int i;
        int sum=1;
        int r;
        if(mod==0){
            sum=sum+1;
            r=2;
        }
        else{
            r=1;
        }
        for (i=div+1;i<n;i++){
            int mul=1;
            int mulr=1;
            int mulri=1;
            
            for (int j=i;j>=1;j--){
                mul=mul*j;
            }
            for (int k=r;k>=1;k--){
                mulr=mulr*k;
            }
            for (int l=i-r;l>=1;l--){
                mulri=mulri*l;
            }
            r=r+2;
            sum=sum+(mul/(mulr*mulri));
        }
        return sum;

    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.climbStairs(7));
    }
}
