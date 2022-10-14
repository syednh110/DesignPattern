package CreationalDesignPatterns.SingletonPattern;

import CreationalDesignPatterns.SingletonPattern.after.LazySingleton;
import CreationalDesignPatterns.SingletonPattern.after.EagerSingleton;
import CreationalDesignPatterns.SingletonPattern.after.LazzyInnerClassSingleton;
import CreationalDesignPatterns.SingletonPattern.before.Company;

public class SingletonMain {

    public static void main(String[] args) {
        //Before Singleton
        Company company =new Company("TCS").getCompany();
        System.out.println(company);
        company.employee.nameEmployee = "Namdar";
        System.out.println(company);

        //After Singleton
        LazySingleton companySingleton = LazySingleton.getCompany();
        System.out.println(companySingleton.hashCode());
        LazySingleton companySingleton1 = LazySingleton.getCompany();
        System.out.println(companySingleton1.hashCode());

        LazzyInnerClassSingleton lazzyInnerClassSingleton = LazzyInnerClassSingleton.getInstance();
        System.out.println(lazzyInnerClassSingleton.hashCode());
        LazzyInnerClassSingleton lazzyInnerClassSingleton1 = LazzyInnerClassSingleton.getInstance();
        System.out.println(lazzyInnerClassSingleton1.hashCode());

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.hashCode());
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());
    }
}
