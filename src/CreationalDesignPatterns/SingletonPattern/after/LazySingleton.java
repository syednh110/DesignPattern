package CreationalDesignPatterns.SingletonPattern.after;

import CreationalDesignPatterns.SingletonPattern.before.Employee;

public class LazySingleton {
    private String companyName;
    private Employee employee;
    private static LazySingleton companySingleton= null;


    private LazySingleton(String companyName) {
        this.companyName = companyName;
        this.employee = new Employee("Syed","Male",11000);
    }

    public static synchronized LazySingleton getCompany(){
        if(companySingleton == null){
            companySingleton = new LazySingleton("Google");
        }
        return companySingleton;
    }
}
