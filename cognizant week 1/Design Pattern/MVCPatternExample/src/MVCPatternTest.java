public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", "101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Bob");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}