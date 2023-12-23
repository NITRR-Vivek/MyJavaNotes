class Area {
static void fun1(){
System.out.println("Static Function of other class");
}
static void fun2(){
System.out.println("Area 2");
}}
class StaticFunction {
static void fun1 (){
System.out.println("C");
}
public static void main (String []args){
Area.fun1();
Area.fun2();
fun1();
}}