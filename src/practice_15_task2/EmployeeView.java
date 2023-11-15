package practice_15_task2;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Amount of work days: " + employee.getAmountOfWorkDays());
        System.out.println("Salary per day: " + employee.getSalaryPerDay());
    }
}
