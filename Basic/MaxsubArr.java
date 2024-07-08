package Basic;

public class MaxsubArr {
    public static void maxSubArray(int arr[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum=0;
                for (int k = i; k < j; k++) {
                    currSum += arr[k];
                    
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
            
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        maxSubArray(arr);
    }
    
}