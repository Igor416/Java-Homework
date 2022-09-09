public class Main {
    public static void main(String[] args) {
        Lesson lesson_14 = new Lesson_14_Maps();
        Lesson lesson_15 = new Lesson_15_Matrix_Stream();
        Lesson lesson_16_1 = new Lesson_16_Functional_Interfaces_1();
        Lesson lesson_16_2 = new Lesson_16_Functional_Interfaces_2();

        //run(lesson_14);
        //run(lesson_15);
        //run(lesson_16_1);
        run(lesson_16_2);
    }

    public static void run(Lesson lesson) {
        lesson.execute();
        lesson.display();
    }
}