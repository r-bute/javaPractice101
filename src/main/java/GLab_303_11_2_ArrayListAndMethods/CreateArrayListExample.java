package GLab_303_11_2_ArrayListAndMethods;
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        //creating array list of string
        List<String> animals = new ArrayList<>();
        //adding new elements to an array list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //adding an element at particulkar index in an arrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
