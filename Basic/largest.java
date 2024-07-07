package Basic;

public class largest {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,8,6,5,3,1};
        System.out.println(getLargest(arr));

        
    }
    
}
