package CreationalDesignPatterns.SingletonPattern.before;

public class Company {
    String nameCompany;
    public Employee employee;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
        this.employee = new Employee("Ali","Male",10000);
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", employee=" + employee +
                '}';
    }

    public Company getCompany(){
        return this;
    }
}
