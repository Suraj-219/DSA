import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        // elements
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get elem
        int elem = list.get(0);
        System.out.println(elem);

        // add el in between
        list.add(1,1);
        System.out.println(list);

        // set el
        list.set(0,9);
        System.out.println(list);

        // delete
        list.remove(3);
        System.out.println(list);

    }
}
