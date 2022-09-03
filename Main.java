public class Main {
    public static void main(String[] args) {
        Lesson lesson_14 = new Lesson_14_Maps();
        Lesson lesson_15 = new Lesson_15_Matrix_Stream();

        //execute(lesson_14);
        execute(lesson_15);
    }

    public static void execute(Lesson lesson) {
        lesson.execute();
        lesson.display();
    }
}