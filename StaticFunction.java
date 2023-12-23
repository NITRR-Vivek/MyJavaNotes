class Area {
	int x;
	private static int y;
void fun1(){
	x=10;
	y=15;
	System.out.println(x);
}
static void fun2(){
	System.out.println(y);
}}
class StaticFunction {
static void fun1 (){
	System.out.println("20");
}
public static void main (String []args){
	Area a1 = new Area();
	a1.fun1();
	Area.fun2();
	fun1();
}}