class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low<high){
            // code here
        int pIndex=partition(arr,low,high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            
            while(arr[j]>pivot && j>=low+1)
            {
                j--;
            }
            
            if(i<j){
                   int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        
        return j;
    }
}