package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100); //[100]
        numbers.add(100); //[100, 100]
        numbers.add(400); // //[100, 100, 400]
        numbers.add(300);
        numbers.add(200);

        System.out.println(numbers);
        System.out.println("numbers.size() = " + numbers.size()); // 5


        System.out.println("-----------Okay to modify----------");
        Iterator<Integer> numberIterator = numbers.iterator();
        while(numberIterator.hasNext()){
            Integer number = numberIterator.next();
            System.out.println(number);
            if (number.equals(400)){
                numberIterator.remove();
            }
        }

        System.out.println(numbers);

        System.out.println("---------For Print out - Not Modify------------");
        for (Integer number : numbers){
            System.out.println(number);

            if (number.equals(200)){
                //numbers.remove(3);
                int x = number;
                break;
                //numbers.remove(number); // throws exception: java.util.ConcurrentModificationException

            }

        }

        System.out.println(numbers);

        System.out.println("------------");
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}