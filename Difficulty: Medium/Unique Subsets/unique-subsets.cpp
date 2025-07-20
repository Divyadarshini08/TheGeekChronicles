class Solution {
  public:
    void uniqueSubset(int start,vector<int>& temp,vector<int>& arr,vector<vector<int>>& result){
        result.push_back(temp);
        for(int i=start;i<arr.size();i++){
            
            if(i>start && arr[i]==arr[i-1])
                continue;
                temp.push_back(arr[i]);
                
                uniqueSubset(i+1,temp,arr,result);
                
                temp.pop_back();
        }
    }
    vector<vector<int> > AllSubsets(vector<int> arr, int n) {
        vector<int> temp;
        vector<vector<int>> result;
        sort(arr.begin(),arr.end());
        uniqueSubset(0,temp,arr,result);
        return result;
    }
};