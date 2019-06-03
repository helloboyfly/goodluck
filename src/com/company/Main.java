package com.company;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int readtime=6,size=0;
        float practice=2.5f;
        char a[]={'g','o','o','d'};
        String s=new String(a);
        System.out.println(s);
        System.out.println(s + "Hello World!");
        System.out.println("我每天花"+(readtime+practice)+"个小时读书");
        size=s.length();
        System.out.println(size);
        int index1=s.indexOf('o');
        System.out.println(index1);
        String str1="  Guten Morgen! Xiao Bing bing  ";
        System.out.println(str1);
        System.out.println(str1.length());
        String str2=str1.trim();
        System.out.println(str2);//Guten Morgen!
        System.out.println(str2.length());
        String[] newstr=str2.split(" ",2);
        for(int i=0;i<newstr.length;i++)
        {
            System.out.println(newstr[i]);
        }
        Date date=new Date();
        System.out.println(date);
        String time=String.format("%tc",date);
        String form=String.format("%tF",date);
        System.out.println(form);
        String formtime=String.format("%tT",date);
        System.out.println(formtime);
        //System.currentTimeMillis();

        /*  冒泡排序  */
        int array[]={4,3,5,2,1,6};
       /* int new_arr[]=array;
        for(int x:new_arr)
        {
            System.out.print(x);
        }
        for(int i=1;i<new_arr.length;i++)
        {
            for(int j=0;j<new_arr.length-i;j++)
            {
                if(new_arr[j]>new_arr[j+1])
                {
                    int temp=new_arr[j];
                    new_arr[j]=new_arr[j+1];
                    new_arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int x:new_arr)
        {
            System.out.print(x);
        }*/

        /*直接选择排序*/
        int new_arr[]=array;
        for(int i=0;i<new_arr.length-1;i++)
        {
            int index=0;
            for(int j=1;j<new_arr.length-i;j++)
            {

                if(new_arr[j]>new_arr[index])
                    index=j;

            }
            int temp=new_arr[index];
            new_arr[index]=new_arr[new_arr.length-1-i];
            new_arr[new_arr.length-1-i]=temp;
        }
        System.out.println("zhijie sort:");
        for(int x:new_arr)
        {
            System.out.print(x);
        }


    }
}
