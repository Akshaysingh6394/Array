package medium;

public class duplicremove {
    public static int duplicateRemove(int arr[])
    {
        int i =0;
        for(int j =1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,4,6,7,7,7,9,9,10};
        System.out.println(duplicateRemove(arr));
    }
    
}
