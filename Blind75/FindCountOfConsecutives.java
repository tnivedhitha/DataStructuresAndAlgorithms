import java.util.Arrays;
public class FindCountOfConsecutives {

    public static void main(String[] args) {
        int arr[] = {1,0,1,2};
        System.out.println(new FindCountOfConsecutives().longestConsecutive(arr));
    }
        public int longestConsecutive(int[] nums) {
            Arrays.sort(nums);
            int max;
            int count;
            if (nums.length==0) {
                max=0;
                count=0;
            }
            else{
                count=1;
                max=0;
                for(int i=1;i<nums.length;i++){
                    if(nums[i]==nums[i-1]){
                        continue;
                    }
                    if(nums[i]-nums[i-1]==1){
                        count++;
                    }else{
                        max=Math.max(max,count);
                        count=1;
                    }
                }
            }
            return Math.max(max,count);
        }
    }
