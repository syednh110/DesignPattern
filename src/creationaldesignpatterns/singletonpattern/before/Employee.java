package creationaldesignpatterns.singletonpattern.before;

public class Employee {

    public String nameEmployee;
    String gender;
    double salary;

    public Employee(String nameEmployee, String gender, double salary) {
        this.nameEmployee = nameEmployee;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
