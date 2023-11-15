package practice_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}

class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    WaitList(Collection<E> c) {
        //List<E> list = c.stream().toList();
        content = new ConcurrentLinkedQueue<>(c);
    }
    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content.toString() +
                '}';
    }
}

class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;
    BoundedWaitList(int capacity) {
        super();
        if(capacity <= 0) throw new IllegalArgumentException("Capacity must be bigger than a zero!");
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            content.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content.toString() +
                '}';
    }
}

class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        boolean removed = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(!removed && el.equals(element)){
                removed = true; // i--
            }else{
                content.add(el);
            }
        }
        if(removed){
            content.add(content.remove());
        }
    }

    public void moveToBack(E element) {
        int prevSize = content.size();
        remove(element);
        if(content.size() < prevSize){
            content.add(element);
        }
    }
}

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("al2");
        al.add("al3");

        WaitList<String> wl = new WaitList<>();
        wl.add("wl");
        wl.add("wl2");
        wl.add("wl3");
        System.out.println(wl);
        System.out.println(wl.remove());
        System.out.println(wl);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains("wl"));
        System.out.println(wl.containsAll(al));

        System.out.println();

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("bwl");
        bwl.add("bwl2");
        bwl.add("bwl1");
        System.out.println(bwl);

        bwl.add("bwl3");
        System.out.println(bwl);
        System.out.println(bwl.getCapacity());

        bwl = new BoundedWaitList<String>(al.size());
        for (String s : al) {
            bwl.add(s);
        }
        System.out.println(bwl.getCapacity());
        bwl.add("bwl3");
        System.out.println(bwl);
        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(5);
        uwl.add(23);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(23);
        System.out.println(uwl);

    }
}
