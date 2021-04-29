package nestedclasses;

import java.util.Iterator;

public class Slist {
    // static nested class
    // rejtett tipus!
    private static class Element{
        Object value;
        Element next;
        Element(Object value, Element next){
            this.value = value;
            this.next = next;
        }
        Element(Object value){
            this.value = value;
            // this.next = null;
        }
    }

    // non-static nested class
    // anonymous inner class

    public Iterator createIterator(){
        return new Iterator(){
            Element act = head;

            @Override
            public boolean hasNext() {
                return act != null;
            }

            @Override
            public Object next() {
                Object value = act.value;
                act = act.next;
                return value;
            }
        };
    }


    // listafej, implicit kezdoertek null - ures lista!
    private Element head;

    public void insertFirst(Object value){
        head = new Element(value, head);
    }
}
