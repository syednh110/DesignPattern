package CreationalDesignPatterns.FactoryPattern.after;

import CreationalDesignPatterns.FactoryPattern.allOS.Andriod;
import CreationalDesignPatterns.FactoryPattern.allOS.IOS;
import CreationalDesignPatterns.FactoryPattern.allOS.OS;
import CreationalDesignPatterns.FactoryPattern.allOS.Window;

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
