public class Main {
    public static void main(String[] args) {
        Lesson_14_Maps lesson_14 = new Lesson_14_Maps();
        Lesson_15_Matrix_Stream lesson_15 = new Lesson_15_Matrix_Stream();

        //execute(lesson_14);
        execute(lesson_15);
    }

    public static void execute(Lesson lesson) {
        lesson.execute();
        lesson.display();
    }
}