class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int res=Integer.MIN_VALUE;
        while(left<right){
          int currMax=Math.min(heights[left],heights[right])*(right-left);
          res=Math.max(currMax,res);
          if(heights[left]<heights[right]){
            left++;
          }else{
            right--;
          }
        }
    return res;
    }
}
