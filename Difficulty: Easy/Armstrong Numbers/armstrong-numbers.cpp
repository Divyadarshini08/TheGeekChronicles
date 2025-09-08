// User function Template for C++
class Solution {
  public:
    bool armstrongNumber(int n) {
        // code here
        int x=n;
        int sum=0;
        while(x>0){
            int digi=x%10;
            sum+=(digi*digi*digi);
            x/=10;
        }
        
        if(n==sum)
        return true;
        else
        return false;
    }
};