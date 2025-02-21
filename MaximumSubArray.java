public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            int max=nums[0], sum=nums[0];
            int n=nums.length;
            for(int i=1; i<n; i++){
                if(sum<0){
                    sum=0;
                }
                sum+=nums[i];
                max=Math.max(sum,max);
            }
            System.out.println(max);
        }
}
