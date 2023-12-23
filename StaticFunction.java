class Area {
	private int x;
	private static int y;
void fun1(){
	x=10;
	y=15;
}
void fun2(){
	System.out.println(x);
	System.out.println(y);
}
static void fun3(){
	System.out.println("This is static function of other class");
}
}
class StaticFunction {
static void fun1 (){
	System.out.println("same class function");
}
public static void main (String []args){
	Area a1 = new Area();
	Area a2 = new Area();
	System.out.println("For instance a1, running fun1 then fun2");
	a1.fun1();
	a1.fun2();
	System.out.println("For instance a2, running fun2 directly");
	a2.fun2();
	Area.fun3();
	fun1();
}
}