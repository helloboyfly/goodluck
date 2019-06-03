package Collection_tst;

import java.util.*;

public class Map_test {
    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("008","周同学");
        map.put("001","张同学");
        map.put("004","李同学");
        map.put("007","陈同学");
        map.put("003","王同学");

        Set<String> set=map.keySet();
        Iterator<String> it = set.iterator();//iterator sorted? WHY**********
        while(it.hasNext()){
            String str=(String) it.next();
            String name=(String) map.get(str);
            System.out.println(str+":"+name);
        }


        Map<String,String> map_tree=new TreeMap<>();
        map_tree.putAll(map);
        Set<String> set1=map.keySet();
        Iterator<String> it1 = set1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        Collection<String> coll1=map.values();
        Iterator<String> it_v1 = coll1.iterator();
        while(it_v1.hasNext()){
            System.out.println(it_v1.next());
        }

        System.out.println("##  HashMap  ##");
        Map<String , String> hm = new HashMap<String , String>();
        hm.put("1", "OOO");
        hm.put("3", "OOO");
        hm.put("2", "OOO");
        hm.put("5", "OOO");
        hm.put("4", "OOO");

        Iterator<String> it3 =  hm.keySet().iterator();

        while (it3.hasNext()) {
            System.out.println(it3.next());//strange!different from what says on the net
        }

    }


}
