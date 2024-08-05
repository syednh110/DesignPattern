package structuraldesignpatterns.flyweightdesignpattern.model;

public class Developer implements Employee{
    private String skill;
    private String job;

    public Developer() {
        this.job = "Role of developer";
    }

    @Override
    public void addSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void job() {
        System.out.println(job + " Need to develop "+skill);
    }
}
