import java.util.Random;
import java.util.Arrays;

public class Lesson_15_Matrix_Stream implements Lesson {
    int[][] matrix;
    int[] positives; // let 0 is also positive
    int[] negatives;

    public Lesson_15_Matrix_Stream() {
        Random random = new Random();
        matrix = new int[random.nextInt(9) + 2][random.nextInt(9) + 2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(101) - 50; //[-50; 50]
            }
        }
    }

    public void execute() {
        positives = Arrays.stream(matrix).flatMapToInt(Arrays::stream).filter(x -> x >= 0).toArray();
        negatives = Arrays.stream(matrix).flatMapToInt(Arrays::stream).filter(x -> x < 0).toArray();
    }

    public void display() {
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                /*
                every cell should be 3 chars long, so we add some
                */
                if (matrix[i][j] < 0) { //if int is negative that is already 1 char
                    if (matrix[i][j] > -10) { //if int is greater than -10 than we only add 1 whitespace
                        System.out.print(" ");
                    }
                    //else it is already 3 chars long
                } else {
                    if (matrix[i][j] > 10) { // if int is greater than 10, then it is 2 chars long, so we add only 1 whitespace
                        System.out.print(" ");
                    } else { // else it is 1 chars long, so we add 2 whitespaces
                        System.out.print("  ");
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nПоложительные числа:");
        for (int i = 0; i < positives.length; i++) {
            System.out.print(positives[i] + " ");
        }
        System.out.println("\nОтрицательные числа:");
        for (int i = 0; i < negatives.length; i++) {
            System.out.print(negatives[i] + " ");
        }
    }
}
