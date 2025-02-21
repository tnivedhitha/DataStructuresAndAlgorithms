import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,2,-4};
        int target=-1;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])&& map.get(target-arr[i])!=i){
               System.out.println(i+" "+map.get(target-arr[i]));
               break;
            }
        }
    }
}