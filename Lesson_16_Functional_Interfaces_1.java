import java.util.Random;
import java.util.function.Function;

public class Lesson_16_Functional_Interfaces_1 implements Lesson {
    private String s = "";
    private int len;
    private boolean contains;

    public Lesson_16_Functional_Interfaces_1() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100) + 1; i++) {
            s += (char)(random.nextInt(122 - 97) + 97); //random chars
        }
    }

    public void execute() {
        Function<String, Integer> getLen = s -> s.length();
        CheckString checkIfO = s -> s.contains("o");
        len = getLen.apply(s);
        contains = checkIfO.check(s);
    }

    public void display() {
        String yes, no;
        yes = "да";
        no = "нет";

        System.out.println(s);
        System.out.println("Длина строки: " + len);
        System.out.println("Есть ли 'o' в строке: " + (contains ? yes : no));
    }
}
