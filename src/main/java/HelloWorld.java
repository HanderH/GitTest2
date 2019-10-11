import java.util.Arrays;

public class HelloWorld {

    public static  void insertSort(int[] arr){

       /* for(int i=1;i<arr.length;i++){

            int j = 0;
            for (j=i-1;j>=0;j--){
                if (arr[j]>arr[i]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = arr[i];
        }*/
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j;
            for(j = i-1;j>=0;j--){
                //将大于temp的数向后移动一步
                if(arr[j]>temp){
                    arr[j+1] = arr[j];//记录j的值也就是temp要插入的位置
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        int arr[] = {1,3,2,4};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
