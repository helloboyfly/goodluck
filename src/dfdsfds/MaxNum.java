package dfdsfds;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int groups=in.nextInt();
        System.out.println("groups:"+groups);

        for (int i = 0; i <groups ; i++) {
            System.out.println("group:"+i);
            int k=in.nextInt();
            System.out.println("k:"+k);
            int N=in.nextInt();

            System.out.println("N:"+N);
            int[] arr=new int[N];
            int j=0;
            while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

                arr[j++] = in.nextInt();
                System.out.print(arr[j-1]+" ");
                if(j==N){
                    break;
                }
            }

            //int[] exchange
        }
        System.out.println("ok");//result

    }
}
