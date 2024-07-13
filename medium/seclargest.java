package medium;

public class seclargest {
    public static int secLargest(int arr[])
    {
        int largest = 1;
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
            {
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest = arr[i];
            }
        }   
        return slargest;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(secLargest(arr));
        
    }
    
}
