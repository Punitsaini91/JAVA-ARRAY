import java.lang.reflect.Array;
import java.util.Arrays;

public class unique {
    public static int unique(int[] inputArray) {
        Arrays.sort(inputArray);

        int i = 0;
        while (i < inputArray.length) {
            if (inputArray[i] != inputArray[i + 1]) {
                return inputArray[i];
            }
            i = i + 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,6,3,6,2};
        int r=unique(arr);
        System.out.println(r);

    }

}
