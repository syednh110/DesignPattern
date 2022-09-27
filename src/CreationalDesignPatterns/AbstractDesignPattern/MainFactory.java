package CreationalDesignPatterns.AbstractDesignPattern;

public class MainFactory {

    static AbstractFactory getFactoryType(String name){
        if(name.equals("LaptopFactory")){
            return new LaptopFactory();
        }
        else if(name.equals("MobileFactory")){
            return new MobileFactory();
        }
        else{
            return null;
        }
    }
}
