package behavioraldesignpatterns.templatemethoddesignpattern.SandWich;

import java.util.Random;

public class VegSandWich extends Sandwich{
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    private boolean customerWantMeat() {
        return false;
    }
    private boolean customerWantCheese() {
        return false;
    }
    @Override
    public void addmeat() {}

    @Override
    public void addVegies() {
        String veg = chooseVeg(veggiesUsed);
        System.out.println(veg);
    }

    private String chooseVeg(String[] veggiesUsed) {
        Random random = new Random();
        int index = random.nextInt(veggiesUsed.length);
        return veggiesUsed[index];
    }

    @Override
    public void addCheese() {}

    @Override
    public void addCondiments() {
        String condiments = chooseCondiments(condimentsUsed);
        System.out.println(condiments);

    }

    private String chooseCondiments(String[] condimentsUsed) {
        Random random = new Random();
        int index = random.nextInt(condimentsUsed.length);
        return condimentsUsed[index];
    }
}
