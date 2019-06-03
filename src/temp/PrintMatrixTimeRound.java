package temp;
import java.util.ArrayList;
public class PrintMatrixTimeRound {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(printMatrix(matrix));
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList array=new ArrayList();
        int ilow=0,jlow=0;
        int ihigh=matrix.length-1;
        int jhigh=matrix[0].length-1;
        if(ihigh==0){
            for(int k=0;k<=jhigh;k++){
                array.add(matrix[0][k]);
            }
            return array;
        }
        else if(jhigh==0){
            for(int k=0;k<=ihigh;k++){
                array.add(matrix[k][0]);
            }
            return array;
        }
        int i=0,j=0;
        while(i<=ihigh && j<=jhigh){
            if(ilow==ihigh){
                while(j<=jhigh){
                    array.add(matrix[i][j]);
                    j++;
                }
                return array;
            }else if(jlow==jhigh){
                while(i<ihigh){
                    array.add(matrix[i][j]);
                    i++;
                }
            }
            while(j<jhigh){
                array.add(matrix[i][j]);
                j++;
            }
            jhigh--;
            while(i<ihigh){
                array.add(matrix[i][j]);
                i++;
            }
            ihigh--;
            while(j>jlow){
                array.add(matrix[i][j]);
                j--;
            }
            jlow++;
            while(i>ilow){
                array.add(matrix[i][j]);
                i--;
            }
            ilow++;
            i++;
            j++;
        }
        return array;
    }
}