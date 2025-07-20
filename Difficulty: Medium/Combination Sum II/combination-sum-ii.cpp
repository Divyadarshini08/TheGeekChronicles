// User function template for C++

class Solution {
  public:
    // Function to find all combinations of elements
    // in array arr that sum to target.
    void subset(int start,int target,vector<int>& arr,vector<int>& temp,vector<vector<int>> &result){
        if(target==0)
        {
            result.push_back(temp);
            return ;
        }
        
        for(int i=start;i<arr.size();i++){
            if (i > start && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            temp.push_back(arr[i]);
            subset(i+1,target-arr[i],arr,temp,result);
            temp.pop_back();
        }
    }
    vector<vector<int>> uniqueCombinations(vector<int> &arr, int target) {
        // Your code here
        vector<int> temp;
        vector<vector<int>> result;
        sort(arr.begin(), arr.end()); 
        subset(0,target,arr,temp,result);
        return result;
    }
};