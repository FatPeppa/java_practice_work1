package practice_15_task1;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String new_student_name) {
        model.setName(new_student_name);
    }
    public String getStudentName() {
        return model.getName();
    }
    public void setStudentRollNo(String new_student_roll_no) {
        model.setRollNo(new_student_roll_no);
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    public void updateView() {
        view.printStudentDetails(model);
    }
}
