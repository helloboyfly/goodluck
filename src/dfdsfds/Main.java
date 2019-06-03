package dfdsfds;

import java.util.Scanner;
public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(minDistance(a,b));
//    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            int[] arr=new int[k];
            int i=0;
            int[] add=new int[k/2];
            while (i<k&&in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                arr[i] = in.nextInt();
                i++;
            }

            arr=sort(arr,0,arr.length-1);

            for (int j = 0; j <k/2 ; j++) {
                add[j]=arr[j]+arr[k/2-1-j];
            }
            for (int j = 0; j <add.length ; j++) {
                System.out.print(add[j]);
            }
            add=sort(add,0,add.length-1);
            System.out.println(add[k/2-1]-add[0]);
        }

    public static int[] sort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            sort(nums, low, mid);
            // 右边
            sort(nums, mid + 1, high);
            // 左右归并
            merge(nums, low, mid, high);
        }
        return nums;
    }


    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }


    public static int minDistance(String word1,String word2){
        int m=word1.length();
        int n=word2.length();
        if(word1.equals("")&&word2.equals(""))
            return 0;
        if(word1.equals("")&&!word2.equals(""))
            return word2.length();
        if(word2.equals("")&&!word1.equals(""))
            return word1.length();

        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            dp[i][0]=i;

        for(int i=0;i<=n;i++)
            dp[0][i]=i;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
            }

        }
        return dp[m][n];
    }
}
