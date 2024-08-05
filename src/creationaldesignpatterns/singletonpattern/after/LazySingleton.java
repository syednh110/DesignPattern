package creationaldesignpatterns.singletonpattern.after;

import creationaldesignpatterns.singletonpattern.before.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class  LazySingleton {
    private String companyName;
    private Employee employee;
    private static LazySingleton companySingleton= null;
//    List<Integer> var = new ArrayList<>();


    private LazySingleton(String companyName) {
        this.companyName = companyName;
        this.employee = new Employee("Syed","Male",11000);
    }

    public static synchronized LazySingleton getCompany(){
        if(companySingleton == null){
            companySingleton = new LazySingleton("Google");
        }
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        return companySingleton;
    }
}
