package java3.homework.homework1;

import java3.homework.homework1.fruit.Apple;
import java3.homework.homework1.fruit.Orange;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(1);
        Orange orange = new Orange(1.5f);

        Box<Apple> b1 = new Box<Apple>();
        Box<Apple> b2 = new Box<Apple>();
        Box<Orange> b3 = new Box<Orange>();

        b1.add(apple);
        b1.moveTo(b2);
        if (b1.compare(b2) ){
            System.out.println("b1 = b2");
        }else if(b1.getWeight()> b2.getWeight()){
            System.out.println("b1 > b2");
        }else {
            System.out.println("b1 < b2");
        }
        b3.add(orange);

        if (b1.compare(b3) ){
            System.out.println("b1 = b3");
        }else if(b1.getWeight()> b3.getWeight()){
            System.out.println("b1 > b3");
        }else {
            System.out.println("b1 < b3");
        }




    }


    public void first()
    {

    }
}
