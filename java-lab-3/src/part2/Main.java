package part2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1
        Fruit[] array = new Fruit[]{
                new Fruit(true, 11),
                new Fruit(false, 52),
                new Fruit(true, 76),
                new Apple(true, 12, "delta", Apple.AppleColor.GREEN, 5),
                new Apple(false, 21, "redaris", Apple.AppleColor.RED, 4),
                new Fruit(false, 43),
                new Apple(true, 56, "dolce", Apple.AppleColor.YELLOW, 2),
                new Fruit(false, 43), //clone
                new Fruit(true, 31),
                new Apple(false, 21, "redaris", Apple.AppleColor.RED, 4) //clone
        };

        //2
        ArrayList<Fruit> arrayList = new ArrayList<>(Arrays.asList(array));
        SortedSet<Fruit> sortedSet = new TreeSet<>(Arrays.asList(array));

        SortedMap<Fruit, Integer> sortedMap = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            sortedMap.put(array[i], i);
        }

        //3
        System.out.println();
        System.out.println("arrayList");
        arrayList.forEach(System.out::println);

        System.out.println();
        System.out.println("sortedSet");
        sortedSet.forEach(System.out::println);

        System.out.println();
        System.out.println("sortedMap");
        sortedMap.forEach((k, v) -> System.out.println(k.toString() + " " + v.toString()));

        //4
        System.out.println();
        System.out.println("sorted arrayList");
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);

        //5
        int search = Collections.binarySearch(arrayList, new Fruit(true, 3.0f));
        System.out.println();
        System.out.println("Search result (false): " + search);
        search = Collections.binarySearch(arrayList, array[3]);
        System.out.println("Search result (true): " + search);

        //6
        System.out.println();
        System.out.println("Reverse sorted arrayList");
        Comparator<Fruit> comparator = (f1, f2) -> Float.compare(f2.price, f1.price);
        arrayList.sort(comparator);
        arrayList.forEach(System.out::println);

        //7
        System.out.println();
        System.out.println("Shuffle arrayList");
        Collections.shuffle(arrayList);
        arrayList.forEach(System.out::println);

        //8
        boolean value = sortedMap.containsValue(3);
        //9
        if (value) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }

        //10
        int i = 0;
        Iterator<Fruit> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }

        System.out.println();
        System.out.println("Removed arrayList");
        arrayList.forEach(System.out::println);

    }
}
