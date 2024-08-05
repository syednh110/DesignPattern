package creationaldesignpatterns.factorypattern.after;

import creationaldesignpatterns.factorypattern.allOS.Andriod;
import creationaldesignpatterns.factorypattern.allOS.IOS;
import creationaldesignpatterns.factorypattern.allOS.OS;
import creationaldesignpatterns.factorypattern.allOS.Window;

public class OSfactory {

    OS getOS(String name){
        if(name.equals("open")){
            return new Andriod();
        }
        else if(name.equals("close")){
            return new IOS();
        }
        else{
            return new Window();
        }
    }
}
