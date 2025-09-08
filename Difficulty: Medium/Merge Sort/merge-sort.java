class Solution {
    void merge(int arr[],int l,int mid,int r){
        int left=l;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]>=arr[right])
            temp.add(arr[right++]);
            
            else
            temp.add(arr[left++]);
        }
        
        while(left<=mid)
        temp.add(arr[left++]);
        
        while(right<=r)
        temp.add(arr[right++]);
        
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r) return;
        mergeSort(arr,l,(l+r)/2);
        mergeSort(arr,((l+r)/2)+1,r);
        merge(arr,l,(l+r)/2,r);
    }
}