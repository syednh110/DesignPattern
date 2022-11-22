package StructuralDesignPatterns.CompositeDesignPattern.SolutionFileSystem;

import java.text.FieldPosition;

public class Main {

    public static void main(String[] args) {
        Directory moviesDir = new Directory("Movies");

        Directory hollyWood = new Directory("HollyWoodMovies");
        File movie2 = new File("SuperMan");
        hollyWood.add(movie2);
        Directory bollywood = new Directory("BollywoodMovies");
        File movie1 = new File("TereNaam");
        bollywood.add(movie1);


        moviesDir.add(hollyWood);
        moviesDir.add(bollywood);
        moviesDir.ls();


    }
}
