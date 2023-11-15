package practice_15_task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Ivan");
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Igor");
        student.setRollNo("01");
        return student;
    }
}
