package practice_15_task2;

public class Employee {
    private String name;
    private int salary;
    private int amount_of_work_days;
    private int salary_per_day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAmountOfWorkDays() {
        return amount_of_work_days;
    }

    public void setAmountOfWorkDays(int amount_of_work_days) {
        this.amount_of_work_days = amount_of_work_days;
    }

    public int getSalaryPerDay() {
        return salary_per_day;
    }

    public void setSalaryPerDay(int salary_per_day) {
        this.salary_per_day = salary_per_day;
    }

    public int countSalary() {
        return this.amount_of_work_days * this.salary_per_day;
    }
}
