package java3.homework.homework1;

import java3.homework.homework1.fruit.Apple;
import java3.homework.homework1.fruit.Fruit;
import java3.homework.homework1.fruit.Orange;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    private final Class<T>  type;

    public Class<T> getType() {
        return type;
    }


    public Box(Class<T> type){
        this.type = type;
        fruits = new ArrayList<>();
    }


    public void add(T fruit){
        fruits.add(fruit);
    }

    public void moveTo(Box<T> otherBox){
        fruits.forEach(fruit -> otherBox.add(fruit));
    }

    public boolean compare(Box<? extends Fruit> otherBox){
        return otherBox.getWeight() == getWeight();
    }

    public  float getWeight(){
        float weight = 0;
        for(Fruit f:fruits){
            weight += f.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        if(getType()==Apple.class){
            return ("Box of Apples");
        }

        if(getType()== Orange.class){
            return ("Box of Oranges");
        }

        return  super.toString();
    }

}
