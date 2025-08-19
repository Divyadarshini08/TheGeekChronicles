class Solution {
  public:
    int maxWater(vector<int> &arr) {
        // code here
        int max=INT_MIN,sum=0,leftsum=0,index,rightsum=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        max=INT_MIN;
        for(int j=0;j<index;j++)
        {
            if(arr[j]>max)
            max=arr[j];
            
            leftsum=leftsum+abs(max-arr[j]);
        }
        max=INT_MIN;
        for(int j=arr.size()-1;j>index;j--)
        {
            if(arr[j]>max)
            max=arr[j];
            rightsum=rightsum+abs(max-arr[j]);
        }
        return leftsum+rightsum;
    }
};