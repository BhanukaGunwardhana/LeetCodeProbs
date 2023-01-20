package IntegertoRoman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        //a,s,d,f
        //a-1000,s-100,d-10,f-1
        if(num<1 || num>3999){throw new IllegalStateException();}
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50,"L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

       

        int [] arr=new int [4];
        int count=0;
        int div=1000;
        int rem=num%div;
        while(count<4 && div>=1){
            arr[count]=num-(rem);
            count++;
            if(div>1){ div=div/10;}
           
            num=rem;
            rem=num%div;
        }
        //System.out.println(Arrays.toString(arr));
        StringBuffer sb=new StringBuffer();
        int div_=1000;
        
        for (int i:arr){
            String s="";
            
            
            if(i>=div_*10/2){

                int innernumitr=(i-(div_*10/2))/div_;
                if(i/div_==9){
                    s=map.get(div_)+map.get(div_*10);
                    sb.append(s);
                    
                    if(div_>1){
                    div_=div_/10;}
                    continue;
                }
                s=map.get(div_*10/2);
                for (int q=0;q<innernumitr;q++){
                    s=s+map.get(div_);
                }


            }
            else{
                int innernumitr=(i)/div_;
                if(i/div_==4){
                    s=map.get(div_)+map.get(div_*10/2);
                    sb.append(s);
                    
                    if(div_>1){
                    div_=div_/10;}
                    continue;

                }
                for (int q=0;q<innernumitr;q++){
                    s=s+map.get(div_);
                }
            }
            
        

        

        sb.append(s);
        //System.out.println(s);
        if(div_>1){
        div_=div_/10;}

        }
        return sb.toString();

        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println( sol.intToRoman(3));
    }
}
