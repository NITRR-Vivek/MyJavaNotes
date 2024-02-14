import java.sql.SQLOutput;
import java.util.*;

class Lists {
     public static void main(String args[]){
         SimpleList2();
         SimpleArrayList();
         SimpleLinkedList();
         SimpleVector();
         SimpleStack();

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
         list.add(10);
         list.add(25);
         list.addFirst(9);
         list.add(2,20);
         System.out.println("This is Simple List: "+list);

    }
    public static void SimpleArrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(26);
        list.add(14);
        list.add(20);
        list.addLast(30);
        list.add(2,20);
        System.out.println("This is Simple Arraylist: " + list);

    }
    public static void SimpleLinkedList(){
         List<Integer> list = new LinkedList<Integer>();
         list.add(0,10);
         list.add(1,21);
         list.addFirst(15);
         list.add(10);
         System.out.println("This is Simple LinkedList: "+ list);
    }

    public static void SimpleVector() {
        Vector<String> vector = new Vector<>();
        vector.add("10");
        vector.add("5");
        vector.add("15");
        vector.add("5");
        System.out.println("This is Simple Vector: "+ vector);
    }

    public static void SimpleStack() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.push(5);
        stack.push(20);
        stack.addLast(10);
        System.out.println("This is Simple Stack: "+ stack);
        System.out.println("Top of the Stack is: "+ stack.peek());
        stack.pop();
        System.out.println("Modified Stack is: "+stack);
        System.out.println("Now top of the Stack is: "+ stack.peek());

    }

}


