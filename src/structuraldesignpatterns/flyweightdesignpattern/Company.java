package structuraldesignpatterns.flyweightdesignpattern;

import structuraldesignpatterns.flyweightdesignpattern.model.Employee;

import java.util.Random;

public class Company {
    public static String roles[] = {"Developer","Tester"};
    public static String skills[] = {"Java","React","Go","Python","Ruby"};
    public static void main(String[] args) throws Exception {

        for(int i=0;i<15;i++){
            Employee employee = EmployeeFactory.getEmployee(randomRole());
            employee.addSkill(randomSkill());
            employee.job();
        }

    }

    private static String randomSkill() {
        Random random = new Random();
        int index = random.nextInt(skills.length);
        return skills[index];
    }

    private static String randomRole() {
        Random random = new Random();
        int index = random.nextInt(roles.length);
        return roles[index];
    }
}
