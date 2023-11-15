package practice_18;

public class task2 {
    public static void main(String[] args) {
        GeneralTask2<String, Integer, task2> gt2 = new GeneralTask2<String, Integer, task2>("hello", new Integer(2), new task2());
        gt2.print_class_names();
    }
}

class GeneralTask2<T, V, K> {
    T t_temp;
    V v_temp;
    K k_temp;
    GeneralTask2(T t, V v, K k) {
        this.t_temp = t;
        this.v_temp = v;
        this.k_temp = k;
    }

    public K getK_temp() {
        return k_temp;
    }

    public T getT_temp() {
        return t_temp;
    }

    public V getV_temp() {
        return v_temp;
    }

    public void print_class_names() {
        System.out.println(t_temp.getClass().getName());
        System.out.println(v_temp.getClass().getName());
        System.out.println(k_temp.getClass().getName());
    }
}