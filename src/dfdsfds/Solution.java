package dfdsfds;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] b={1,1,1,1};

        System.out.println(prefixesDivBy5(b).toString());
    }
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result=new ArrayList<>();
        System.out.println(A.length);
        for (int j:A
             ) {
            System.out.print(j+" ");
        }
        long x=0;
        for(int i=0;i<A.length;i++){
            x=(x<<1)+A[i];
            if((x%5)==0)
                result.add(true);
            else
                result.add(false);
            System.out.print(x+" ");
        }

        return result;
    }

}