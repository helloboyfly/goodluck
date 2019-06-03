import java.util.Scanner;

/**
 * Scanner的简单示例
 * */
public class ddsfs {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCDLXXVI"));
    }
    public static int romanToInt(String s) {
        StringBuilder s1=new StringBuilder(s);
        s1.append('n');
        System.out.println(s1.charAt(1));
        int sum=0;
        char[] c =s1.toString().toCharArray();
        for (int i=0;i<c.length;i++) {

            switch (c[i]){
                case('M'):
                    sum+=1000;
                    break;
                case('D'):
                    sum+=500;
                    break;
                case('C'):{
                    if(c[i+1]=='M'){
                        sum+=900;
                        i++;
                        break;
                    }else if(c[i+1]=='D'){
                        sum+=500;
                        i++;
                        break;
                    }
                    sum+=100;
                    break;
                }
                case('L'):
                    sum+=50;
                    break;

                case('X'):{
                    if(c[i+1]=='L'){
                        sum+=40;
                        i++;
                        break;
                    }else if(c[i+1]=='C'){
                        sum+=90;
                        i++;
                        break;
                    }
                    sum+=10;
                    break;
                }
                case('V'):
                    sum+=5;
                    break;
                case('I'):{
                    if(c[i+1]=='V'){
                        sum+=4;
                        i++;
                        break;
                    }else if(c[i+1]=='X'){
                        sum+=9;
                        i++;
                        break;
                    }
                    sum+=1;
                    break;
                }
            }


        }
        System.out.println(c.length);
        return sum;
    }
}