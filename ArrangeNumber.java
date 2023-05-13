public class ArrangeNumber {

    public static void ArrangeNumbers(int arr[],int n){
        int left = 0;
        int right =n-1;
        int counter = 1;
        while(left<=right){
            if(counter%2!=0){
                arr[left]=counter;
                counter++;
                left++;
            }
            else{
                arr[right]=counter;
                counter++;
                right--;

            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[]=new int[n];
        ArrangeNumbers(arr,n);
        for(int i :arr){
            System.out.println(i);
        }
    }
    
}
