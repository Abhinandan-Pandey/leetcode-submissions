class Solution {
    public int maxArea(int[] heights) {
        int max = 0, i = 0, j = heights.length-1;
        while(i<j){
          int width = j - i;
          int height = Math.min(heights[i], heights[j]);
          int area = width * height;

          max=Math.max(area,max);
          if(heights[i]<heights[j]){
            i++;
          }else j--;
        }
        return max;
    }
}
