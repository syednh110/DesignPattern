package BehavioralDesignPatterns.IteratorDesignPattern;

public class Collections {
    String array[] = {"Ali","Syed","Namdar","Hussain"};

    public Iterator getIterator(){
        return new Itr();
    }

    private class Itr implements Iterator{
        private  int index = 0;
        @Override
        public boolean hasNext() {
            if(index<array.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}
