package CreationalDesignPatterns.FactoryPattern.allOS;

public class Window implements OS {
    @Override
    public void specification() {
        System.out.println("I am outdated OS that is window");
    }
}
