package Tutorial5;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final String ITERATION_2 = "\nIteration #2: ";
    private static final String ITERATION_1 = "\nIteration #1: ";

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));

        System.out.println(ITERATION_1);

        for(int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println(ITERATION_2);
        for(Integer value: numbers) {
            System.out.println(value);
        }

        List<String> values = new ArrayList<String>();
    }
    
}
