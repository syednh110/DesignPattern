package CreationalDesignPatterns.AbstractDesignPattern;

public class MobileFactory implements AbstractFactory{

    @Override
    public Device getGadget(String name) {
        if(name.equals("Nokia")){
            return new NokiaMobile();
        }
        else if(name.equals("Lenovo")){
            return new LenovoMobile();
        }
        else{
            return null;
        }
    }
}
