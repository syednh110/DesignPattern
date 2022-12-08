package StructuralDesignPatterns.FlyWeightDesignPattern.Model;

public class Tester implements Employee{
    private String skill;
    private String job;

    public Tester() {
        this.job = "Role of tester";
    }

    @Override
    public void addSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void job() {
        System.out.println(job + " Need to test "+ skill);
    }
}
