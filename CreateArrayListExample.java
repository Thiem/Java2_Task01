package Task01;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args){
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");
        System.out.println(animals);
        animals.add(2,"elephant");
        System.out.println(animals);
    }
}
