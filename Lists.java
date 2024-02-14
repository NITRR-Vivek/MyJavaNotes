import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Lists {
     public static void main(String args[]){
         System.out.println("This is Simple List:");
         SimpleList2();
         System.out.println("This is Simple Arraylist:");
         SimpleArrayList();
         System.out.println("This is LinkedList");
         SimpleLinkedList();

     }
//    public static void SimpleList1(){
//        List list = new ArrayList();
//        list.add(10);
//        list.add("Hello");
//        System.out.println(list);
//    }
    public static void SimpleList2(){
         List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(11);
         list.add(25);
         list.addFirst(9);
         list.add(2,20);
         System.out.println(list);

    }
    public static void SimpleArrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(26);
        list.add(14);
        list.add(21);
        list.addLast(30);
        list.add(2,20);
        System.out.println(list);

    }
    public static void SimpleLinkedList(){
         List<Integer> list = new LinkedList<Integer>();
         list.add(0,10);
         list.add(1,21);
         list.addFirst(15);
         System.out.println(list);
    }
}


