package IOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LogTest {
    public static void main(String[] args) throws IOException {
        File folder=new File("E:/IOTest/folder");
        if (!folder.exists()){
            folder.mkdir();
        }


        File file=new File("E:/IOTest/logTest.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str=bufferedReader.readLine();
        System.out.println(str);
        if(str.charAt(9)=='E'){
              String sub1=str.substring(0,8);
              String sub2=str.substring(15);
              String newstr=sub1+sub2;
              newstr.toUpperCase();
              System.out.println("*************"+newstr+"*************");
        }
        while (str!=null){
            str=bufferedReader.readLine();
            System.out.println(str);
            if(str.charAt(9)=='E'){
                String sub1=str.substring(0,8);
                String sub2=str.substring(15);
                String newstr=sub1+sub2;
                newstr.toUpperCase();
                System.out.println("*************"+newstr+"*************");
            }
        }
        bufferedReader.close();
        fileReader.close();
    }
}
