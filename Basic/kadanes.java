package Basic;
import java.util.*;
public class kadanes {
    public static void kadanesAl(int arr[]){
        int ms = Integer.MAX_VALUE;
        int cs =0;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if(cs<0){
                cs =0 ;
            }
            ms = Math.max(cs, ms);
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-9,10,4};
        kadanesAl(arr);

    }
}
