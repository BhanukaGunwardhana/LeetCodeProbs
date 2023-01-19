package ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int w=height.length;
        if(w<2 || w>Math.pow(10, 5)){throw new IllegalStateException();}
        for (int i: height){
            if(i<0 || i>Math.pow(10, 4)){throw new IllegalStateException();}
        }
        int area=0;
        for (int i=0;i<height.length;i++){
            for (int j=i+1;j<height.length;j++){
                int h=0;
                if(height[i]<=height[j]){h=height[i];}
                else{h=height[j];}
                if(area<h*(j-i)){area=h*(j-i);}

            }
        }
        return area;
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] height={1};
        System.out.println(sol.maxArea(height));
    }
}
