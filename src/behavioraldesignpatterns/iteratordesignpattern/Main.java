package behavioraldesignpatterns.iteratordesignpattern;

public class Main {
    public static void main(String[] args) {
        Collections collections = new Collections();
        Iterator iterator = collections.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
