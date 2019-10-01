package part1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1
        HashSet<Object> hs1 = new HashSet<>(5);

        //2
        hs1.add("element1");
        hs1.add("element2");
        hs1.add(new Cat("Barsik", 5));
        hs1.add(new Cat("Vasya", 4));
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        printCollection(hs1);

        //3
        String[] names = new String[]{"Yehor", "Vasya", "Andrey", "Stepan", "Andrey", "Alice", "Yehor", "Nastya", "Inna", "Stepan"};

        //4
        HashSet<Object> hs2 = new HashSet<>(Arrays.asList(names));
        printCollection(hs2);

        //5
        HashSet<Object> hs3 = new HashSet<>(Arrays.asList(names));
        hs2.removeAll(hs3);
        printCollection(hs2);

        //6
        ArrayList<Object> al = new ArrayList<>(5);
        al.add("element1");
        al.add("element2");
        al.add(new Cat("Snejok", 3));
        al.add(1);
        al.add(2);
        al.add(3);

        //7
        printCollection(al);

        //8
        Iterator<Object> iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //9
        LinkedList<Object> ll = new LinkedList<>();
        ll.add("element1");
        ll.add("element2");
        ll.add(new Cat("Snejok", 3));
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3, new Cat("Matis", 7));

        //10
        printCollection(ll);
    }

    //2
    private static void printCollection(Collection<Object> collection) {
        System.out.println();
        collection.forEach(System.out::println);
        System.out.println();
    }
}
