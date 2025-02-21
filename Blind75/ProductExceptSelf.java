import java.util.Arrays;

public class ProductExceptSelf {
    public static void main (String[] args) {
        int [] arr  = {1,2,3,4};
        int [] result = new int[arr.length];
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]*arr[i-1];
        }
        int prevSuf=1;
        for(int i=arr.length-2;i>=0;i--){
            prevSuf=prevSuf*arr[i+1];
            result[i]=result[i]*prevSuf;
        }
        System.out.println(Arrays.toString(result));
    }
}
