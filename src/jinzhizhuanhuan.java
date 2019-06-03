import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class jinzhizhuanhuan {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N=in.nextInt();
            int[] array=new int[N];
            for(int j=0;j<N;j++){// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                String str = in.next();
                int newint=0;
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                        newint+=(int)((str.charAt(i)-48)*pow(24,str.length()-1-i));
                    }
                    if(str.charAt(i)<='n'&&str.charAt(i)>='a'){
                        newint+=(int)((str.charAt(i)-87)*pow(24,str.length()-1-i));
                    }
                }
                array[j]=newint;
            }
            for (int k:array) {
                System.out.println(k);
            }

        }

}
