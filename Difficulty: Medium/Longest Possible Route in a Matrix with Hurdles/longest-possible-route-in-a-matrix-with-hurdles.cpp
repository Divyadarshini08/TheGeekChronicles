// User function Template for C++

class Solution {
  public:
    void backtrack(int& maxi,int count,int i,int j,vector<vector<int>>& grid,int xd,int yd){
        if(i==xd && j==yd)
        {
            maxi=max(maxi,count);
            return ;
        }
        
        int temp=grid[i][j];
        grid[i][j]=0;
        
        if(i+1<grid.size() && grid[i+1][j]!=0)
        backtrack(maxi,count+1,i+1,j,grid,xd,yd); //down
        
        if(j+1<grid[0].size() && grid[i][j+1]!=0)
        backtrack(maxi,count+1,i,j+1,grid,xd,yd); //right
        
        if(i-1>=0 && grid[i-1][j]!=0)
        backtrack(maxi,count+1,i-1,j,grid,xd,yd); //up
        
        if(j-1>=0 && grid[i][j-1]!=0)
        backtrack(maxi,count+1,i,j-1,grid,xd,yd); //left
        
        grid[i][j]=temp;
        
    }
    int longestPath(vector<vector<int>> matrix, int xs, int ys, int xd, int yd) {
        // code here
        if (matrix[xs][ys] == 0 || matrix[xd][yd] == 0)
            return -1;


        int maxi=-1;
        backtrack(maxi,0,xs,ys,matrix,xd,yd);
        return maxi;
    }
};