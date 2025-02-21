public class RotatedArrayMinFind {
    public static void main(String[] args) {
        int arr[] = {11,13,15,17};
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int min= Integer.MAX_VALUE;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }
        }
        System.out.println(min);
    }
}
