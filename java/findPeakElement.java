class Solution {
    public static int findPeakElement(int[] nums) {
        int l=0,r=nums.length -1;
        while(l<r){
            int mid= l+(r-l)/2;

            if(nums[mid]>nums[mid+1]){//means num[mid] is large element than num[m+1] so it breaks the peak strick
                r=mid;
            }
            else{//that means that rigtj side has one more element that follows strick so avoid left nos
                l=mid+1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr= {5,10,20,15,12,90,10};
        int result;
        result= findPeakElement(arr);
        
        System.out.println(result);
    }
}