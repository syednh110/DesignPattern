package structuraldesignpatterns.compositedesignpattern.filesystemgeneralapproach;

public class File {
    public File(String name) {
        this.name = name;
    }

    private String name;

    public void ls() {
        System.out.println(name);
    }
}
