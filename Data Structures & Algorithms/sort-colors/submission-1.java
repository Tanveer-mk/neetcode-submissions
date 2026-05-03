class Solution {
    public void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int i = 0; i<n1; i++){
            lArr[i] = arr[i+low];
        }
        for(int i = 0; i<n2; i++){
            rArr[i] = arr[mid+i+1];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
                k++;
            }
            else if(rArr[j] <= lArr[i]){
                arr[k] = rArr[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
    }
}