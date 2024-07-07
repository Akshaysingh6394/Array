package Basic;

public class linears {
    public static int search(int numbers[] , int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = search(number, key);
        if (index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("index is at"+" "+index);
        }
    }
    
}
