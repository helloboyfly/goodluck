package Collection_tst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_test
{
    public static  void  main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(i+":"+list.get(i));
        }
        list.remove("c");
        System.out.println("after remove:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(i+":"+list.get(i));
        }
        list.set(2,"d");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str=(String) it.next();
            System.out.println(str);
        }
    }
}
