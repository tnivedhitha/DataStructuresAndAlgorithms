public class MaxProfitStock {
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        int profit=0;
        int minPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minPrice) {
                minPrice = arr[i];
            }
            else if(arr[i]-minPrice>profit){
                profit=arr[i]-minPrice;
            }
        }
        System.out.println(profit);

    }
}
