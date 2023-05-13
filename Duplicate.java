import java.util.Arrays;

public class Duplicate {
    public static int DuplicateArray(int[] inputArray){
        Arrays.sort(inputArray);
        int i = 1;
        while (i < inputArray.length) {
            if (inputArray[i] == inputArray[i-1]) {
                return inputArray[i];
            }
            i = i + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]  = { 5,1,2,3,4,2 };
        int r = DuplicateArray(arr);
        System.out.println(r);

    }
    
}
