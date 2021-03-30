package java3.homework.homework1;

import java3.homework.homework1.fruit.Apple;
import java3.homework.homework1.fruit.Orange;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(1);
        Orange orange = new Orange(1.5f);

        Box<Apple> b1 = new Box<Apple>(Apple.class);
        Box<Apple> b2 = new Box<Apple>(Apple.class);
        Box<Orange> b3 = new Box<Orange>(Orange.class);

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



        Box<?>[] array = {new Box<Apple>(Apple.class), new Box<Apple>(Apple.class), new Box<Orange>(Orange.class)};

        swap(array,0,2);
        System.out.println(Arrays.toString(array));
        List<Box> list = arrayToArrayList(array);
        System.out.println(list);


    }

// 1. Написать метод, который меняет два элемента массива местами.
    public static <Box> void swap(final Box[] arr, final int i, final int j) {
        Box tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

 // 2. Написать метод, который преобразует массив в ArrayList.
    public static <Box> List<Box> arrayToArrayList(final Box[] arr){
        return Arrays.asList(arr);
    }
}
