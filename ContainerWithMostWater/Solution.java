package ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int w=height.length;
        if(w<2 || w>Math.pow(10, 5)){throw new IllegalStateException();}
        for (int i: height){
            if(i<0 || i>Math.pow(10, 4)){throw new IllegalStateException();}
        }
        int area=0;
        int h=0;
        for (int i=0;i<height.length;i++){
            int l=0;
            int p=0;
            int width=0;
            for (int j=height.length-1;j>i;j--){
               if(l<height[j]){p=l;l=height[j];}
               if(l>height[j] ){continue;}
               if(height[i]<p){continue;}
                
                
                //if(height[i]<=height[j]){h=height[i];}
                //else{h=height[j];}
               // if(area<h*(j-i)){area=h*(j-i);}

                //area = Math.max(area, Math.min(height[i], height[j]) * (i-j));
                area=Math.max(area, Math.min(height[i], height[j])*(i-j));
            }
        }
        return area;
        
    }
    public int maxArea_(int [] height){
        int area=0;
        int i=0;
        int j= height.length-1;
        while(i<j){
            area=Math.max(area, Math.min(height[i], height[j])*(j-i));
            if(height[i]>height[j]){
                j--;
            }else{i++;}
        }
        return area;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] height={};
        System.out.println(sol.maxArea(height));
    }
}
