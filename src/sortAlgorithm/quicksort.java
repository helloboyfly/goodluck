package sortAlgorithm;

public class quicksort {
    public static void main(String[] args){
        int arr[]={46,30,82,90,56,17,95,15};
        //int[] data = new int[]{7,1,6,4,3,2,1,9,6,8,11,23};
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();

        quicksort.sort(arr);
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void sort(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            while(arr[right]>arr[left]){
                --right;
            }
            swap(arr[right],arr[left]);
            ++left;
            while(arr[left]<arr[right]){
                ++left;
            }
            swap(arr[right],arr[left]);
            --right;
        }


    }
    public static void swap(int a,int b){
        int temp=0;
        System.out.println(a+","+b);
        temp=a;
        a=b;
        b=temp;


    }


}
