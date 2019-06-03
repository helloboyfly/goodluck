package IOTest;

import java.io.*;

public class mytestio {
    public static void main(String[] args) throws IOException {
        File file=new File("E:/IOTest/mytest.txt");

        String string="hello world! test...Guten Morgen!";
        String string2 = "\n\r祝愿所有的老师教师节快乐！";
        Writer writer= new FileWriter(file,true);
        writer.write(string);
        writer.write(string2);
        writer.close();
//        FileOutputStream outputStream=new FileOutputStream(file);
//        String string="hello world! test...";
//        byte[] bs=string.getBytes();
//        outputStream.write(bs);
//        outputStream.close();

        Reader fileReader=new FileReader(file);

//        FileInputStream inputStream=new FileInputStream(file);
//        byte[] readbytes=new byte[1024];
//        inputStream.read(readbytes);
//        System.out.println(new String(readbytes));
//        inputStream.close();
        /*if(!file.exists()){
            file.createNewFile();
        }
        System.out.println("hi");*/

    }
}
