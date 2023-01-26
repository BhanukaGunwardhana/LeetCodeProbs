package PrimeNums;

public class Solution {
    public boolean isPrime(int i){
        if(i==0 || i==1){
            return false;
        }
        int count=0;
        for (int j=2;j<=i/2;j++){
            if(i%j==0){count++;break;}
        }
        if(count==0){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.isPrime(3));
    }
}
