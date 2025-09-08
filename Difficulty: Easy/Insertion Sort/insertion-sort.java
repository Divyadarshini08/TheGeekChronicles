class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
         for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                
                j--;
            }
        }
    }
}