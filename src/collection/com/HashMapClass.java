package collection.com;

        import java.util.Iterator;
        import java.util.LinkedHashMap;
        import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(99, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        for (Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry m = iterator.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        hm.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();

        hm.entrySet().stream().map(m -> m.getKey() + " " + m.getValue()).forEach(System.out::println);
        System.out.println();

    }
}
