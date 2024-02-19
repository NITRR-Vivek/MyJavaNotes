import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        hashMaps();
        treeMaps();
    }

    public static void hashMaps() {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Second", 20);
        hmap.put("First", 5);
        hmap.put("Third", 10);
        System.out.println("HashMap = " + hmap);

    }

    public static void treeMaps() {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Second", 20);
        tmap.put("First", 5);
        tmap.put("Third", 10);
        System.out.println("TreeMap = " + tmap);
        System.out.println("Value of First is: " + tmap.get("First"));
        System.out.println("Keys are : " + tmap.keySet());
        System.out.println("Values are : " + tmap.values());

    }

}
