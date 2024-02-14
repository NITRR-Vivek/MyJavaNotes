import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        SimpleHashSet();
        SimpleLinkedHashSet();
        SimpleTreeSet();
    }
    public static void SimpleHashSet(){
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(10);
        set.add(35);
        set.add(15);
        System.out.println("This is Simple HashSet: "+set +" <- Unique");
    }
    public static void SimpleLinkedHashSet(){
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();
        llset.add(5);
        llset.add(20);
        llset.add(10);
        llset.add(5);
        System.out.println("This is Simple LinkedHashSet: "+ llset+ " <- Ordered and Unique");
    }
    public static void SimpleTreeSet(){
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(20);
        tset.add(10);
        tset.add(6);
        tset.add(6);
        tset.add(15);
        System.out.println("This is Simple Tree Set: "+ tset+" <- Ordered, Sorted and Unique");
    }
}
