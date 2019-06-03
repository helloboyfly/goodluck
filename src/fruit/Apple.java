package fruit;

import java.util.Map;

public class Apple extends Fruit{


    @Override
    public void show_name(int num){
        System.out.println("Apple");
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Fruit apple  = new Fruit(); //generate a kind of new fruit
        //Fruit.show_name(1);
        apple.show_name(2);
        apple.fruitMap.put("qixia",1);
        apple.fruitMap.put("yantai",2);
        System.out.println(apple.fruitMap.getClass());
        }
}
