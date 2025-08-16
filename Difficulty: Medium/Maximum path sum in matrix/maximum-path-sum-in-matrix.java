// User function Template for Java
class Solution {
    int PathSum(int col,int row,int[][] mat,int[][] dp){
        if(row>=mat.length || col<0 || col>=mat[0].length)
        return Integer.MIN_VALUE;
        
        if (row == mat.length - 1) {
            return mat[row][col];
        }
        
        if(dp[row][col]!=0)
        return dp[row][col];
        
        int left=PathSum(col-1,row+1,mat,dp);
        int down=PathSum(col,row+1,mat,dp);
        int right=PathSum(col+1,row+1,mat,dp);
        
        
        dp[row][col]=mat[row][col]+Math.max(left,Math.max(down,right)); 
        return dp[row][col];
    }
    public int maximumPath(int[][] mat) {
        // code here
        int result=Integer.MIN_VALUE;
        int[][] dp=new int[mat.length][mat[0].length];
        for(int i=0;i<mat[0].length;i++)
        {
            result=Math.max(result,PathSum(i,0,mat,dp));
        }
        return result;
    }
}