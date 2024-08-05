package structuraldesignpatterns.compositedesignpattern.filesystemgeneralapproach;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movies");

        Directory hollywoodDir = new Directory("Hollywood");
        Directory bollywoodDir = new Directory("BollyWood");

        File movieHollyWood = new File("BatMan");
        File movieBollyWood = new File("Tere Naam");

        hollywoodDir.add(movieHollyWood);
        bollywoodDir.add(movieBollyWood);

        directory.add(hollywoodDir);
        directory.add(bollywoodDir);
        directory.ls();
    }
}
