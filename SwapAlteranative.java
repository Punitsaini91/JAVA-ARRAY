public class SwapAlteranative {
    public static void main(String[] args) {
        int arr[]={9,3,6,12,4,32};
        for (int i=0;i<arr.length;i+=2){
            int temp  = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

        
    }
}
