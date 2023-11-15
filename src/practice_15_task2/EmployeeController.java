package practice_15_task2;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
        setSalary();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    private void setSalary() {
        model.setSalary(model.countSalary());
    }

    public void setAmountOfWorkDays(int amount_of_work_days) {
        model.setAmountOfWorkDays(amount_of_work_days);
        setSalary();
    }

    public int getAmountOfWorkDays() {
        return model.getAmountOfWorkDays();
    }

    public void setSalaryPerDay(int salary_per_day) {
        model.setSalaryPerDay(salary_per_day);
        setSalary();
    }


    public int getSalaryPerDay() {
        return model.getSalaryPerDay();
    }

    public void updateView() {
        view.printEmployeeDetails(model);
    }
}
