package CreationalDesignPatterns.FactoryDesign.after;

import CreationalDesignPatterns.FactoryDesign.allOS.Andriod;
import CreationalDesignPatterns.FactoryDesign.allOS.IOS;
import CreationalDesignPatterns.FactoryDesign.allOS.OS;
import CreationalDesignPatterns.FactoryDesign.allOS.Window;

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
