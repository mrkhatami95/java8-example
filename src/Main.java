import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(new Student(Gender.MALE),new Student(Gender.FEMALE), new Student(Gender.FEMALE));
        list.stream()
            .filter(getPredicate())
            .collect(Collectors.toList());

        Function<Long, Long> adder = new MyFunction();
        Long result = adder.apply((long) 4);
        System.out.println("result = " + result);

        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

        // Using addThen() method
        composite1 = composite1.andThen(a -> 2 * a);

        // Printing the results
        System.out.println("Composite1 = " + composite1.apply(2, 3));

        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));

        Consumer<Integer> consumer = (value) -> System.out.println(value);
    }

    static Predicate<Student> getPredicate(){
        return p -> p.getGender().equals(Gender.MALE);
    }

}
