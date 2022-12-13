package BehavioralDesignPatterns.TemplateMethodDesignPattern.SandWich;

public abstract class Sandwich {

    public void makeSandWich(){
        cutBun();
        if(customerWantMeat()){
            addmeat();
        }
        if(customerWantVeg()){
            addVegies();
        }
        if(customerWantCheese()){
            addCheese();
        }
        if(customerWantCondiments()){
            addCondiments();
        }
        wrapTheBun();
    }

    private void cutBun() {
        System.out.println("Bun is ready for SandWich");
    }

    public abstract void addmeat();
    public abstract void addVegies();
    public abstract void addCheese();
    public abstract void addCondiments();
    private boolean customerWantMeat() {
        return true;
    }
    private boolean customerWantVeg() {
        return true;
    }
    private boolean customerWantCheese() {
        return true;
    }
    private boolean customerWantCondiments() {
        return true;
    }

    private void wrapTheBun() {
        System.out.println("Sandwich is ready");
    }
}
