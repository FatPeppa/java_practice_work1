package practice_15_task2;

import practice_15_task1.Student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDB();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        System.out.println();
        controller.setEmployeeName("Gleb");
        controller.updateView();
        System.out.println();
        controller.setAmountOfWorkDays(controller.getAmountOfWorkDays() + 10);
        controller.updateView();
        System.out.println();
        controller.setSalaryPerDay(controller.getSalaryPerDay() * 2);
        controller.updateView();
        System.out.println();
    }

    public static Employee retriveEmployeeFromDB() {
        Employee emp = new Employee();
        String emp_name = "Ivan";
        int emp_salary_per_day = 1000;
        int emp_amount_of_work_days = 20;
        emp.setAmountOfWorkDays(emp_amount_of_work_days);
        emp.setName(emp_name);
        emp.setSalaryPerDay(emp_salary_per_day);
        return emp;
    }
}
