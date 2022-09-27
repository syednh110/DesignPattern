package CreationalDesignPatterns.AbstractDesignPattern;

public class LaptopFactory implements AbstractFactory{

    @Override
    public Device getGadget(String name) {
        if(name.equals("Dell")){
            return new Dell();
        }
        else if(name.equals("HP")){
            return new Hp();
        }
        else{
            return null;
        }
    }
}
