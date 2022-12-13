package BehavioralDesignPatterns.TemplateMethodDesignPattern.SandWich;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = new VegSandWich();
        sandwich.makeSandWich();
    }
}
