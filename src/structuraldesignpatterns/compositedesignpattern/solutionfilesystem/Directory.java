package structuraldesignpatterns.compositedesignpattern.solutionfilesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    private List<FileSystem> list;

    public Directory(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        list.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println(name);
        for(FileSystem obj: list){
            obj.ls();
        }
    }
}
