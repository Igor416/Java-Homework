import java.util.Random;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Lesson_16_Functional_Interfaces_2 implements Lesson {
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    LinkedList<Integer> evens = new LinkedList<Integer>();

    public Lesson_16_Functional_Interfaces_2() {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(25) + 1; i++) {
            numbers.add(random.nextInt(101));
        }
    }

    public void execute() {
        evens = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toCollection(LinkedList::new));
    }

    public void display() {
        System.out.println("Все числа: " + numbers);
        System.out.println("Только четные: " + evens);
    }
}
