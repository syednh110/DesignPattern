package structuraldesignpatterns.flyweightdesignpattern;

import structuraldesignpatterns.flyweightdesignpattern.model.Developer;
import structuraldesignpatterns.flyweightdesignpattern.model.Employee;
import structuraldesignpatterns.flyweightdesignpattern.model.Tester;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static Map<String,Employee> map = new HashMap<>();



    public static Employee getEmployee(String role) throws Exception {
        Employee employee =map.get(role);
        if(employee==null){
            if(role.equals("Developer")){
                employee = new Developer();
                System.out.println("Developer created!");
            }
            else if(role.equals("Tester")){
                employee = new Tester();
                System.out.println("Tester created!");
            }
            else{
                throw new Exception("Wrong entry");
            }
            map.put(role,employee);
        }
        return employee;
    }
}
