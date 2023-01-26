package FibbonacciSeaquence;

public class SolutionWithRecurssion {
    int i=0;
    int j=1;
    int k;
    public void fibbonacci(int count){
        if(count==1){
            System.out.println(0);
            System.out.println(1);
        }
        if(count>1){
            k=i+j;
            i=j;
            j=k;
            System.out.println(k);
            count--;
            fibbonacci(count);
        }     
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        sol.fibbonacci(6);
    } 
}
