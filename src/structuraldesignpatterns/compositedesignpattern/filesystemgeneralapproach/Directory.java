package structuraldesignpatterns.compositedesignpattern.filesystemgeneralapproach;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> objectList;

    public Directory(String name) {
        this.name = name;
        this.objectList = new ArrayList<>();
    }


    public void ls(){
        System.out.println(name);
        for(Object obj: objectList){
            if(obj instanceof File){
                ((File)obj).ls();
            }
            if (obj instanceof Directory){
                ((Directory)obj).ls();
            }
        }
    }

    public void add(Object hollywoodDir) {
        objectList.add(hollywoodDir);
    }
}
