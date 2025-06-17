class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[mid]<k){
                s= mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}