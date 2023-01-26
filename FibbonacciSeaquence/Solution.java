package FibbonacciSeaquence;

public class Solution {
    public void fibbonacci(int count){
        int i=0;
        int j=1;
        System.out.println(i);
        System.out.println(j);
        while(count>1){
            int k=i+j;
            i=j;
            j=k;
            System.out.println(k);

            count--;
        }
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        sol.fibbonacci(6);
    }
    
}
