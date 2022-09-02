import java.util.*;
import java.util.Map.Entry;

public class Lesson_14_Maps implements Lesson {
    private HashMap<String, Boolean> allAnimals = new HashMap<String, Boolean>();
    private TreeMap<String, Boolean> predators = new TreeMap<String, Boolean>();
    private LinkedHashMap<String, Boolean> herbivores = new LinkedHashMap<String, Boolean>();

    public Lesson_14_Maps() {
        allAnimals.put("wolf", true);
        allAnimals.put("giraffe", false);
        allAnimals.put("lion", true);
        allAnimals.put("cat", true);
        allAnimals.put("cow", false);
        allAnimals.put("horse", false);
        allAnimals.put("sheep", false);
        allAnimals.put("tiger", true);
        allAnimals.put("fox", true);
        allAnimals.put("goat", false);
        allAnimals.put("mouse", false);
    }

    public void execute() {
        for (Entry<String, Boolean> entry : allAnimals.entrySet()) {
            if (entry.getValue()) {
                predators.put(entry.getKey(), true);
            } else {
                herbivores.put(entry.getKey(), false);
            }
        }
    }

    public void display() {
        String predator, herbivor;
        predator = "хищник";
        herbivor = "травоядный";
        
        System.out.println("Все животные:");
        for (Entry<String, Boolean> entry : allAnimals.entrySet()) {
            System.out.println(entry.getKey() + " - " + (entry.getValue() ? predator : herbivor));
        }
        System.out.println("\nХищники:");
        for (Entry<String, Boolean> entry : predators.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("\nТравоядные:");
        for (Entry<String, Boolean> entry : herbivores.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}