class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
                int s=0,e=arr.length-1,result=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                result=mid;
                e=mid-1;
            }
            if(arr[mid]<k){
                s= mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return result;
    }
}