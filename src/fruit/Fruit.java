package fruit;

import java.util.HashMap;
import java.util.Map;

public class Fruit {

    public Map<String,Integer> fruitMap = new HashMap<>();




    public void show_name(int num){
        System.out.println("Fruit: "+num);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Fruit apple  = new Apple(); //generate a kind of new fruit
        //Fruit.show_name(1);
        apple.show_name(2);


    }
}

